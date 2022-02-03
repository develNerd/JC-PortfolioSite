let config = {
  mode: 'production',
  resolve: {
    modules: [
      "node_modules"
    ]
  },
  plugins: [],
  module: {
    rules: []
  }
};

// entry
config.entry = {
    main: ["C:\\Users\\Farmerline\\Documents\\PortfolioSite\\build\\js\\packages\\PortfolioSite\\kotlin\\PortfolioSite.js"]
};

config.output = {
    path: "C:\\Users\\Farmerline\\Documents\\PortfolioSite\\build\\distributions",
    filename: (chunkData) => {
        return chunkData.chunk.name === 'main'
            ? "PortfolioSite.js"
            : "PortfolioSite-[name].js";
    },
    library: "PortfolioSite",
    libraryTarget: "umd",
    globalObject: "this"
};

// source maps
config.module.rules.push({
        test: /\.js$/,
        use: ["source-map-loader"],
        enforce: "pre"
});
config.devtool = 'source-map';

config.stats = config.stats || {}
Object.assign(config.stats, config.stats, {
    warningsFilter: [/Failed to parse source map/]
})


// Report progress to console
// noinspection JSUnnecessarySemicolon
;(function(config) {
    const webpack = require('webpack');
    const handler = (percentage, message, ...args) => {
        const p = percentage * 100;
        let msg = `${Math.trunc(p / 10)}${Math.trunc(p % 10)}% ${message} ${args.join(' ')}`;
        msg = msg.replace(new RegExp("C:\\Users\\Farmerline\\Documents\\PortfolioSite\\build\\js", 'g'), '');;
        console.log(msg);
    };

    config.plugins.push(new webpack.ProgressPlugin(handler))
})(config);

// noinspection JSUnnecessarySemicolon
;(function(config) {
    const tcErrorPlugin = require('kotlin-test-js-runner/tc-log-error-webpack');
    config.plugins.push(new tcErrorPlugin())
    config.stats = config.stats || {}
    Object.assign(config.stats, config.stats, {
        warnings: false,
        errors: false
    })
})(config);
// save evaluated config file
;(function(config) {
    const util = require('util');
    const fs = require('fs');
    const evaluatedConfig = util.inspect(config, {showHidden: false, depth: null, compact: false});
    fs.writeFile("C:\\Users\\Farmerline\\Documents\\PortfolioSite\\build\\reports\\webpack\\PortfolioSite\\webpack.config.evaluated.js", evaluatedConfig, function (err) {});
})(config);

module.exports = config

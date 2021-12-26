let config = {
  mode: 'development',
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
config.devtool = 'eval-source-map';

config.stats = config.stats || {}
Object.assign(config.stats, config.stats, {
    warningsFilter: [/Failed to parse source map/]
})


// dev server
config.devServer = {
  "open": true,
  "contentBase": [
    "C:\\Users\\Farmerline\\Documents\\PortfolioSite\\build\\processedResources\\js\\main"
  ]
};

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

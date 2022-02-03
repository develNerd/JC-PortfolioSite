{
  mode: 'production',
  resolve: {
    modules: [
      'node_modules'
    ]
  },
  plugins: [
    ProgressPlugin {
      profile: false,
      handler: [Function: handler],
      modulesCount: 500,
      showEntries: false,
      showModules: true,
      showActiveModules: true
    },
    TeamCityErrorPlugin {}
  ],
  module: {
    rules: [
      {
        test: /\.js$/,
        use: [
          'source-map-loader'
        ],
        enforce: 'pre'
      }
    ]
  },
  entry: {
    main: [
      'C:\\Users\\Farmerline\\Documents\\PortfolioSite\\build\\js\\packages\\PortfolioSite\\kotlin\\PortfolioSite.js'
    ]
  },
  output: {
    path: 'C:\\Users\\Farmerline\\Documents\\PortfolioSite\\build\\distributions',
    filename: [Function: filename],
    library: 'PortfolioSite',
    libraryTarget: 'umd',
    globalObject: 'this'
  },
  devtool: 'source-map',
  stats: {
    warningsFilter: [
      /Failed to parse source map/
    ],
    warnings: false,
    errors: false
  }
}
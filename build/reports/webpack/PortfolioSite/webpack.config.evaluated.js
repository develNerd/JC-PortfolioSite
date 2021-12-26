{
  mode: 'development',
  resolve: {
    modules: [
      'node_modules'
    ]
  },
  plugins: [
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
  devtool: 'eval-source-map',
  stats: {
    warningsFilter: [
      /Failed to parse source map/
    ],
    warnings: false,
    errors: false
  },
  devServer: {
    open: true,
    contentBase: [
      'C:\\Users\\Farmerline\\Documents\\PortfolioSite\\build\\processedResources\\js\\main'
    ]
  }
}
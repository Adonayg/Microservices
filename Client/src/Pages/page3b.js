import React, { Component } from 'react';
import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider';
import AppBar from 'material-ui/AppBar';

export default class Page3b extends Component {
  render() {
    return (
      <MuiThemeProvider>
      <div>
        <AppBar title="Prize" />
        <h2>{this.props.message}.</h2>
      </div>
      </MuiThemeProvider>
    );
  }
}
import React, { Component } from 'react';
import { currency, Winnner } from './../Constants';
import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider';
import AppBar from 'material-ui/AppBar';


export default class Page3a extends Component {
  render() {
    return (
      <MuiThemeProvider> 
      <div>
      <AppBar title="Prize" />
        <h2> {Winnner} {this.props.message} {currency}</h2>
      </div>
      </MuiThemeProvider>
    );
  }
}
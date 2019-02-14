import React, { Component } from 'react';
import ReactDOM from 'react-dom';
import { checkWinnerURL, makeAccountSuccessString , yourAccountNumber, EnterDraw, Loser} from './../Constants';
import Page3a from './page3a';
import Page3b from './page3b';
import Axios from 'axios';
import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider';
import AppBar from 'material-ui/AppBar';
import RaisedButton from 'material-ui/RaisedButton';

export default class Page2 extends Component {

    checkPrize = (event) => {
        event.preventDefault();
        Axios.get(checkWinnerURL + this.props.account)
            .then((response) => {
                if (response.data.winner) {
                    ReactDOM.render(<Page3a message={response.data.prize} />, document.getElementById("page3"))
                } else {
                    ReactDOM.render(<Page3b message={Loser} />, document.getElementById("page3"))
                }
            });
    }
    render() {
        return (
            <MuiThemeProvider>
            <div className="App" id="page3">
                <AppBar title={makeAccountSuccessString} />
                <h1>{makeAccountSuccessString}</h1> <br/>
                <h2>{yourAccountNumber}</h2> <br/>
                <h1>{this.props.account}</h1>
                <RaisedButton
                    label={EnterDraw}
                    primary={true}
                    onClick={this.checkPrize}
                />
            </div>
            </MuiThemeProvider>
        );
    }
}
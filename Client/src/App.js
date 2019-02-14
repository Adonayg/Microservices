import React, { Component } from 'react';
import './App.css';
import ReactDOM from 'react-dom';
import { makeAccountURL, Header, FirstName, LastName, Submit, EnterMessage } from './Constants';
import Page2 from './Pages/page2';
import Axios from 'axios';
import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider';
import AppBar from 'material-ui/AppBar';
import TextField from 'material-ui/TextField';
import RaisedButton from 'material-ui/RaisedButton';

class App extends Component {
  constructor(props) {
    super(props);

    this.state =
      {
        accountNumber: ""
      }
  }

  createAccount = (event) => {
    Axios.post(makeAccountURL, {
      firstName: document.getElementById('txtFName').value,
      lastName: document.getElementById('txtLName').value
    })
      .then((response) => {
        console.log(response.data);
        this.setState({
          accountNumber: response.data.accountNumber
        });
        ReactDOM.render(<Page2 account={this.state.accountNumber}  />, document.getElementById('page2'));
      });
  }

  validateForm = () => {
    var fName = document.forms["theForm"]["txtFName"];
    var lName = document.forms["theForm"]["txtLName"]
    var reC = (/^[a-zA-Z]+$/);
    if (fName.value === "" || !(fName.value.match(reC))) {
      document.getElementById('errorMessage').innerHTML = "Enter Valid First Name"
      return false;
    }
    if (lName.value === "" || !(lName.value.match(reC))) {
      document.getElementById('errorMessage').innerHTML = "Enter Valid Last Name"
      return false;
    } else {
      return true;
    }
  }

  addPerson = () => {
    if (this.validateForm() === true) {
      this.createAccount();
    }
  }

  render() {
    return (
      <MuiThemeProvider>
        <React.Fragment>
        <AppBar title={Header} />
        <h5>{EnterMessage}</h5>
        <form name="theForm">
          <TextField
            id="txtFName"
            hintText="Enter Your First Name"
            floatingLabelText={FirstName}
          />
          <br />
          <TextField
            id="txtLName"
            hintText="Enter Your Last Name"
            floatingLabelText={LastName}
          />
        </form>
        <br />
        <p id='errorMessage'></p>
      <RaisedButton
            label={Submit}
            primary={true}
            onClick={this.addPerson}
          />
          </React.Fragment>
      </MuiThemeProvider>
    );
  }
}

export default App;

import React from 'react';
import {View} from 'react-native';
import {Container,Header,Title,Content,Button,Left,Right,Body,Icon,Text} from 'native-base';

export default class Profile extends React.Component {
    render() {
      return (
        
        <Container>
        <Header>
          {/* <Left /> */}
          <Body>
            <Title>Kesfet</Title>
          </Body>
          {/* <Right /> */}
        </Header>
        <Content>
          <Text>
            Prifil Ekrani
          </Text>
        </Content>
        
      </Container>
      );
    }
  }


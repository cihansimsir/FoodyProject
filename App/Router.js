import HomeScreen from './Screens/HomeScreen';
import DetailsScreen from './Screens/DetailsScreen';
import NotificationScreen from './Screens/NotificationScreen';
import ProfileScreen from './Screens/ProfileScreen';
import LoginScreen from './Screens/LoginScreen';
import SignUpScreen from './Screens/SignUpScreen';
import {createStackNavigator,createAppContainer,createBottomTabNavigator,createSwitchNavigator} from 'react-navigation';
import Ionicons,{HomeIconWithBadge,} from 'react-native-vector-icons/Ionicons';
import React from 'react';
import FoodyScreen from './Screens/FoodyScreen';


// export const RootStack = createStackNavigator(
//     {
//       Home: HomeScreen,
//       Details: DetailsScreen,
//     },
//     {
//       initialRouteName: 'Home',
//     }
//   );
const HomeStack = createStackNavigator({
    
    Home: HomeScreen,
    Foody: FoodyScreen
},
{
    headerMode: 'none',
    navigationOptions: {
      headerVisible: false,
    }
  })
const LoginStack = createStackNavigator({
  Login: LoginScreen,
  SignUp: SignUpScreen,
},
{
  headerMode: 'none',
  navigationOptions: {
    headerVisible: false,
  }
})

const TabNavigator = createBottomTabNavigator({
    Home: HomeStack,
    Details: DetailsScreen,
    Notification: NotificationScreen,
    Profile: ProfileScreen,
   
  },
  {
    headerMode: 'none',
    navigationOptions: {
      headerVisible: false,
    }
  }
  );

export const SwitchNavigator = createSwitchNavigator({

  Login: LoginStack,
  HomeTab: TabNavigator,
  
})


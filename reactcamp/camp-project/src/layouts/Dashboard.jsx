import React from 'react'
import { Button, Icon, Label } from 'semantic-ui-react'
import Navi from './Navi'
import Categories from './Categories'
import ProductList from '../pages/ProductList'
export default function Dashboard() {
    return (
        <div>
            {/* <Button as='div' labelPosition='right'>
      <Button color='red'>
        <Icon name='heart' />
        Like
      </Button>
      <Label as='a' basic color='red' pointing='left'>
        2,048
      </Label>
    </Button>
    <Button as='div' labelPosition='right'>
      <Button basic color='blue'>
        <Icon name='fork' />
        Fork
      </Button>
      <Label as='a' basic color='blue' pointing='left'>
        2,048
      </Label>
    </Button> */}

   <Navi></Navi>
   <Categories></Categories>
  <ProductList></ProductList>

        </div>
    )
}

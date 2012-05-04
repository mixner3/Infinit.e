/*******************************************************************************
 * Copyright 2012, The Infinit.e Open Source Project.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package com.ikanow.infinit.e.shared.control
{
	import com.ikanow.infinit.e.shared.control.base.InfiniteController;
	import com.ikanow.infinit.e.shared.event.UserEvent;
	import com.ikanow.infinit.e.shared.model.manager.UserManager;
	import com.ikanow.infinit.e.shared.model.vo.User;
	import com.ikanow.infinit.e.shared.model.vo.ui.ServiceResult;
	import com.ikanow.infinit.e.shared.service.user.IUserServiceDelegate;
	import mx.rpc.events.ResultEvent;
	
	/**
	 * User Controller
	 */
	public class UserController extends InfiniteController
	{
		
		//======================================
		// public properties 
		//======================================
		
		[Inject]
		public var userServiceDelegate:IUserServiceDelegate
		
		[Inject]
		public var userManager:UserManager;
		
		
		//======================================
		// public methods 
		//======================================
		
		[EventHandler( event = "UserEvent.RESET" )]
		/**
		 * Reset User
		 * @param event
		 */
		public function resetUser( event:UserEvent ):void
		{
			userManager.reset();
		}
		
		[EventHandler( event = "UserEvent.GET_USER" )]
		/**
		 * Get User
		 * @param event
		 */
		public function getUser( event:UserEvent ):void
		{
			executeServiceCall( "UserController.getUser()", event, userServiceDelegate.getUser( event ), getUser_resultHandler, defaultFaultHandler );
		}
		
		/**
		 * Get User Result Handler
		 * @param event
		 */
		public function getUser_resultHandler( event:ResultEvent ):void
		{
			if ( verifyServiceResponseSuccess( "getUser()", event.result as ServiceResult ) )
				userManager.setCurrentUser( ServiceResult( event.result ).data as User );
		}
	}
}
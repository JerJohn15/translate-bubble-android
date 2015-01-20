/*
 * Copyright (C) 2015 47 Degrees, LLC http://47deg.com hello@47deg.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.fortysevendeg.translatebubble.modules

import com.fortysevendeg.translatebubble.modules.analytics.AnalyticsServicesComponent
import com.fortysevendeg.translatebubble.modules.clipboard.{ClipboardServicesComponent, ClipboardServices}
import com.fortysevendeg.translatebubble.modules.notifications.{NotificationsServicesComponent, NotificationsServices}
import com.fortysevendeg.translatebubble.modules.persistent.{PersistentServicesComponent, PersistentServices}
import com.fortysevendeg.translatebubble.modules.translate.{TranslateServicesComponent, TranslateServices}

trait ComponentRegistry
    extends ClipboardServicesComponent
    with PersistentServicesComponent
    with TranslateServicesComponent
    with NotificationsServicesComponent
    with AnalyticsServicesComponent

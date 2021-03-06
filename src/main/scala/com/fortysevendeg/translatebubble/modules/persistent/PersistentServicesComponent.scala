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

package com.fortysevendeg.translatebubble.modules.persistent

import com.fortysevendeg.translatebubble.service._
import com.fortysevendeg.translatebubble.utils.TranslateUiType

trait PersistentServices {
  def getLanguages: Service[GetLanguagesRequest, GetLanguagesResponse]
  def getLanguagesString: Option[String]
  def getLanguagesStringFromData(from: String, to: String): Option[String]
  def disable30MinutesTranslation(): Unit
  def enableTranslation(): Unit
  def disableTranslation(): Unit
  def getTypeTranslateUI(): TranslateUiType
  def isTranslationEnable(): Boolean
  def isHeadsUpEnable(): Boolean
  def isWizardWasSeen(): Boolean
  def wizardWasSeen(): Unit
}

trait PersistentServicesComponent {
  val persistentServices: PersistentServices
}

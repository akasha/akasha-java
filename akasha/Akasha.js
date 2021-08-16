/**
 * @fileoverview
 * @suppress {useOfGoogProvide}
 */
/**
 * @suppress {lintChecks}
 * @const
 */
var goog = goog || {};
goog.provide('akasha.Akasha');

/** @define {string} */
akasha.is__Window_speechSynthesis__supported = goog.define('akasha.is__Window_speechSynthesis__supported', 'detect');

/** @define {string} */
akasha.is__Window_localStorage__supported = goog.define('akasha.is__Window_localStorage__supported', 'detect');

/** @define {string} */
akasha.is__Window_sessionStorage__supported = goog.define('akasha.is__Window_sessionStorage__supported', 'detect');

/** @define {string} */
akasha.is__Navigator_bluetooth__supported = goog.define('akasha.is__Navigator_bluetooth__supported', 'detect');

/** @define {string} */
akasha.is__Navigator_gpu__supported = goog.define('akasha.is__Navigator_gpu__supported', 'detect');

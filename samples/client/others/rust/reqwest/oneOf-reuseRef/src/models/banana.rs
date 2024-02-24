/*
 * Example
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */

use crate::models;

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct Banana {
    #[serde(rename = "lengthCm", skip_serializing_if = "Option::is_none")]
    pub length_cm: Option<f64>,
}

impl Banana {
    pub fn new() -> Banana {
        Banana {
            length_cm: None,
        }
    }
}

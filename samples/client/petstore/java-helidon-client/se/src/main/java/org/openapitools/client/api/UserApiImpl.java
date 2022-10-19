/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import java.util.Objects;
import org.openapitools.client.ApiResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.helidon.common.GenericType;
import io.helidon.common.http.MediaType;
import io.helidon.common.reactive.Single;
import io.helidon.config.Config;
import io.helidon.media.common.MediaSupport;

import io.helidon.media.jackson.JacksonSupport;
import io.helidon.webclient.WebClientRequestBuilder;
import io.helidon.webclient.WebClientResponse;

import org.openapitools.client.ApiClient;

import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import org.openapitools.client.model.User;
import java.util.ArrayList;
import org.openapitools.client.Pair;

/**
 * OpenAPI Petstore
 *
 * <p>This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 */
public class UserApiImpl implements UserApi {

  private final ApiClient apiClient;

  protected static final GenericType<Void> RESPONSE_TYPE_createUser = ResponseType.create(Void.class);
  protected static final GenericType<Void> RESPONSE_TYPE_createUsersWithArrayInput = ResponseType.create(Void.class);
  protected static final GenericType<Void> RESPONSE_TYPE_createUsersWithListInput = ResponseType.create(Void.class);
  protected static final GenericType<Void> RESPONSE_TYPE_deleteUser = ResponseType.create(Void.class);
  protected static final GenericType<User> RESPONSE_TYPE_getUserByName = ResponseType.create(User.class);
  protected static final GenericType<String> RESPONSE_TYPE_loginUser = ResponseType.create(String.class);
  protected static final GenericType<Void> RESPONSE_TYPE_logoutUser = ResponseType.create(Void.class);
  protected static final GenericType<Void> RESPONSE_TYPE_updateUser = ResponseType.create(Void.class);

  /**
   * Creates a new instance of UserApiImpl initialized with the specified {@link ApiClient}.
   *
   */
  public static UserApiImpl create(ApiClient apiClient) {
    return new UserApiImpl(apiClient);
  }

  protected UserApiImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public ApiResponse<Void> createUser(User user) {
    Objects.requireNonNull(user, "Required parameter 'user' not specified");
    WebClientRequestBuilder webClientRequestBuilder = createUserRequestBuilder(user);
    return createUserSubmit(webClientRequestBuilder, user);
  }

  /**
   * Creates a {@code WebClientRequestBuilder} for the createUser operation.
   * Optional customization point for subclasses.
   *
   * @param user Created user object (required)
   * @return WebClientRequestBuilder for createUser
   */
  protected WebClientRequestBuilder createUserRequestBuilder(User user) {
    WebClientRequestBuilder webClientRequestBuilder = apiClient.webClient()
            .method("POST");

    webClientRequestBuilder.path("/user");
    webClientRequestBuilder.contentType(MediaType.APPLICATION_JSON);
    webClientRequestBuilder.accept(MediaType.APPLICATION_JSON);

    return webClientRequestBuilder;
  }

  /**
   * Initiates the request for the createUser operation.
   * Optional customization point for subclasses.
   *
   * @param webClientRequestBuilder the request builder to use for submitting the request
   * @param user Created user object (required)
   * @return {@code ApiResponse<Void>} for the submitted request
   */
  protected ApiResponse<Void> createUserSubmit(WebClientRequestBuilder webClientRequestBuilder, User user) {
    Single<WebClientResponse> webClientResponse = webClientRequestBuilder.submit(user);
    return ApiResponse.create(RESPONSE_TYPE_createUser, webClientResponse);
  }

  @Override
  public ApiResponse<Void> createUsersWithArrayInput(List<User> user) {
    Objects.requireNonNull(user, "Required parameter 'user' not specified");
    WebClientRequestBuilder webClientRequestBuilder = createUsersWithArrayInputRequestBuilder(user);
    return createUsersWithArrayInputSubmit(webClientRequestBuilder, user);
  }

  /**
   * Creates a {@code WebClientRequestBuilder} for the createUsersWithArrayInput operation.
   * Optional customization point for subclasses.
   *
   * @param user List of user object (required)
   * @return WebClientRequestBuilder for createUsersWithArrayInput
   */
  protected WebClientRequestBuilder createUsersWithArrayInputRequestBuilder(List<User> user) {
    WebClientRequestBuilder webClientRequestBuilder = apiClient.webClient()
            .method("POST");

    webClientRequestBuilder.path("/user/createWithArray");
    webClientRequestBuilder.contentType(MediaType.APPLICATION_JSON);
    webClientRequestBuilder.accept(MediaType.APPLICATION_JSON);

    return webClientRequestBuilder;
  }

  /**
   * Initiates the request for the createUsersWithArrayInput operation.
   * Optional customization point for subclasses.
   *
   * @param webClientRequestBuilder the request builder to use for submitting the request
   * @param user List of user object (required)
   * @return {@code ApiResponse<Void>} for the submitted request
   */
  protected ApiResponse<Void> createUsersWithArrayInputSubmit(WebClientRequestBuilder webClientRequestBuilder, List<User> user) {
    Single<WebClientResponse> webClientResponse = webClientRequestBuilder.submit(user);
    return ApiResponse.create(RESPONSE_TYPE_createUsersWithArrayInput, webClientResponse);
  }

  @Override
  public ApiResponse<Void> createUsersWithListInput(List<User> user) {
    Objects.requireNonNull(user, "Required parameter 'user' not specified");
    WebClientRequestBuilder webClientRequestBuilder = createUsersWithListInputRequestBuilder(user);
    return createUsersWithListInputSubmit(webClientRequestBuilder, user);
  }

  /**
   * Creates a {@code WebClientRequestBuilder} for the createUsersWithListInput operation.
   * Optional customization point for subclasses.
   *
   * @param user List of user object (required)
   * @return WebClientRequestBuilder for createUsersWithListInput
   */
  protected WebClientRequestBuilder createUsersWithListInputRequestBuilder(List<User> user) {
    WebClientRequestBuilder webClientRequestBuilder = apiClient.webClient()
            .method("POST");

    webClientRequestBuilder.path("/user/createWithList");
    webClientRequestBuilder.contentType(MediaType.APPLICATION_JSON);
    webClientRequestBuilder.accept(MediaType.APPLICATION_JSON);

    return webClientRequestBuilder;
  }

  /**
   * Initiates the request for the createUsersWithListInput operation.
   * Optional customization point for subclasses.
   *
   * @param webClientRequestBuilder the request builder to use for submitting the request
   * @param user List of user object (required)
   * @return {@code ApiResponse<Void>} for the submitted request
   */
  protected ApiResponse<Void> createUsersWithListInputSubmit(WebClientRequestBuilder webClientRequestBuilder, List<User> user) {
    Single<WebClientResponse> webClientResponse = webClientRequestBuilder.submit(user);
    return ApiResponse.create(RESPONSE_TYPE_createUsersWithListInput, webClientResponse);
  }

  @Override
  public ApiResponse<Void> deleteUser(String username) {
    Objects.requireNonNull(username, "Required parameter 'username' not specified");
    WebClientRequestBuilder webClientRequestBuilder = deleteUserRequestBuilder(username);
    return deleteUserSubmit(webClientRequestBuilder, username);
  }

  /**
   * Creates a {@code WebClientRequestBuilder} for the deleteUser operation.
   * Optional customization point for subclasses.
   *
   * @param username The name that needs to be deleted (required)
   * @return WebClientRequestBuilder for deleteUser
   */
  protected WebClientRequestBuilder deleteUserRequestBuilder(String username) {
    WebClientRequestBuilder webClientRequestBuilder = apiClient.webClient()
            .method("DELETE");

    String path = "/user/{username}"
            .replace("{username}", ApiClient.urlEncode(username));
    webClientRequestBuilder.path(path);
    webClientRequestBuilder.accept(MediaType.APPLICATION_JSON);

    return webClientRequestBuilder;
  }

  /**
   * Initiates the request for the deleteUser operation.
   * Optional customization point for subclasses.
   *
   * @param webClientRequestBuilder the request builder to use for submitting the request
   * @param username The name that needs to be deleted (required)
   * @return {@code ApiResponse<Void>} for the submitted request
   */
  protected ApiResponse<Void> deleteUserSubmit(WebClientRequestBuilder webClientRequestBuilder, String username) {
    Single<WebClientResponse> webClientResponse = webClientRequestBuilder.submit();
    return ApiResponse.create(RESPONSE_TYPE_deleteUser, webClientResponse);
  }

  @Override
  public ApiResponse<User> getUserByName(String username) {
    Objects.requireNonNull(username, "Required parameter 'username' not specified");
    WebClientRequestBuilder webClientRequestBuilder = getUserByNameRequestBuilder(username);
    return getUserByNameSubmit(webClientRequestBuilder, username);
  }

  /**
   * Creates a {@code WebClientRequestBuilder} for the getUserByName operation.
   * Optional customization point for subclasses.
   *
   * @param username The name that needs to be fetched. Use user1 for testing. (required)
   * @return WebClientRequestBuilder for getUserByName
   */
  protected WebClientRequestBuilder getUserByNameRequestBuilder(String username) {
    WebClientRequestBuilder webClientRequestBuilder = apiClient.webClient()
            .method("GET");

    String path = "/user/{username}"
            .replace("{username}", ApiClient.urlEncode(username));
    webClientRequestBuilder.path(path);
    webClientRequestBuilder.accept(MediaType.APPLICATION_JSON);

    return webClientRequestBuilder;
  }

  /**
   * Initiates the request for the getUserByName operation.
   * Optional customization point for subclasses.
   *
   * @param webClientRequestBuilder the request builder to use for submitting the request
   * @param username The name that needs to be fetched. Use user1 for testing. (required)
   * @return {@code ApiResponse<User>} for the submitted request
   */
  protected ApiResponse<User> getUserByNameSubmit(WebClientRequestBuilder webClientRequestBuilder, String username) {
    Single<WebClientResponse> webClientResponse = webClientRequestBuilder.submit();
    return ApiResponse.create(RESPONSE_TYPE_getUserByName, webClientResponse);
  }

  @Override
  public ApiResponse<String> loginUser(String username, String password) {
    Objects.requireNonNull(username, "Required parameter 'username' not specified");
    Objects.requireNonNull(password, "Required parameter 'password' not specified");
    WebClientRequestBuilder webClientRequestBuilder = loginUserRequestBuilder(username, password);
    return loginUserSubmit(webClientRequestBuilder, username, password);
  }

  /**
   * Creates a {@code WebClientRequestBuilder} for the loginUser operation.
   * Optional customization point for subclasses.
   *
   * @param username The user name for login (required)
   * @param password The password for login in clear text (required)
   * @return WebClientRequestBuilder for loginUser
   */
  protected WebClientRequestBuilder loginUserRequestBuilder(String username, String password) {
    WebClientRequestBuilder webClientRequestBuilder = apiClient.webClient()
            .method("GET");

    List<Pair> queryParams = new ArrayList<>();
    queryParams.addAll(ApiClient.parameterToPairs("username", username));
    queryParams.addAll(ApiClient.parameterToPairs("password", password));
    queryParams.forEach(p -> webClientRequestBuilder.queryParam(p.getName(), p.getValue()));

    webClientRequestBuilder.path("/user/login");
    webClientRequestBuilder.accept(MediaType.APPLICATION_JSON);

    return webClientRequestBuilder;
  }

  /**
   * Initiates the request for the loginUser operation.
   * Optional customization point for subclasses.
   *
   * @param webClientRequestBuilder the request builder to use for submitting the request
   * @param username The user name for login (required)
   * @param password The password for login in clear text (required)
   * @return {@code ApiResponse<String>} for the submitted request
   */
  protected ApiResponse<String> loginUserSubmit(WebClientRequestBuilder webClientRequestBuilder, String username, String password) {
    Single<WebClientResponse> webClientResponse = webClientRequestBuilder.submit();
    return ApiResponse.create(RESPONSE_TYPE_loginUser, webClientResponse);
  }

  @Override
  public ApiResponse<Void> logoutUser() {
    WebClientRequestBuilder webClientRequestBuilder = logoutUserRequestBuilder();
    return logoutUserSubmit(webClientRequestBuilder);
  }

  /**
   * Creates a {@code WebClientRequestBuilder} for the logoutUser operation.
   * Optional customization point for subclasses.
   *
   * @return WebClientRequestBuilder for logoutUser
   */
  protected WebClientRequestBuilder logoutUserRequestBuilder() {
    WebClientRequestBuilder webClientRequestBuilder = apiClient.webClient()
            .method("GET");

    webClientRequestBuilder.path("/user/logout");
    webClientRequestBuilder.accept(MediaType.APPLICATION_JSON);

    return webClientRequestBuilder;
  }

  /**
   * Initiates the request for the logoutUser operation.
   * Optional customization point for subclasses.
   *
   * @param webClientRequestBuilder the request builder to use for submitting the request
   * @return {@code ApiResponse<Void>} for the submitted request
   */
  protected ApiResponse<Void> logoutUserSubmit(WebClientRequestBuilder webClientRequestBuilder) {
    Single<WebClientResponse> webClientResponse = webClientRequestBuilder.submit();
    return ApiResponse.create(RESPONSE_TYPE_logoutUser, webClientResponse);
  }

  @Override
  public ApiResponse<Void> updateUser(String username, User user) {
    Objects.requireNonNull(username, "Required parameter 'username' not specified");
    Objects.requireNonNull(user, "Required parameter 'user' not specified");
    WebClientRequestBuilder webClientRequestBuilder = updateUserRequestBuilder(username, user);
    return updateUserSubmit(webClientRequestBuilder, username, user);
  }

  /**
   * Creates a {@code WebClientRequestBuilder} for the updateUser operation.
   * Optional customization point for subclasses.
   *
   * @param username name that need to be deleted (required)
   * @param user Updated user object (required)
   * @return WebClientRequestBuilder for updateUser
   */
  protected WebClientRequestBuilder updateUserRequestBuilder(String username, User user) {
    WebClientRequestBuilder webClientRequestBuilder = apiClient.webClient()
            .method("PUT");

    String path = "/user/{username}"
            .replace("{username}", ApiClient.urlEncode(username));
    webClientRequestBuilder.path(path);
    webClientRequestBuilder.contentType(MediaType.APPLICATION_JSON);
    webClientRequestBuilder.accept(MediaType.APPLICATION_JSON);

    return webClientRequestBuilder;
  }

  /**
   * Initiates the request for the updateUser operation.
   * Optional customization point for subclasses.
   *
   * @param webClientRequestBuilder the request builder to use for submitting the request
   * @param username name that need to be deleted (required)
   * @param user Updated user object (required)
   * @return {@code ApiResponse<Void>} for the submitted request
   */
  protected ApiResponse<Void> updateUserSubmit(WebClientRequestBuilder webClientRequestBuilder, String username, User user) {
    Single<WebClientResponse> webClientResponse = webClientRequestBuilder.submit(user);
    return ApiResponse.create(RESPONSE_TYPE_updateUser, webClientResponse);
  }

}
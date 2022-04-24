//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Login}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLogin.builder()}.
 */
@org.immutables.value.Generated(from = "Login", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableLogin implements com.fhir.Login {
  private final @javax.annotation.Nullable java.lang.String codeChallenge;
  private final @javax.annotation.Nullable java.lang.Boolean admin;
  private final @javax.annotation.Nullable java.lang.String cookie;
  private final @javax.annotation.Nullable java.lang.String refreshSecret;
  private final @javax.annotation.Nullable com.fhir.instant authTime;
  private final @javax.annotation.Nullable java.lang.String remoteAddress;
  private final @javax.annotation.Nullable com.fhir.Reference client;
  private final @javax.annotation.Nullable java.lang.String userAgent;
  private final @javax.annotation.Nullable com.fhir.Reference membership;
  private final @javax.annotation.Nullable java.lang.Boolean granted;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.lang.String scope;
  private final @javax.annotation.Nullable java.lang.String authMethod;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> compartments;
  private final @javax.annotation.Nullable java.lang.String code;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.lang.String resourceType;
  private final @javax.annotation.Nullable java.lang.Boolean revoked;
  private final @javax.annotation.Nullable java.lang.String nonce;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.Reference user;
  private final @javax.annotation.Nullable java.lang.String codeChallengeMethod;

  private ImmutableLogin(
      @javax.annotation.Nullable java.lang.String codeChallenge,
      @javax.annotation.Nullable java.lang.Boolean admin,
      @javax.annotation.Nullable java.lang.String cookie,
      @javax.annotation.Nullable java.lang.String refreshSecret,
      @javax.annotation.Nullable com.fhir.instant authTime,
      @javax.annotation.Nullable java.lang.String remoteAddress,
      @javax.annotation.Nullable com.fhir.Reference client,
      @javax.annotation.Nullable java.lang.String userAgent,
      @javax.annotation.Nullable com.fhir.Reference membership,
      @javax.annotation.Nullable java.lang.Boolean granted,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.lang.String scope,
      @javax.annotation.Nullable java.lang.String authMethod,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> compartments,
      @javax.annotation.Nullable java.lang.String code,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.lang.String resourceType,
      @javax.annotation.Nullable java.lang.Boolean revoked,
      @javax.annotation.Nullable java.lang.String nonce,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.Reference user,
      @javax.annotation.Nullable java.lang.String codeChallengeMethod) {
    this.codeChallenge = codeChallenge;
    this.admin = admin;
    this.cookie = cookie;
    this.refreshSecret = refreshSecret;
    this.authTime = authTime;
    this.remoteAddress = remoteAddress;
    this.client = client;
    this.userAgent = userAgent;
    this.membership = membership;
    this.granted = granted;
    this.implicitRules = implicitRules;
    this.scope = scope;
    this.authMethod = authMethod;
    this.meta = meta;
    this.compartments = compartments;
    this.code = code;
    this.id = id;
    this.resourceType = resourceType;
    this.revoked = revoked;
    this.nonce = nonce;
    this.language = language;
    this.user = user;
    this.codeChallengeMethod = codeChallengeMethod;
  }

  /**
   * @return The value of the {@code codeChallenge} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("codeChallenge")
  @Override
  public java.util.Optional<java.lang.String> codeChallenge() {
    return java.util.Optional.ofNullable(codeChallenge);
  }

  /**
   * @return The value of the {@code admin} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("admin")
  @Override
  public java.util.Optional<java.lang.Boolean> admin() {
    return java.util.Optional.ofNullable(admin);
  }

  /**
   * @return The value of the {@code cookie} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("cookie")
  @Override
  public java.util.Optional<java.lang.String> cookie() {
    return java.util.Optional.ofNullable(cookie);
  }

  /**
   * @return The value of the {@code refreshSecret} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("refreshSecret")
  @Override
  public java.util.Optional<java.lang.String> refreshSecret() {
    return java.util.Optional.ofNullable(refreshSecret);
  }

  /**
   * @return The value of the {@code authTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("authTime")
  @Override
  public java.util.Optional<com.fhir.instant> authTime() {
    return java.util.Optional.ofNullable(authTime);
  }

  /**
   * @return The value of the {@code remoteAddress} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("remoteAddress")
  @Override
  public java.util.Optional<java.lang.String> remoteAddress() {
    return java.util.Optional.ofNullable(remoteAddress);
  }

  /**
   * @return The value of the {@code client} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("client")
  @Override
  public java.util.Optional<com.fhir.Reference> client() {
    return java.util.Optional.ofNullable(client);
  }

  /**
   * @return The value of the {@code userAgent} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("userAgent")
  @Override
  public java.util.Optional<java.lang.String> userAgent() {
    return java.util.Optional.ofNullable(userAgent);
  }

  /**
   * @return The value of the {@code membership} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("membership")
  @Override
  public java.util.Optional<com.fhir.Reference> membership() {
    return java.util.Optional.ofNullable(membership);
  }

  /**
   * @return The value of the {@code granted} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("granted")
  @Override
  public java.util.Optional<java.lang.Boolean> granted() {
    return java.util.Optional.ofNullable(granted);
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code scope} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("scope")
  @Override
  public java.util.Optional<java.lang.String> scope() {
    return java.util.Optional.ofNullable(scope);
  }

  /**
   * @return The value of the {@code authMethod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("authMethod")
  @Override
  public java.util.Optional<java.lang.String> authMethod() {
    return java.util.Optional.ofNullable(authMethod);
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code compartments} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("compartments")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> compartments() {
    return java.util.Optional.ofNullable(compartments);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<java.lang.String> code() {
    return java.util.Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.util.Optional<java.lang.String> resourceType() {
    return java.util.Optional.ofNullable(resourceType);
  }

  /**
   * @return The value of the {@code revoked} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("revoked")
  @Override
  public java.util.Optional<java.lang.Boolean> revoked() {
    return java.util.Optional.ofNullable(revoked);
  }

  /**
   * @return The value of the {@code nonce} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("nonce")
  @Override
  public java.util.Optional<java.lang.String> nonce() {
    return java.util.Optional.ofNullable(nonce);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code user} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("user")
  @Override
  public java.util.Optional<com.fhir.Reference> user() {
    return java.util.Optional.ofNullable(user);
  }

  /**
   * @return The value of the {@code codeChallengeMethod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("codeChallengeMethod")
  @Override
  public java.util.Optional<java.lang.String> codeChallengeMethod() {
    return java.util.Optional.ofNullable(codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#codeChallenge() codeChallenge} attribute.
   * @param value The value for codeChallenge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withCodeChallenge(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "codeChallenge");
    if (java.util.Objects.equals(this.codeChallenge, newValue)) return this;
    return new ImmutableLogin(
        newValue,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#codeChallenge() codeChallenge} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for codeChallenge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withCodeChallenge(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.codeChallenge, value)) return this;
    return new ImmutableLogin(
        value,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#admin() admin} attribute.
   * @param value The value for admin
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withAdmin(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.admin, newValue)) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        newValue,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#admin() admin} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for admin
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withAdmin(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.admin, value)) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        value,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#cookie() cookie} attribute.
   * @param value The value for cookie
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withCookie(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "cookie");
    if (java.util.Objects.equals(this.cookie, newValue)) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        newValue,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#cookie() cookie} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for cookie
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withCookie(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.cookie, value)) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        value,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#refreshSecret() refreshSecret} attribute.
   * @param value The value for refreshSecret
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withRefreshSecret(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "refreshSecret");
    if (java.util.Objects.equals(this.refreshSecret, newValue)) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        newValue,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#refreshSecret() refreshSecret} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for refreshSecret
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withRefreshSecret(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.refreshSecret, value)) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        value,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#authTime() authTime} attribute.
   * @param value The value for authTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withAuthTime(com.fhir.instant value) {
    @javax.annotation.Nullable com.fhir.instant newValue = java.util.Objects.requireNonNull(value, "authTime");
    if (this.authTime == newValue) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        newValue,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#authTime() authTime} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authTime
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLogin withAuthTime(java.util.Optional<? extends com.fhir.instant> optional) {
    @javax.annotation.Nullable com.fhir.instant value = optional.orElse(null);
    if (this.authTime == value) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        value,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#remoteAddress() remoteAddress} attribute.
   * @param value The value for remoteAddress
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withRemoteAddress(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "remoteAddress");
    if (java.util.Objects.equals(this.remoteAddress, newValue)) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        newValue,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#remoteAddress() remoteAddress} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for remoteAddress
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withRemoteAddress(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.remoteAddress, value)) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        value,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#client() client} attribute.
   * @param value The value for client
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withClient(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "client");
    if (this.client == newValue) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        newValue,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#client() client} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for client
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLogin withClient(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.client == value) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        value,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#userAgent() userAgent} attribute.
   * @param value The value for userAgent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withUserAgent(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "userAgent");
    if (java.util.Objects.equals(this.userAgent, newValue)) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        newValue,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#userAgent() userAgent} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for userAgent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withUserAgent(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.userAgent, value)) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        value,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#membership() membership} attribute.
   * @param value The value for membership
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withMembership(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "membership");
    if (this.membership == newValue) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        newValue,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#membership() membership} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for membership
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLogin withMembership(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.membership == value) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        value,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#granted() granted} attribute.
   * @param value The value for granted
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withGranted(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.granted, newValue)) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        newValue,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#granted() granted} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for granted
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withGranted(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.granted, value)) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        value,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        newValue,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLogin withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        value,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#scope() scope} attribute.
   * @param value The value for scope
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withScope(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "scope");
    if (java.util.Objects.equals(this.scope, newValue)) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        newValue,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#scope() scope} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for scope
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withScope(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.scope, value)) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        value,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#authMethod() authMethod} attribute.
   * @param value The value for authMethod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withAuthMethod(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "authMethod");
    if (java.util.Objects.equals(this.authMethod, newValue)) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        newValue,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#authMethod() authMethod} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authMethod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withAuthMethod(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.authMethod, value)) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        value,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        newValue,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLogin withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        value,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#compartments() compartments} attribute.
   * @param value The value for compartments
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withCompartments(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "compartments");
    if (this.compartments == newValue) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        newValue,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#compartments() compartments} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for compartments
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLogin withCompartments(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.compartments == value) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        value,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withCode(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "code");
    if (java.util.Objects.equals(this.code, newValue)) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        newValue,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#code() code} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withCode(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.code, value)) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        value,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        newValue,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLogin withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        value,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#resourceType() resourceType} attribute.
   * @param value The value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withResourceType(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (java.util.Objects.equals(this.resourceType, newValue)) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        newValue,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#resourceType() resourceType} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withResourceType(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.resourceType, value)) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        value,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#revoked() revoked} attribute.
   * @param value The value for revoked
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withRevoked(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.revoked, newValue)) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        newValue,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#revoked() revoked} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for revoked
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withRevoked(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.revoked, value)) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        value,
        this.nonce,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#nonce() nonce} attribute.
   * @param value The value for nonce
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withNonce(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "nonce");
    if (java.util.Objects.equals(this.nonce, newValue)) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        newValue,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#nonce() nonce} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for nonce
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withNonce(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.nonce, value)) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        value,
        this.language,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        newValue,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLogin withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        value,
        this.user,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#user() user} attribute.
   * @param value The value for user
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withUser(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "user");
    if (this.user == newValue) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        newValue,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#user() user} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for user
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLogin withUser(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.user == value) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        value,
        this.codeChallengeMethod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#codeChallengeMethod() codeChallengeMethod} attribute.
   * @param value The value for codeChallengeMethod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withCodeChallengeMethod(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "codeChallengeMethod");
    if (java.util.Objects.equals(this.codeChallengeMethod, newValue)) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#codeChallengeMethod() codeChallengeMethod} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for codeChallengeMethod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withCodeChallengeMethod(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.codeChallengeMethod, value)) return this;
    return new ImmutableLogin(
        this.codeChallenge,
        this.admin,
        this.cookie,
        this.refreshSecret,
        this.authTime,
        this.remoteAddress,
        this.client,
        this.userAgent,
        this.membership,
        this.granted,
        this.implicitRules,
        this.scope,
        this.authMethod,
        this.meta,
        this.compartments,
        this.code,
        this.id,
        this.resourceType,
        this.revoked,
        this.nonce,
        this.language,
        this.user,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLogin} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLogin
        && equalTo((ImmutableLogin) another);
  }

  private boolean equalTo(ImmutableLogin another) {
    return java.util.Objects.equals(codeChallenge, another.codeChallenge)
        && java.util.Objects.equals(admin, another.admin)
        && java.util.Objects.equals(cookie, another.cookie)
        && java.util.Objects.equals(refreshSecret, another.refreshSecret)
        && java.util.Objects.equals(authTime, another.authTime)
        && java.util.Objects.equals(remoteAddress, another.remoteAddress)
        && java.util.Objects.equals(client, another.client)
        && java.util.Objects.equals(userAgent, another.userAgent)
        && java.util.Objects.equals(membership, another.membership)
        && java.util.Objects.equals(granted, another.granted)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(scope, another.scope)
        && java.util.Objects.equals(authMethod, another.authMethod)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(compartments, another.compartments)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(resourceType, another.resourceType)
        && java.util.Objects.equals(revoked, another.revoked)
        && java.util.Objects.equals(nonce, another.nonce)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(user, another.user)
        && java.util.Objects.equals(codeChallengeMethod, another.codeChallengeMethod);
  }

  /**
   * Computes a hash code from attributes: {@code codeChallenge}, {@code admin}, {@code cookie}, {@code refreshSecret}, {@code authTime}, {@code remoteAddress}, {@code client}, {@code userAgent}, {@code membership}, {@code granted}, {@code implicitRules}, {@code scope}, {@code authMethod}, {@code meta}, {@code compartments}, {@code code}, {@code id}, {@code resourceType}, {@code revoked}, {@code nonce}, {@code language}, {@code user}, {@code codeChallengeMethod}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(codeChallenge);
    h += (h << 5) + java.util.Objects.hashCode(admin);
    h += (h << 5) + java.util.Objects.hashCode(cookie);
    h += (h << 5) + java.util.Objects.hashCode(refreshSecret);
    h += (h << 5) + java.util.Objects.hashCode(authTime);
    h += (h << 5) + java.util.Objects.hashCode(remoteAddress);
    h += (h << 5) + java.util.Objects.hashCode(client);
    h += (h << 5) + java.util.Objects.hashCode(userAgent);
    h += (h << 5) + java.util.Objects.hashCode(membership);
    h += (h << 5) + java.util.Objects.hashCode(granted);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(scope);
    h += (h << 5) + java.util.Objects.hashCode(authMethod);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(compartments);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(resourceType);
    h += (h << 5) + java.util.Objects.hashCode(revoked);
    h += (h << 5) + java.util.Objects.hashCode(nonce);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(user);
    h += (h << 5) + java.util.Objects.hashCode(codeChallengeMethod);
    return h;
  }

  /**
   * Prints the immutable value {@code Login} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Login{");
    if (codeChallenge != null) {
      builder.append("codeChallenge=").append(codeChallenge);
    }
    if (admin != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("admin=").append(admin);
    }
    if (cookie != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("cookie=").append(cookie);
    }
    if (refreshSecret != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("refreshSecret=").append(refreshSecret);
    }
    if (authTime != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("authTime=").append(authTime);
    }
    if (remoteAddress != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("remoteAddress=").append(remoteAddress);
    }
    if (client != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("client=").append(client);
    }
    if (userAgent != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("userAgent=").append(userAgent);
    }
    if (membership != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("membership=").append(membership);
    }
    if (granted != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("granted=").append(granted);
    }
    if (implicitRules != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (scope != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("scope=").append(scope);
    }
    if (authMethod != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("authMethod=").append(authMethod);
    }
    if (meta != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (compartments != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("compartments=").append(compartments);
    }
    if (code != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (id != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (resourceType != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("resourceType=").append(resourceType);
    }
    if (revoked != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("revoked=").append(revoked);
    }
    if (nonce != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("nonce=").append(nonce);
    }
    if (language != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (user != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("user=").append(user);
    }
    if (codeChallengeMethod != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("codeChallengeMethod=").append(codeChallengeMethod);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Login", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Login {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> codeChallenge = java.util.Optional.empty();
    boolean codeChallengeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> admin = java.util.Optional.empty();
    boolean adminIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> cookie = java.util.Optional.empty();
    boolean cookieIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> refreshSecret = java.util.Optional.empty();
    boolean refreshSecretIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.instant> authTime = java.util.Optional.empty();
    boolean authTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> remoteAddress = java.util.Optional.empty();
    boolean remoteAddressIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> client = java.util.Optional.empty();
    boolean clientIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> userAgent = java.util.Optional.empty();
    boolean userAgentIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> membership = java.util.Optional.empty();
    boolean membershipIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> granted = java.util.Optional.empty();
    boolean grantedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> scope = java.util.Optional.empty();
    boolean scopeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> authMethod = java.util.Optional.empty();
    boolean authMethodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> compartments = java.util.Optional.empty();
    boolean compartmentsIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> resourceType = java.util.Optional.empty();
    boolean resourceTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> revoked = java.util.Optional.empty();
    boolean revokedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> nonce = java.util.Optional.empty();
    boolean nonceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> user = java.util.Optional.empty();
    boolean userIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> codeChallengeMethod = java.util.Optional.empty();
    boolean codeChallengeMethodIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("codeChallenge")
    public void setCodeChallenge(java.util.Optional<java.lang.String> codeChallenge) {
      this.codeChallenge = codeChallenge;
      this.codeChallengeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("admin")
    public void setAdmin(java.util.Optional<java.lang.Boolean> admin) {
      this.admin = admin;
      this.adminIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("cookie")
    public void setCookie(java.util.Optional<java.lang.String> cookie) {
      this.cookie = cookie;
      this.cookieIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("refreshSecret")
    public void setRefreshSecret(java.util.Optional<java.lang.String> refreshSecret) {
      this.refreshSecret = refreshSecret;
      this.refreshSecretIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("authTime")
    public void setAuthTime(java.util.Optional<com.fhir.instant> authTime) {
      this.authTime = authTime;
      this.authTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("remoteAddress")
    public void setRemoteAddress(java.util.Optional<java.lang.String> remoteAddress) {
      this.remoteAddress = remoteAddress;
      this.remoteAddressIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("client")
    public void setClient(java.util.Optional<com.fhir.Reference> client) {
      this.client = client;
      this.clientIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("userAgent")
    public void setUserAgent(java.util.Optional<java.lang.String> userAgent) {
      this.userAgent = userAgent;
      this.userAgentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("membership")
    public void setMembership(java.util.Optional<com.fhir.Reference> membership) {
      this.membership = membership;
      this.membershipIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("granted")
    public void setGranted(java.util.Optional<java.lang.Boolean> granted) {
      this.granted = granted;
      this.grantedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    public void setScope(java.util.Optional<java.lang.String> scope) {
      this.scope = scope;
      this.scopeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("authMethod")
    public void setAuthMethod(java.util.Optional<java.lang.String> authMethod) {
      this.authMethod = authMethod;
      this.authMethodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("compartments")
    public void setCompartments(java.util.Optional<java.util.List<com.fhir.Reference>> compartments) {
      this.compartments = compartments;
      this.compartmentsIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<java.lang.String> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.util.Optional<java.lang.String> resourceType) {
      this.resourceType = resourceType;
      this.resourceTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("revoked")
    public void setRevoked(java.util.Optional<java.lang.Boolean> revoked) {
      this.revoked = revoked;
      this.revokedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("nonce")
    public void setNonce(java.util.Optional<java.lang.String> nonce) {
      this.nonce = nonce;
      this.nonceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("user")
    public void setUser(java.util.Optional<com.fhir.Reference> user) {
      this.user = user;
      this.userIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("codeChallengeMethod")
    public void setCodeChallengeMethod(java.util.Optional<java.lang.String> codeChallengeMethod) {
      this.codeChallengeMethod = codeChallengeMethod;
      this.codeChallengeMethodIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> codeChallenge() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> admin() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> cookie() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> refreshSecret() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.instant> authTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> remoteAddress() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> client() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> userAgent() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> membership() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> granted() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> scope() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> authMethod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> compartments() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> revoked() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> nonce() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> user() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> codeChallengeMethod() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableLogin fromJson(Json json) {
    ImmutableLogin.Builder builder = ImmutableLogin.builder();
    if (json.codeChallengeIsSet) {
      builder.codeChallenge(json.codeChallenge);
    }
    if (json.adminIsSet) {
      builder.admin(json.admin);
    }
    if (json.cookieIsSet) {
      builder.cookie(json.cookie);
    }
    if (json.refreshSecretIsSet) {
      builder.refreshSecret(json.refreshSecret);
    }
    if (json.authTimeIsSet) {
      builder.authTime(json.authTime);
    }
    if (json.remoteAddressIsSet) {
      builder.remoteAddress(json.remoteAddress);
    }
    if (json.clientIsSet) {
      builder.client(json.client);
    }
    if (json.userAgentIsSet) {
      builder.userAgent(json.userAgent);
    }
    if (json.membershipIsSet) {
      builder.membership(json.membership);
    }
    if (json.grantedIsSet) {
      builder.granted(json.granted);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.scopeIsSet) {
      builder.scope(json.scope);
    }
    if (json.authMethodIsSet) {
      builder.authMethod(json.authMethod);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.compartmentsIsSet) {
      builder.compartments(json.compartments);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.resourceTypeIsSet) {
      builder.resourceType(json.resourceType);
    }
    if (json.revokedIsSet) {
      builder.revoked(json.revoked);
    }
    if (json.nonceIsSet) {
      builder.nonce(json.nonce);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.userIsSet) {
      builder.user(json.user);
    }
    if (json.codeChallengeMethodIsSet) {
      builder.codeChallengeMethod(json.codeChallengeMethod);
    }
    return (ImmutableLogin) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Login} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Login instance
   */
  public static Login copyOf(Login instance) {
    if (instance instanceof ImmutableLogin) {
      return (ImmutableLogin) instance;
    }
    return ImmutableLogin.builder()
        .codeChallenge(instance.codeChallenge())
        .admin(instance.admin())
        .cookie(instance.cookie())
        .refreshSecret(instance.refreshSecret())
        .authTime(instance.authTime())
        .remoteAddress(instance.remoteAddress())
        .client(instance.client())
        .userAgent(instance.userAgent())
        .membership(instance.membership())
        .granted(instance.granted())
        .implicitRules(instance.implicitRules())
        .scope(instance.scope())
        .authMethod(instance.authMethod())
        .meta(instance.meta())
        .compartments(instance.compartments())
        .code(instance.code())
        .id(instance.id())
        .resourceType(instance.resourceType())
        .revoked(instance.revoked())
        .nonce(instance.nonce())
        .language(instance.language())
        .user(instance.user())
        .codeChallengeMethod(instance.codeChallengeMethod())
        .build();
  }

  /**
   * Creates a builder for {@link Login Login}.
   * <pre>
   * ImmutableLogin.builder()
   *    .codeChallenge(String) // optional {@link Login#codeChallenge() codeChallenge}
   *    .admin(Boolean) // optional {@link Login#admin() admin}
   *    .cookie(String) // optional {@link Login#cookie() cookie}
   *    .refreshSecret(String) // optional {@link Login#refreshSecret() refreshSecret}
   *    .authTime(com.fhir.instant) // optional {@link Login#authTime() authTime}
   *    .remoteAddress(String) // optional {@link Login#remoteAddress() remoteAddress}
   *    .client(com.fhir.Reference) // optional {@link Login#client() client}
   *    .userAgent(String) // optional {@link Login#userAgent() userAgent}
   *    .membership(com.fhir.Reference) // optional {@link Login#membership() membership}
   *    .granted(Boolean) // optional {@link Login#granted() granted}
   *    .implicitRules(com.fhir.uri) // optional {@link Login#implicitRules() implicitRules}
   *    .scope(String) // optional {@link Login#scope() scope}
   *    .authMethod(String) // optional {@link Login#authMethod() authMethod}
   *    .meta(com.fhir.Meta) // optional {@link Login#meta() meta}
   *    .compartments(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Login#compartments() compartments}
   *    .code(String) // optional {@link Login#code() code}
   *    .id(com.fhir.id) // optional {@link Login#id() id}
   *    .resourceType(String) // optional {@link Login#resourceType() resourceType}
   *    .revoked(Boolean) // optional {@link Login#revoked() revoked}
   *    .nonce(String) // optional {@link Login#nonce() nonce}
   *    .language(com.fhir.code) // optional {@link Login#language() language}
   *    .user(com.fhir.Reference) // optional {@link Login#user() user}
   *    .codeChallengeMethod(String) // optional {@link Login#codeChallengeMethod() codeChallengeMethod}
   *    .build();
   * </pre>
   * @return A new Login builder
   */
  public static ImmutableLogin.Builder builder() {
    return new ImmutableLogin.Builder();
  }

  /**
   * Builds instances of type {@link Login Login}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Login", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_CODE_CHALLENGE = 0x1L;
    private static final long OPT_BIT_ADMIN = 0x2L;
    private static final long OPT_BIT_COOKIE = 0x4L;
    private static final long OPT_BIT_REFRESH_SECRET = 0x8L;
    private static final long OPT_BIT_AUTH_TIME = 0x10L;
    private static final long OPT_BIT_REMOTE_ADDRESS = 0x20L;
    private static final long OPT_BIT_CLIENT = 0x40L;
    private static final long OPT_BIT_USER_AGENT = 0x80L;
    private static final long OPT_BIT_MEMBERSHIP = 0x100L;
    private static final long OPT_BIT_GRANTED = 0x200L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x400L;
    private static final long OPT_BIT_SCOPE = 0x800L;
    private static final long OPT_BIT_AUTH_METHOD = 0x1000L;
    private static final long OPT_BIT_META = 0x2000L;
    private static final long OPT_BIT_COMPARTMENTS = 0x4000L;
    private static final long OPT_BIT_CODE = 0x8000L;
    private static final long OPT_BIT_ID = 0x10000L;
    private static final long OPT_BIT_RESOURCE_TYPE = 0x20000L;
    private static final long OPT_BIT_REVOKED = 0x40000L;
    private static final long OPT_BIT_NONCE = 0x80000L;
    private static final long OPT_BIT_LANGUAGE = 0x100000L;
    private static final long OPT_BIT_USER = 0x200000L;
    private static final long OPT_BIT_CODE_CHALLENGE_METHOD = 0x400000L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String codeChallenge;
    private @javax.annotation.Nullable java.lang.Boolean admin;
    private @javax.annotation.Nullable java.lang.String cookie;
    private @javax.annotation.Nullable java.lang.String refreshSecret;
    private @javax.annotation.Nullable com.fhir.instant authTime;
    private @javax.annotation.Nullable java.lang.String remoteAddress;
    private @javax.annotation.Nullable com.fhir.Reference client;
    private @javax.annotation.Nullable java.lang.String userAgent;
    private @javax.annotation.Nullable com.fhir.Reference membership;
    private @javax.annotation.Nullable java.lang.Boolean granted;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.lang.String scope;
    private @javax.annotation.Nullable java.lang.String authMethod;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> compartments;
    private @javax.annotation.Nullable java.lang.String code;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.lang.Boolean revoked;
    private @javax.annotation.Nullable java.lang.String nonce;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.Reference user;
    private @javax.annotation.Nullable java.lang.String codeChallengeMethod;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Login#codeChallenge() codeChallenge} to codeChallenge.
     * @param codeChallenge The value for codeChallenge
     * @return {@code this} builder for chained invocation
     */
    public final Builder codeChallenge(java.lang.String codeChallenge) {
      checkNotIsSet(codeChallengeIsSet(), "codeChallenge");
      this.codeChallenge = java.util.Objects.requireNonNull(codeChallenge, "codeChallenge");
      optBits |= OPT_BIT_CODE_CHALLENGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#codeChallenge() codeChallenge} to codeChallenge.
     * @param codeChallenge The value for codeChallenge
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("codeChallenge")
    public final Builder codeChallenge(java.util.Optional<java.lang.String> codeChallenge) {
      checkNotIsSet(codeChallengeIsSet(), "codeChallenge");
      this.codeChallenge = codeChallenge.orElse(null);
      optBits |= OPT_BIT_CODE_CHALLENGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#admin() admin} to admin.
     * @param admin The value for admin
     * @return {@code this} builder for chained invocation
     */
    public final Builder admin(boolean admin) {
      checkNotIsSet(adminIsSet(), "admin");
      this.admin = admin;
      optBits |= OPT_BIT_ADMIN;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#admin() admin} to admin.
     * @param admin The value for admin
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("admin")
    public final Builder admin(java.util.Optional<java.lang.Boolean> admin) {
      checkNotIsSet(adminIsSet(), "admin");
      this.admin = admin.orElse(null);
      optBits |= OPT_BIT_ADMIN;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#cookie() cookie} to cookie.
     * @param cookie The value for cookie
     * @return {@code this} builder for chained invocation
     */
    public final Builder cookie(java.lang.String cookie) {
      checkNotIsSet(cookieIsSet(), "cookie");
      this.cookie = java.util.Objects.requireNonNull(cookie, "cookie");
      optBits |= OPT_BIT_COOKIE;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#cookie() cookie} to cookie.
     * @param cookie The value for cookie
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cookie")
    public final Builder cookie(java.util.Optional<java.lang.String> cookie) {
      checkNotIsSet(cookieIsSet(), "cookie");
      this.cookie = cookie.orElse(null);
      optBits |= OPT_BIT_COOKIE;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#refreshSecret() refreshSecret} to refreshSecret.
     * @param refreshSecret The value for refreshSecret
     * @return {@code this} builder for chained invocation
     */
    public final Builder refreshSecret(java.lang.String refreshSecret) {
      checkNotIsSet(refreshSecretIsSet(), "refreshSecret");
      this.refreshSecret = java.util.Objects.requireNonNull(refreshSecret, "refreshSecret");
      optBits |= OPT_BIT_REFRESH_SECRET;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#refreshSecret() refreshSecret} to refreshSecret.
     * @param refreshSecret The value for refreshSecret
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("refreshSecret")
    public final Builder refreshSecret(java.util.Optional<java.lang.String> refreshSecret) {
      checkNotIsSet(refreshSecretIsSet(), "refreshSecret");
      this.refreshSecret = refreshSecret.orElse(null);
      optBits |= OPT_BIT_REFRESH_SECRET;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#authTime() authTime} to authTime.
     * @param authTime The value for authTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder authTime(com.fhir.instant authTime) {
      checkNotIsSet(authTimeIsSet(), "authTime");
      this.authTime = java.util.Objects.requireNonNull(authTime, "authTime");
      optBits |= OPT_BIT_AUTH_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#authTime() authTime} to authTime.
     * @param authTime The value for authTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authTime")
    public final Builder authTime(java.util.Optional<? extends com.fhir.instant> authTime) {
      checkNotIsSet(authTimeIsSet(), "authTime");
      this.authTime = authTime.orElse(null);
      optBits |= OPT_BIT_AUTH_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#remoteAddress() remoteAddress} to remoteAddress.
     * @param remoteAddress The value for remoteAddress
     * @return {@code this} builder for chained invocation
     */
    public final Builder remoteAddress(java.lang.String remoteAddress) {
      checkNotIsSet(remoteAddressIsSet(), "remoteAddress");
      this.remoteAddress = java.util.Objects.requireNonNull(remoteAddress, "remoteAddress");
      optBits |= OPT_BIT_REMOTE_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#remoteAddress() remoteAddress} to remoteAddress.
     * @param remoteAddress The value for remoteAddress
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("remoteAddress")
    public final Builder remoteAddress(java.util.Optional<java.lang.String> remoteAddress) {
      checkNotIsSet(remoteAddressIsSet(), "remoteAddress");
      this.remoteAddress = remoteAddress.orElse(null);
      optBits |= OPT_BIT_REMOTE_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#client() client} to client.
     * @param client The value for client
     * @return {@code this} builder for chained invocation
     */
    public final Builder client(com.fhir.Reference client) {
      checkNotIsSet(clientIsSet(), "client");
      this.client = java.util.Objects.requireNonNull(client, "client");
      optBits |= OPT_BIT_CLIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#client() client} to client.
     * @param client The value for client
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("client")
    public final Builder client(java.util.Optional<? extends com.fhir.Reference> client) {
      checkNotIsSet(clientIsSet(), "client");
      this.client = client.orElse(null);
      optBits |= OPT_BIT_CLIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#userAgent() userAgent} to userAgent.
     * @param userAgent The value for userAgent
     * @return {@code this} builder for chained invocation
     */
    public final Builder userAgent(java.lang.String userAgent) {
      checkNotIsSet(userAgentIsSet(), "userAgent");
      this.userAgent = java.util.Objects.requireNonNull(userAgent, "userAgent");
      optBits |= OPT_BIT_USER_AGENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#userAgent() userAgent} to userAgent.
     * @param userAgent The value for userAgent
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userAgent")
    public final Builder userAgent(java.util.Optional<java.lang.String> userAgent) {
      checkNotIsSet(userAgentIsSet(), "userAgent");
      this.userAgent = userAgent.orElse(null);
      optBits |= OPT_BIT_USER_AGENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#membership() membership} to membership.
     * @param membership The value for membership
     * @return {@code this} builder for chained invocation
     */
    public final Builder membership(com.fhir.Reference membership) {
      checkNotIsSet(membershipIsSet(), "membership");
      this.membership = java.util.Objects.requireNonNull(membership, "membership");
      optBits |= OPT_BIT_MEMBERSHIP;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#membership() membership} to membership.
     * @param membership The value for membership
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("membership")
    public final Builder membership(java.util.Optional<? extends com.fhir.Reference> membership) {
      checkNotIsSet(membershipIsSet(), "membership");
      this.membership = membership.orElse(null);
      optBits |= OPT_BIT_MEMBERSHIP;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#granted() granted} to granted.
     * @param granted The value for granted
     * @return {@code this} builder for chained invocation
     */
    public final Builder granted(boolean granted) {
      checkNotIsSet(grantedIsSet(), "granted");
      this.granted = granted;
      optBits |= OPT_BIT_GRANTED;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#granted() granted} to granted.
     * @param granted The value for granted
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("granted")
    public final Builder granted(java.util.Optional<java.lang.Boolean> granted) {
      checkNotIsSet(grantedIsSet(), "granted");
      this.granted = granted.orElse(null);
      optBits |= OPT_BIT_GRANTED;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(com.fhir.uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = java.util.Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public final Builder implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#scope() scope} to scope.
     * @param scope The value for scope
     * @return {@code this} builder for chained invocation
     */
    public final Builder scope(java.lang.String scope) {
      checkNotIsSet(scopeIsSet(), "scope");
      this.scope = java.util.Objects.requireNonNull(scope, "scope");
      optBits |= OPT_BIT_SCOPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#scope() scope} to scope.
     * @param scope The value for scope
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    public final Builder scope(java.util.Optional<java.lang.String> scope) {
      checkNotIsSet(scopeIsSet(), "scope");
      this.scope = scope.orElse(null);
      optBits |= OPT_BIT_SCOPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#authMethod() authMethod} to authMethod.
     * @param authMethod The value for authMethod
     * @return {@code this} builder for chained invocation
     */
    public final Builder authMethod(java.lang.String authMethod) {
      checkNotIsSet(authMethodIsSet(), "authMethod");
      this.authMethod = java.util.Objects.requireNonNull(authMethod, "authMethod");
      optBits |= OPT_BIT_AUTH_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#authMethod() authMethod} to authMethod.
     * @param authMethod The value for authMethod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authMethod")
    public final Builder authMethod(java.util.Optional<java.lang.String> authMethod) {
      checkNotIsSet(authMethodIsSet(), "authMethod");
      this.authMethod = authMethod.orElse(null);
      optBits |= OPT_BIT_AUTH_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(com.fhir.Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = java.util.Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public final Builder meta(java.util.Optional<? extends com.fhir.Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#compartments() compartments} to compartments.
     * @param compartments The value for compartments
     * @return {@code this} builder for chained invocation
     */
    public final Builder compartments(java.util.List<com.fhir.Reference> compartments) {
      checkNotIsSet(compartmentsIsSet(), "compartments");
      this.compartments = java.util.Objects.requireNonNull(compartments, "compartments");
      optBits |= OPT_BIT_COMPARTMENTS;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#compartments() compartments} to compartments.
     * @param compartments The value for compartments
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartments")
    public final Builder compartments(java.util.Optional<? extends java.util.List<com.fhir.Reference>> compartments) {
      checkNotIsSet(compartmentsIsSet(), "compartments");
      this.compartments = compartments.orElse(null);
      optBits |= OPT_BIT_COMPARTMENTS;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(java.lang.String code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(java.util.Optional<java.lang.String> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(com.fhir.id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<? extends com.fhir.id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for chained invocation
     */
    public final Builder resourceType(java.lang.String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = java.util.Objects.requireNonNull(resourceType, "resourceType");
      optBits |= OPT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public final Builder resourceType(java.util.Optional<java.lang.String> resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = resourceType.orElse(null);
      optBits |= OPT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#revoked() revoked} to revoked.
     * @param revoked The value for revoked
     * @return {@code this} builder for chained invocation
     */
    public final Builder revoked(boolean revoked) {
      checkNotIsSet(revokedIsSet(), "revoked");
      this.revoked = revoked;
      optBits |= OPT_BIT_REVOKED;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#revoked() revoked} to revoked.
     * @param revoked The value for revoked
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("revoked")
    public final Builder revoked(java.util.Optional<java.lang.Boolean> revoked) {
      checkNotIsSet(revokedIsSet(), "revoked");
      this.revoked = revoked.orElse(null);
      optBits |= OPT_BIT_REVOKED;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#nonce() nonce} to nonce.
     * @param nonce The value for nonce
     * @return {@code this} builder for chained invocation
     */
    public final Builder nonce(java.lang.String nonce) {
      checkNotIsSet(nonceIsSet(), "nonce");
      this.nonce = java.util.Objects.requireNonNull(nonce, "nonce");
      optBits |= OPT_BIT_NONCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#nonce() nonce} to nonce.
     * @param nonce The value for nonce
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nonce")
    public final Builder nonce(java.util.Optional<java.lang.String> nonce) {
      checkNotIsSet(nonceIsSet(), "nonce");
      this.nonce = nonce.orElse(null);
      optBits |= OPT_BIT_NONCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(com.fhir.code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = java.util.Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public final Builder language(java.util.Optional<? extends com.fhir.code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#user() user} to user.
     * @param user The value for user
     * @return {@code this} builder for chained invocation
     */
    public final Builder user(com.fhir.Reference user) {
      checkNotIsSet(userIsSet(), "user");
      this.user = java.util.Objects.requireNonNull(user, "user");
      optBits |= OPT_BIT_USER;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#user() user} to user.
     * @param user The value for user
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("user")
    public final Builder user(java.util.Optional<? extends com.fhir.Reference> user) {
      checkNotIsSet(userIsSet(), "user");
      this.user = user.orElse(null);
      optBits |= OPT_BIT_USER;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#codeChallengeMethod() codeChallengeMethod} to codeChallengeMethod.
     * @param codeChallengeMethod The value for codeChallengeMethod
     * @return {@code this} builder for chained invocation
     */
    public final Builder codeChallengeMethod(java.lang.String codeChallengeMethod) {
      checkNotIsSet(codeChallengeMethodIsSet(), "codeChallengeMethod");
      this.codeChallengeMethod = java.util.Objects.requireNonNull(codeChallengeMethod, "codeChallengeMethod");
      optBits |= OPT_BIT_CODE_CHALLENGE_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#codeChallengeMethod() codeChallengeMethod} to codeChallengeMethod.
     * @param codeChallengeMethod The value for codeChallengeMethod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("codeChallengeMethod")
    public final Builder codeChallengeMethod(java.util.Optional<java.lang.String> codeChallengeMethod) {
      checkNotIsSet(codeChallengeMethodIsSet(), "codeChallengeMethod");
      this.codeChallengeMethod = codeChallengeMethod.orElse(null);
      optBits |= OPT_BIT_CODE_CHALLENGE_METHOD;
      return this;
    }

    /**
     * Builds a new {@link Login Login}.
     * @return An immutable instance of Login
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Login build() {
      return new ImmutableLogin(
          codeChallenge,
          admin,
          cookie,
          refreshSecret,
          authTime,
          remoteAddress,
          client,
          userAgent,
          membership,
          granted,
          implicitRules,
          scope,
          authMethod,
          meta,
          compartments,
          code,
          id,
          resourceType,
          revoked,
          nonce,
          language,
          user,
          codeChallengeMethod);
    }

    private boolean codeChallengeIsSet() {
      return (optBits & OPT_BIT_CODE_CHALLENGE) != 0;
    }

    private boolean adminIsSet() {
      return (optBits & OPT_BIT_ADMIN) != 0;
    }

    private boolean cookieIsSet() {
      return (optBits & OPT_BIT_COOKIE) != 0;
    }

    private boolean refreshSecretIsSet() {
      return (optBits & OPT_BIT_REFRESH_SECRET) != 0;
    }

    private boolean authTimeIsSet() {
      return (optBits & OPT_BIT_AUTH_TIME) != 0;
    }

    private boolean remoteAddressIsSet() {
      return (optBits & OPT_BIT_REMOTE_ADDRESS) != 0;
    }

    private boolean clientIsSet() {
      return (optBits & OPT_BIT_CLIENT) != 0;
    }

    private boolean userAgentIsSet() {
      return (optBits & OPT_BIT_USER_AGENT) != 0;
    }

    private boolean membershipIsSet() {
      return (optBits & OPT_BIT_MEMBERSHIP) != 0;
    }

    private boolean grantedIsSet() {
      return (optBits & OPT_BIT_GRANTED) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean scopeIsSet() {
      return (optBits & OPT_BIT_SCOPE) != 0;
    }

    private boolean authMethodIsSet() {
      return (optBits & OPT_BIT_AUTH_METHOD) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean compartmentsIsSet() {
      return (optBits & OPT_BIT_COMPARTMENTS) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (optBits & OPT_BIT_RESOURCE_TYPE) != 0;
    }

    private boolean revokedIsSet() {
      return (optBits & OPT_BIT_REVOKED) != 0;
    }

    private boolean nonceIsSet() {
      return (optBits & OPT_BIT_NONCE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean userIsSet() {
      return (optBits & OPT_BIT_USER) != 0;
    }

    private boolean codeChallengeMethodIsSet() {
      return (optBits & OPT_BIT_CODE_CHALLENGE_METHOD) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Login is strict, attribute is already set: ".concat(name));
    }
  }
}

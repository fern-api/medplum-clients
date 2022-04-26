package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Login}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLogin.builder()}.
 */
@Generated(from = "Login", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableLogin implements Login {
  private final @Nullable String authMethod;
  private final @Nullable String refreshSecret;
  private final @Nullable String resourceType;
  private final @Nullable Code language;
  private final @Nullable Uri implicitRules;
  private final @Nullable String code;
  private final @Nullable Boolean revoked;
  private final @Nullable Boolean admin;
  private final @Nullable Reference user;
  private final @Nullable Boolean granted;
  private final @Nullable Instant authTime;
  private final @Nullable Reference client;
  private final @Nullable Meta meta;
  private final @Nullable Reference membership;
  private final @Nullable String cookie;
  private final @Nullable String codeChallengeMethod;
  private final @Nullable String remoteAddress;
  private final @Nullable String scope;
  private final @Nullable List<Reference> compartments;
  private final @Nullable String nonce;
  private final @Nullable String userAgent;
  private final @Nullable Id id;
  private final @Nullable String codeChallenge;

  private ImmutableLogin(
      @Nullable String authMethod,
      @Nullable String refreshSecret,
      @Nullable String resourceType,
      @Nullable Code language,
      @Nullable Uri implicitRules,
      @Nullable String code,
      @Nullable Boolean revoked,
      @Nullable Boolean admin,
      @Nullable Reference user,
      @Nullable Boolean granted,
      @Nullable Instant authTime,
      @Nullable Reference client,
      @Nullable Meta meta,
      @Nullable Reference membership,
      @Nullable String cookie,
      @Nullable String codeChallengeMethod,
      @Nullable String remoteAddress,
      @Nullable String scope,
      @Nullable List<Reference> compartments,
      @Nullable String nonce,
      @Nullable String userAgent,
      @Nullable Id id,
      @Nullable String codeChallenge) {
    this.authMethod = authMethod;
    this.refreshSecret = refreshSecret;
    this.resourceType = resourceType;
    this.language = language;
    this.implicitRules = implicitRules;
    this.code = code;
    this.revoked = revoked;
    this.admin = admin;
    this.user = user;
    this.granted = granted;
    this.authTime = authTime;
    this.client = client;
    this.meta = meta;
    this.membership = membership;
    this.cookie = cookie;
    this.codeChallengeMethod = codeChallengeMethod;
    this.remoteAddress = remoteAddress;
    this.scope = scope;
    this.compartments = compartments;
    this.nonce = nonce;
    this.userAgent = userAgent;
    this.id = id;
    this.codeChallenge = codeChallenge;
  }

  /**
   * @return The value of the {@code authMethod} attribute
   */
  @JsonProperty("authMethod")
  @Override
  public Optional<String> authMethod() {
    return Optional.ofNullable(authMethod);
  }

  /**
   * @return The value of the {@code refreshSecret} attribute
   */
  @JsonProperty("refreshSecret")
  @Override
  public Optional<String> refreshSecret() {
    return Optional.ofNullable(refreshSecret);
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public Optional<String> resourceType() {
    return Optional.ofNullable(resourceType);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<String> code() {
    return Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code revoked} attribute
   */
  @JsonProperty("revoked")
  @Override
  public Optional<Boolean> revoked() {
    return Optional.ofNullable(revoked);
  }

  /**
   * @return The value of the {@code admin} attribute
   */
  @JsonProperty("admin")
  @Override
  public Optional<Boolean> admin() {
    return Optional.ofNullable(admin);
  }

  /**
   * @return The value of the {@code user} attribute
   */
  @JsonProperty("user")
  @Override
  public Optional<Reference> user() {
    return Optional.ofNullable(user);
  }

  /**
   * @return The value of the {@code granted} attribute
   */
  @JsonProperty("granted")
  @Override
  public Optional<Boolean> granted() {
    return Optional.ofNullable(granted);
  }

  /**
   * @return The value of the {@code authTime} attribute
   */
  @JsonProperty("authTime")
  @Override
  public Optional<Instant> authTime() {
    return Optional.ofNullable(authTime);
  }

  /**
   * @return The value of the {@code client} attribute
   */
  @JsonProperty("client")
  @Override
  public Optional<Reference> client() {
    return Optional.ofNullable(client);
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code membership} attribute
   */
  @JsonProperty("membership")
  @Override
  public Optional<Reference> membership() {
    return Optional.ofNullable(membership);
  }

  /**
   * @return The value of the {@code cookie} attribute
   */
  @JsonProperty("cookie")
  @Override
  public Optional<String> cookie() {
    return Optional.ofNullable(cookie);
  }

  /**
   * @return The value of the {@code codeChallengeMethod} attribute
   */
  @JsonProperty("codeChallengeMethod")
  @Override
  public Optional<String> codeChallengeMethod() {
    return Optional.ofNullable(codeChallengeMethod);
  }

  /**
   * @return The value of the {@code remoteAddress} attribute
   */
  @JsonProperty("remoteAddress")
  @Override
  public Optional<String> remoteAddress() {
    return Optional.ofNullable(remoteAddress);
  }

  /**
   * @return The value of the {@code scope} attribute
   */
  @JsonProperty("scope")
  @Override
  public Optional<String> scope() {
    return Optional.ofNullable(scope);
  }

  /**
   * @return The value of the {@code compartments} attribute
   */
  @JsonProperty("compartments")
  @Override
  public Optional<List<Reference>> compartments() {
    return Optional.ofNullable(compartments);
  }

  /**
   * @return The value of the {@code nonce} attribute
   */
  @JsonProperty("nonce")
  @Override
  public Optional<String> nonce() {
    return Optional.ofNullable(nonce);
  }

  /**
   * @return The value of the {@code userAgent} attribute
   */
  @JsonProperty("userAgent")
  @Override
  public Optional<String> userAgent() {
    return Optional.ofNullable(userAgent);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code codeChallenge} attribute
   */
  @JsonProperty("codeChallenge")
  @Override
  public Optional<String> codeChallenge() {
    return Optional.ofNullable(codeChallenge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#authMethod() authMethod} attribute.
   * @param value The value for authMethod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withAuthMethod(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "authMethod");
    if (Objects.equals(this.authMethod, newValue)) return this;
    return new ImmutableLogin(
        newValue,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#authMethod() authMethod} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authMethod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withAuthMethod(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.authMethod, value)) return this;
    return new ImmutableLogin(
        value,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#refreshSecret() refreshSecret} attribute.
   * @param value The value for refreshSecret
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withRefreshSecret(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "refreshSecret");
    if (Objects.equals(this.refreshSecret, newValue)) return this;
    return new ImmutableLogin(
        this.authMethod,
        newValue,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#refreshSecret() refreshSecret} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for refreshSecret
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withRefreshSecret(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.refreshSecret, value)) return this;
    return new ImmutableLogin(
        this.authMethod,
        value,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#resourceType() resourceType} attribute.
   * @param value The value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withResourceType(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "resourceType");
    if (Objects.equals(this.resourceType, newValue)) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        newValue,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#resourceType() resourceType} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withResourceType(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.resourceType, value)) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        value,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        newValue,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLogin withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        value,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        newValue,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLogin withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        value,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withCode(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "code");
    if (Objects.equals(this.code, newValue)) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        newValue,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#code() code} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withCode(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.code, value)) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        value,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#revoked() revoked} attribute.
   * @param value The value for revoked
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withRevoked(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.revoked, newValue)) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        newValue,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#revoked() revoked} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for revoked
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withRevoked(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.revoked, value)) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        value,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#admin() admin} attribute.
   * @param value The value for admin
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withAdmin(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.admin, newValue)) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        newValue,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#admin() admin} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for admin
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withAdmin(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.admin, value)) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        value,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#user() user} attribute.
   * @param value The value for user
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withUser(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "user");
    if (this.user == newValue) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        newValue,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#user() user} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for user
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLogin withUser(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.user == value) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        value,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#granted() granted} attribute.
   * @param value The value for granted
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withGranted(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.granted, newValue)) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        newValue,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#granted() granted} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for granted
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withGranted(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.granted, value)) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        value,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#authTime() authTime} attribute.
   * @param value The value for authTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withAuthTime(Instant value) {
    @Nullable Instant newValue = Objects.requireNonNull(value, "authTime");
    if (this.authTime == newValue) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        newValue,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#authTime() authTime} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authTime
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLogin withAuthTime(Optional<? extends Instant> optional) {
    @Nullable Instant value = optional.orElse(null);
    if (this.authTime == value) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        value,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#client() client} attribute.
   * @param value The value for client
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withClient(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "client");
    if (this.client == newValue) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        newValue,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#client() client} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for client
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLogin withClient(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.client == value) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        value,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        newValue,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLogin withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        value,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#membership() membership} attribute.
   * @param value The value for membership
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withMembership(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "membership");
    if (this.membership == newValue) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        newValue,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#membership() membership} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for membership
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLogin withMembership(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.membership == value) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        value,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#cookie() cookie} attribute.
   * @param value The value for cookie
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withCookie(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "cookie");
    if (Objects.equals(this.cookie, newValue)) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        newValue,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#cookie() cookie} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for cookie
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withCookie(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.cookie, value)) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        value,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#codeChallengeMethod() codeChallengeMethod} attribute.
   * @param value The value for codeChallengeMethod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withCodeChallengeMethod(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "codeChallengeMethod");
    if (Objects.equals(this.codeChallengeMethod, newValue)) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        newValue,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#codeChallengeMethod() codeChallengeMethod} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for codeChallengeMethod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withCodeChallengeMethod(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.codeChallengeMethod, value)) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        value,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#remoteAddress() remoteAddress} attribute.
   * @param value The value for remoteAddress
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withRemoteAddress(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "remoteAddress");
    if (Objects.equals(this.remoteAddress, newValue)) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        newValue,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#remoteAddress() remoteAddress} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for remoteAddress
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withRemoteAddress(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.remoteAddress, value)) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        value,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#scope() scope} attribute.
   * @param value The value for scope
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withScope(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "scope");
    if (Objects.equals(this.scope, newValue)) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        newValue,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#scope() scope} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for scope
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withScope(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.scope, value)) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        value,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#compartments() compartments} attribute.
   * @param value The value for compartments
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withCompartments(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "compartments");
    if (this.compartments == newValue) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        newValue,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#compartments() compartments} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for compartments
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLogin withCompartments(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.compartments == value) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        value,
        this.nonce,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#nonce() nonce} attribute.
   * @param value The value for nonce
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withNonce(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "nonce");
    if (Objects.equals(this.nonce, newValue)) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        newValue,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#nonce() nonce} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for nonce
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withNonce(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.nonce, value)) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        value,
        this.userAgent,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#userAgent() userAgent} attribute.
   * @param value The value for userAgent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withUserAgent(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "userAgent");
    if (Objects.equals(this.userAgent, newValue)) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        newValue,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#userAgent() userAgent} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for userAgent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withUserAgent(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.userAgent, value)) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        value,
        this.id,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        newValue,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLogin withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        value,
        this.codeChallenge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#codeChallenge() codeChallenge} attribute.
   * @param value The value for codeChallenge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withCodeChallenge(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "codeChallenge");
    if (Objects.equals(this.codeChallenge, newValue)) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#codeChallenge() codeChallenge} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for codeChallenge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withCodeChallenge(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.codeChallenge, value)) return this;
    return new ImmutableLogin(
        this.authMethod,
        this.refreshSecret,
        this.resourceType,
        this.language,
        this.implicitRules,
        this.code,
        this.revoked,
        this.admin,
        this.user,
        this.granted,
        this.authTime,
        this.client,
        this.meta,
        this.membership,
        this.cookie,
        this.codeChallengeMethod,
        this.remoteAddress,
        this.scope,
        this.compartments,
        this.nonce,
        this.userAgent,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLogin} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLogin
        && equalTo((ImmutableLogin) another);
  }

  private boolean equalTo(ImmutableLogin another) {
    return Objects.equals(authMethod, another.authMethod)
        && Objects.equals(refreshSecret, another.refreshSecret)
        && Objects.equals(resourceType, another.resourceType)
        && Objects.equals(language, another.language)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(code, another.code)
        && Objects.equals(revoked, another.revoked)
        && Objects.equals(admin, another.admin)
        && Objects.equals(user, another.user)
        && Objects.equals(granted, another.granted)
        && Objects.equals(authTime, another.authTime)
        && Objects.equals(client, another.client)
        && Objects.equals(meta, another.meta)
        && Objects.equals(membership, another.membership)
        && Objects.equals(cookie, another.cookie)
        && Objects.equals(codeChallengeMethod, another.codeChallengeMethod)
        && Objects.equals(remoteAddress, another.remoteAddress)
        && Objects.equals(scope, another.scope)
        && Objects.equals(compartments, another.compartments)
        && Objects.equals(nonce, another.nonce)
        && Objects.equals(userAgent, another.userAgent)
        && Objects.equals(id, another.id)
        && Objects.equals(codeChallenge, another.codeChallenge);
  }

  /**
   * Computes a hash code from attributes: {@code authMethod}, {@code refreshSecret}, {@code resourceType}, {@code language}, {@code implicitRules}, {@code code}, {@code revoked}, {@code admin}, {@code user}, {@code granted}, {@code authTime}, {@code client}, {@code meta}, {@code membership}, {@code cookie}, {@code codeChallengeMethod}, {@code remoteAddress}, {@code scope}, {@code compartments}, {@code nonce}, {@code userAgent}, {@code id}, {@code codeChallenge}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(authMethod);
    h += (h << 5) + Objects.hashCode(refreshSecret);
    h += (h << 5) + Objects.hashCode(resourceType);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(revoked);
    h += (h << 5) + Objects.hashCode(admin);
    h += (h << 5) + Objects.hashCode(user);
    h += (h << 5) + Objects.hashCode(granted);
    h += (h << 5) + Objects.hashCode(authTime);
    h += (h << 5) + Objects.hashCode(client);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(membership);
    h += (h << 5) + Objects.hashCode(cookie);
    h += (h << 5) + Objects.hashCode(codeChallengeMethod);
    h += (h << 5) + Objects.hashCode(remoteAddress);
    h += (h << 5) + Objects.hashCode(scope);
    h += (h << 5) + Objects.hashCode(compartments);
    h += (h << 5) + Objects.hashCode(nonce);
    h += (h << 5) + Objects.hashCode(userAgent);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(codeChallenge);
    return h;
  }

  /**
   * Prints the immutable value {@code Login} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Login{");
    if (authMethod != null) {
      builder.append("authMethod=").append(authMethod);
    }
    if (refreshSecret != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("refreshSecret=").append(refreshSecret);
    }
    if (resourceType != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("resourceType=").append(resourceType);
    }
    if (language != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (implicitRules != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (code != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (revoked != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("revoked=").append(revoked);
    }
    if (admin != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("admin=").append(admin);
    }
    if (user != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("user=").append(user);
    }
    if (granted != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("granted=").append(granted);
    }
    if (authTime != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("authTime=").append(authTime);
    }
    if (client != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("client=").append(client);
    }
    if (meta != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (membership != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("membership=").append(membership);
    }
    if (cookie != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("cookie=").append(cookie);
    }
    if (codeChallengeMethod != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("codeChallengeMethod=").append(codeChallengeMethod);
    }
    if (remoteAddress != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("remoteAddress=").append(remoteAddress);
    }
    if (scope != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("scope=").append(scope);
    }
    if (compartments != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("compartments=").append(compartments);
    }
    if (nonce != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("nonce=").append(nonce);
    }
    if (userAgent != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("userAgent=").append(userAgent);
    }
    if (id != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (codeChallenge != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("codeChallenge=").append(codeChallenge);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Login", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Login {
    @Nullable Optional<String> authMethod = Optional.empty();
    boolean authMethodIsSet;
    @Nullable Optional<String> refreshSecret = Optional.empty();
    boolean refreshSecretIsSet;
    @Nullable Optional<String> resourceType = Optional.empty();
    boolean resourceTypeIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<String> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<Boolean> revoked = Optional.empty();
    boolean revokedIsSet;
    @Nullable Optional<Boolean> admin = Optional.empty();
    boolean adminIsSet;
    @Nullable Optional<Reference> user = Optional.empty();
    boolean userIsSet;
    @Nullable Optional<Boolean> granted = Optional.empty();
    boolean grantedIsSet;
    @Nullable Optional<Instant> authTime = Optional.empty();
    boolean authTimeIsSet;
    @Nullable Optional<Reference> client = Optional.empty();
    boolean clientIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Reference> membership = Optional.empty();
    boolean membershipIsSet;
    @Nullable Optional<String> cookie = Optional.empty();
    boolean cookieIsSet;
    @Nullable Optional<String> codeChallengeMethod = Optional.empty();
    boolean codeChallengeMethodIsSet;
    @Nullable Optional<String> remoteAddress = Optional.empty();
    boolean remoteAddressIsSet;
    @Nullable Optional<String> scope = Optional.empty();
    boolean scopeIsSet;
    @Nullable Optional<List<Reference>> compartments = Optional.empty();
    boolean compartmentsIsSet;
    @Nullable Optional<String> nonce = Optional.empty();
    boolean nonceIsSet;
    @Nullable Optional<String> userAgent = Optional.empty();
    boolean userAgentIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> codeChallenge = Optional.empty();
    boolean codeChallengeIsSet;
    @JsonProperty("authMethod")
    public void setAuthMethod(Optional<String> authMethod) {
      this.authMethod = authMethod;
      this.authMethodIsSet = true;
    }
    @JsonProperty("refreshSecret")
    public void setRefreshSecret(Optional<String> refreshSecret) {
      this.refreshSecret = refreshSecret;
      this.refreshSecretIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(Optional<String> resourceType) {
      this.resourceType = resourceType;
      this.resourceTypeIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<String> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("revoked")
    public void setRevoked(Optional<Boolean> revoked) {
      this.revoked = revoked;
      this.revokedIsSet = true;
    }
    @JsonProperty("admin")
    public void setAdmin(Optional<Boolean> admin) {
      this.admin = admin;
      this.adminIsSet = true;
    }
    @JsonProperty("user")
    public void setUser(Optional<Reference> user) {
      this.user = user;
      this.userIsSet = true;
    }
    @JsonProperty("granted")
    public void setGranted(Optional<Boolean> granted) {
      this.granted = granted;
      this.grantedIsSet = true;
    }
    @JsonProperty("authTime")
    public void setAuthTime(Optional<Instant> authTime) {
      this.authTime = authTime;
      this.authTimeIsSet = true;
    }
    @JsonProperty("client")
    public void setClient(Optional<Reference> client) {
      this.client = client;
      this.clientIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("membership")
    public void setMembership(Optional<Reference> membership) {
      this.membership = membership;
      this.membershipIsSet = true;
    }
    @JsonProperty("cookie")
    public void setCookie(Optional<String> cookie) {
      this.cookie = cookie;
      this.cookieIsSet = true;
    }
    @JsonProperty("codeChallengeMethod")
    public void setCodeChallengeMethod(Optional<String> codeChallengeMethod) {
      this.codeChallengeMethod = codeChallengeMethod;
      this.codeChallengeMethodIsSet = true;
    }
    @JsonProperty("remoteAddress")
    public void setRemoteAddress(Optional<String> remoteAddress) {
      this.remoteAddress = remoteAddress;
      this.remoteAddressIsSet = true;
    }
    @JsonProperty("scope")
    public void setScope(Optional<String> scope) {
      this.scope = scope;
      this.scopeIsSet = true;
    }
    @JsonProperty("compartments")
    public void setCompartments(Optional<List<Reference>> compartments) {
      this.compartments = compartments;
      this.compartmentsIsSet = true;
    }
    @JsonProperty("nonce")
    public void setNonce(Optional<String> nonce) {
      this.nonce = nonce;
      this.nonceIsSet = true;
    }
    @JsonProperty("userAgent")
    public void setUserAgent(Optional<String> userAgent) {
      this.userAgent = userAgent;
      this.userAgentIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("codeChallenge")
    public void setCodeChallenge(Optional<String> codeChallenge) {
      this.codeChallenge = codeChallenge;
      this.codeChallengeIsSet = true;
    }
    @Override
    public Optional<String> authMethod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> refreshSecret() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> revoked() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> admin() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> user() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> granted() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Instant> authTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> client() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> membership() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> cookie() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> codeChallengeMethod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> remoteAddress() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> scope() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> compartments() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> nonce() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> userAgent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> codeChallenge() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableLogin fromJson(Json json) {
    ImmutableLogin.Builder builder = ImmutableLogin.builder();
    if (json.authMethodIsSet) {
      builder.authMethod(json.authMethod);
    }
    if (json.refreshSecretIsSet) {
      builder.refreshSecret(json.refreshSecret);
    }
    if (json.resourceTypeIsSet) {
      builder.resourceType(json.resourceType);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.revokedIsSet) {
      builder.revoked(json.revoked);
    }
    if (json.adminIsSet) {
      builder.admin(json.admin);
    }
    if (json.userIsSet) {
      builder.user(json.user);
    }
    if (json.grantedIsSet) {
      builder.granted(json.granted);
    }
    if (json.authTimeIsSet) {
      builder.authTime(json.authTime);
    }
    if (json.clientIsSet) {
      builder.client(json.client);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.membershipIsSet) {
      builder.membership(json.membership);
    }
    if (json.cookieIsSet) {
      builder.cookie(json.cookie);
    }
    if (json.codeChallengeMethodIsSet) {
      builder.codeChallengeMethod(json.codeChallengeMethod);
    }
    if (json.remoteAddressIsSet) {
      builder.remoteAddress(json.remoteAddress);
    }
    if (json.scopeIsSet) {
      builder.scope(json.scope);
    }
    if (json.compartmentsIsSet) {
      builder.compartments(json.compartments);
    }
    if (json.nonceIsSet) {
      builder.nonce(json.nonce);
    }
    if (json.userAgentIsSet) {
      builder.userAgent(json.userAgent);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.codeChallengeIsSet) {
      builder.codeChallenge(json.codeChallenge);
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
        .authMethod(instance.authMethod())
        .refreshSecret(instance.refreshSecret())
        .resourceType(instance.resourceType())
        .language(instance.language())
        .implicitRules(instance.implicitRules())
        .code(instance.code())
        .revoked(instance.revoked())
        .admin(instance.admin())
        .user(instance.user())
        .granted(instance.granted())
        .authTime(instance.authTime())
        .client(instance.client())
        .meta(instance.meta())
        .membership(instance.membership())
        .cookie(instance.cookie())
        .codeChallengeMethod(instance.codeChallengeMethod())
        .remoteAddress(instance.remoteAddress())
        .scope(instance.scope())
        .compartments(instance.compartments())
        .nonce(instance.nonce())
        .userAgent(instance.userAgent())
        .id(instance.id())
        .codeChallenge(instance.codeChallenge())
        .build();
  }

  /**
   * Creates a builder for {@link Login Login}.
   * <pre>
   * ImmutableLogin.builder()
   *    .authMethod(String) // optional {@link Login#authMethod() authMethod}
   *    .refreshSecret(String) // optional {@link Login#refreshSecret() refreshSecret}
   *    .resourceType(String) // optional {@link Login#resourceType() resourceType}
   *    .language(com.medplum.types.fhir.Code) // optional {@link Login#language() language}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link Login#implicitRules() implicitRules}
   *    .code(String) // optional {@link Login#code() code}
   *    .revoked(Boolean) // optional {@link Login#revoked() revoked}
   *    .admin(Boolean) // optional {@link Login#admin() admin}
   *    .user(com.medplum.types.fhir.Reference) // optional {@link Login#user() user}
   *    .granted(Boolean) // optional {@link Login#granted() granted}
   *    .authTime(com.medplum.types.fhir.Instant) // optional {@link Login#authTime() authTime}
   *    .client(com.medplum.types.fhir.Reference) // optional {@link Login#client() client}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link Login#meta() meta}
   *    .membership(com.medplum.types.fhir.Reference) // optional {@link Login#membership() membership}
   *    .cookie(String) // optional {@link Login#cookie() cookie}
   *    .codeChallengeMethod(String) // optional {@link Login#codeChallengeMethod() codeChallengeMethod}
   *    .remoteAddress(String) // optional {@link Login#remoteAddress() remoteAddress}
   *    .scope(String) // optional {@link Login#scope() scope}
   *    .compartments(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link Login#compartments() compartments}
   *    .nonce(String) // optional {@link Login#nonce() nonce}
   *    .userAgent(String) // optional {@link Login#userAgent() userAgent}
   *    .id(com.medplum.types.fhir.Id) // optional {@link Login#id() id}
   *    .codeChallenge(String) // optional {@link Login#codeChallenge() codeChallenge}
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
  @Generated(from = "Login", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_AUTH_METHOD = 0x1L;
    private static final long OPT_BIT_REFRESH_SECRET = 0x2L;
    private static final long OPT_BIT_RESOURCE_TYPE = 0x4L;
    private static final long OPT_BIT_LANGUAGE = 0x8L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x10L;
    private static final long OPT_BIT_CODE = 0x20L;
    private static final long OPT_BIT_REVOKED = 0x40L;
    private static final long OPT_BIT_ADMIN = 0x80L;
    private static final long OPT_BIT_USER = 0x100L;
    private static final long OPT_BIT_GRANTED = 0x200L;
    private static final long OPT_BIT_AUTH_TIME = 0x400L;
    private static final long OPT_BIT_CLIENT = 0x800L;
    private static final long OPT_BIT_META = 0x1000L;
    private static final long OPT_BIT_MEMBERSHIP = 0x2000L;
    private static final long OPT_BIT_COOKIE = 0x4000L;
    private static final long OPT_BIT_CODE_CHALLENGE_METHOD = 0x8000L;
    private static final long OPT_BIT_REMOTE_ADDRESS = 0x10000L;
    private static final long OPT_BIT_SCOPE = 0x20000L;
    private static final long OPT_BIT_COMPARTMENTS = 0x40000L;
    private static final long OPT_BIT_NONCE = 0x80000L;
    private static final long OPT_BIT_USER_AGENT = 0x100000L;
    private static final long OPT_BIT_ID = 0x200000L;
    private static final long OPT_BIT_CODE_CHALLENGE = 0x400000L;
    private long optBits;

    private @Nullable String authMethod;
    private @Nullable String refreshSecret;
    private @Nullable String resourceType;
    private @Nullable Code language;
    private @Nullable Uri implicitRules;
    private @Nullable String code;
    private @Nullable Boolean revoked;
    private @Nullable Boolean admin;
    private @Nullable Reference user;
    private @Nullable Boolean granted;
    private @Nullable Instant authTime;
    private @Nullable Reference client;
    private @Nullable Meta meta;
    private @Nullable Reference membership;
    private @Nullable String cookie;
    private @Nullable String codeChallengeMethod;
    private @Nullable String remoteAddress;
    private @Nullable String scope;
    private @Nullable List<Reference> compartments;
    private @Nullable String nonce;
    private @Nullable String userAgent;
    private @Nullable Id id;
    private @Nullable String codeChallenge;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Login#authMethod() authMethod} to authMethod.
     * @param authMethod The value for authMethod
     * @return {@code this} builder for chained invocation
     */
    public final Builder authMethod(String authMethod) {
      checkNotIsSet(authMethodIsSet(), "authMethod");
      this.authMethod = Objects.requireNonNull(authMethod, "authMethod");
      optBits |= OPT_BIT_AUTH_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#authMethod() authMethod} to authMethod.
     * @param authMethod The value for authMethod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("authMethod")
    public final Builder authMethod(Optional<String> authMethod) {
      checkNotIsSet(authMethodIsSet(), "authMethod");
      this.authMethod = authMethod.orElse(null);
      optBits |= OPT_BIT_AUTH_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#refreshSecret() refreshSecret} to refreshSecret.
     * @param refreshSecret The value for refreshSecret
     * @return {@code this} builder for chained invocation
     */
    public final Builder refreshSecret(String refreshSecret) {
      checkNotIsSet(refreshSecretIsSet(), "refreshSecret");
      this.refreshSecret = Objects.requireNonNull(refreshSecret, "refreshSecret");
      optBits |= OPT_BIT_REFRESH_SECRET;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#refreshSecret() refreshSecret} to refreshSecret.
     * @param refreshSecret The value for refreshSecret
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("refreshSecret")
    public final Builder refreshSecret(Optional<String> refreshSecret) {
      checkNotIsSet(refreshSecretIsSet(), "refreshSecret");
      this.refreshSecret = refreshSecret.orElse(null);
      optBits |= OPT_BIT_REFRESH_SECRET;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for chained invocation
     */
    public final Builder resourceType(String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = Objects.requireNonNull(resourceType, "resourceType");
      optBits |= OPT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resourceType")
    public final Builder resourceType(Optional<String> resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = resourceType.orElse(null);
      optBits |= OPT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(Code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("language")
    public final Builder language(Optional<? extends Code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(Uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("implicitRules")
    public final Builder implicitRules(Optional<? extends Uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(String code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<String> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
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
    @JsonProperty("revoked")
    public final Builder revoked(Optional<Boolean> revoked) {
      checkNotIsSet(revokedIsSet(), "revoked");
      this.revoked = revoked.orElse(null);
      optBits |= OPT_BIT_REVOKED;
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
    @JsonProperty("admin")
    public final Builder admin(Optional<Boolean> admin) {
      checkNotIsSet(adminIsSet(), "admin");
      this.admin = admin.orElse(null);
      optBits |= OPT_BIT_ADMIN;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#user() user} to user.
     * @param user The value for user
     * @return {@code this} builder for chained invocation
     */
    public final Builder user(Reference user) {
      checkNotIsSet(userIsSet(), "user");
      this.user = Objects.requireNonNull(user, "user");
      optBits |= OPT_BIT_USER;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#user() user} to user.
     * @param user The value for user
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("user")
    public final Builder user(Optional<? extends Reference> user) {
      checkNotIsSet(userIsSet(), "user");
      this.user = user.orElse(null);
      optBits |= OPT_BIT_USER;
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
    @JsonProperty("granted")
    public final Builder granted(Optional<Boolean> granted) {
      checkNotIsSet(grantedIsSet(), "granted");
      this.granted = granted.orElse(null);
      optBits |= OPT_BIT_GRANTED;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#authTime() authTime} to authTime.
     * @param authTime The value for authTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder authTime(Instant authTime) {
      checkNotIsSet(authTimeIsSet(), "authTime");
      this.authTime = Objects.requireNonNull(authTime, "authTime");
      optBits |= OPT_BIT_AUTH_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#authTime() authTime} to authTime.
     * @param authTime The value for authTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("authTime")
    public final Builder authTime(Optional<? extends Instant> authTime) {
      checkNotIsSet(authTimeIsSet(), "authTime");
      this.authTime = authTime.orElse(null);
      optBits |= OPT_BIT_AUTH_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#client() client} to client.
     * @param client The value for client
     * @return {@code this} builder for chained invocation
     */
    public final Builder client(Reference client) {
      checkNotIsSet(clientIsSet(), "client");
      this.client = Objects.requireNonNull(client, "client");
      optBits |= OPT_BIT_CLIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#client() client} to client.
     * @param client The value for client
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("client")
    public final Builder client(Optional<? extends Reference> client) {
      checkNotIsSet(clientIsSet(), "client");
      this.client = client.orElse(null);
      optBits |= OPT_BIT_CLIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("meta")
    public final Builder meta(Optional<? extends Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#membership() membership} to membership.
     * @param membership The value for membership
     * @return {@code this} builder for chained invocation
     */
    public final Builder membership(Reference membership) {
      checkNotIsSet(membershipIsSet(), "membership");
      this.membership = Objects.requireNonNull(membership, "membership");
      optBits |= OPT_BIT_MEMBERSHIP;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#membership() membership} to membership.
     * @param membership The value for membership
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("membership")
    public final Builder membership(Optional<? extends Reference> membership) {
      checkNotIsSet(membershipIsSet(), "membership");
      this.membership = membership.orElse(null);
      optBits |= OPT_BIT_MEMBERSHIP;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#cookie() cookie} to cookie.
     * @param cookie The value for cookie
     * @return {@code this} builder for chained invocation
     */
    public final Builder cookie(String cookie) {
      checkNotIsSet(cookieIsSet(), "cookie");
      this.cookie = Objects.requireNonNull(cookie, "cookie");
      optBits |= OPT_BIT_COOKIE;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#cookie() cookie} to cookie.
     * @param cookie The value for cookie
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("cookie")
    public final Builder cookie(Optional<String> cookie) {
      checkNotIsSet(cookieIsSet(), "cookie");
      this.cookie = cookie.orElse(null);
      optBits |= OPT_BIT_COOKIE;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#codeChallengeMethod() codeChallengeMethod} to codeChallengeMethod.
     * @param codeChallengeMethod The value for codeChallengeMethod
     * @return {@code this} builder for chained invocation
     */
    public final Builder codeChallengeMethod(String codeChallengeMethod) {
      checkNotIsSet(codeChallengeMethodIsSet(), "codeChallengeMethod");
      this.codeChallengeMethod = Objects.requireNonNull(codeChallengeMethod, "codeChallengeMethod");
      optBits |= OPT_BIT_CODE_CHALLENGE_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#codeChallengeMethod() codeChallengeMethod} to codeChallengeMethod.
     * @param codeChallengeMethod The value for codeChallengeMethod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("codeChallengeMethod")
    public final Builder codeChallengeMethod(Optional<String> codeChallengeMethod) {
      checkNotIsSet(codeChallengeMethodIsSet(), "codeChallengeMethod");
      this.codeChallengeMethod = codeChallengeMethod.orElse(null);
      optBits |= OPT_BIT_CODE_CHALLENGE_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#remoteAddress() remoteAddress} to remoteAddress.
     * @param remoteAddress The value for remoteAddress
     * @return {@code this} builder for chained invocation
     */
    public final Builder remoteAddress(String remoteAddress) {
      checkNotIsSet(remoteAddressIsSet(), "remoteAddress");
      this.remoteAddress = Objects.requireNonNull(remoteAddress, "remoteAddress");
      optBits |= OPT_BIT_REMOTE_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#remoteAddress() remoteAddress} to remoteAddress.
     * @param remoteAddress The value for remoteAddress
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("remoteAddress")
    public final Builder remoteAddress(Optional<String> remoteAddress) {
      checkNotIsSet(remoteAddressIsSet(), "remoteAddress");
      this.remoteAddress = remoteAddress.orElse(null);
      optBits |= OPT_BIT_REMOTE_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#scope() scope} to scope.
     * @param scope The value for scope
     * @return {@code this} builder for chained invocation
     */
    public final Builder scope(String scope) {
      checkNotIsSet(scopeIsSet(), "scope");
      this.scope = Objects.requireNonNull(scope, "scope");
      optBits |= OPT_BIT_SCOPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#scope() scope} to scope.
     * @param scope The value for scope
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("scope")
    public final Builder scope(Optional<String> scope) {
      checkNotIsSet(scopeIsSet(), "scope");
      this.scope = scope.orElse(null);
      optBits |= OPT_BIT_SCOPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#compartments() compartments} to compartments.
     * @param compartments The value for compartments
     * @return {@code this} builder for chained invocation
     */
    public final Builder compartments(List<Reference> compartments) {
      checkNotIsSet(compartmentsIsSet(), "compartments");
      this.compartments = Objects.requireNonNull(compartments, "compartments");
      optBits |= OPT_BIT_COMPARTMENTS;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#compartments() compartments} to compartments.
     * @param compartments The value for compartments
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("compartments")
    public final Builder compartments(Optional<? extends List<Reference>> compartments) {
      checkNotIsSet(compartmentsIsSet(), "compartments");
      this.compartments = compartments.orElse(null);
      optBits |= OPT_BIT_COMPARTMENTS;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#nonce() nonce} to nonce.
     * @param nonce The value for nonce
     * @return {@code this} builder for chained invocation
     */
    public final Builder nonce(String nonce) {
      checkNotIsSet(nonceIsSet(), "nonce");
      this.nonce = Objects.requireNonNull(nonce, "nonce");
      optBits |= OPT_BIT_NONCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#nonce() nonce} to nonce.
     * @param nonce The value for nonce
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("nonce")
    public final Builder nonce(Optional<String> nonce) {
      checkNotIsSet(nonceIsSet(), "nonce");
      this.nonce = nonce.orElse(null);
      optBits |= OPT_BIT_NONCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#userAgent() userAgent} to userAgent.
     * @param userAgent The value for userAgent
     * @return {@code this} builder for chained invocation
     */
    public final Builder userAgent(String userAgent) {
      checkNotIsSet(userAgentIsSet(), "userAgent");
      this.userAgent = Objects.requireNonNull(userAgent, "userAgent");
      optBits |= OPT_BIT_USER_AGENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#userAgent() userAgent} to userAgent.
     * @param userAgent The value for userAgent
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("userAgent")
    public final Builder userAgent(Optional<String> userAgent) {
      checkNotIsSet(userAgentIsSet(), "userAgent");
      this.userAgent = userAgent.orElse(null);
      optBits |= OPT_BIT_USER_AGENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(Id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<? extends Id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#codeChallenge() codeChallenge} to codeChallenge.
     * @param codeChallenge The value for codeChallenge
     * @return {@code this} builder for chained invocation
     */
    public final Builder codeChallenge(String codeChallenge) {
      checkNotIsSet(codeChallengeIsSet(), "codeChallenge");
      this.codeChallenge = Objects.requireNonNull(codeChallenge, "codeChallenge");
      optBits |= OPT_BIT_CODE_CHALLENGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Login#codeChallenge() codeChallenge} to codeChallenge.
     * @param codeChallenge The value for codeChallenge
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("codeChallenge")
    public final Builder codeChallenge(Optional<String> codeChallenge) {
      checkNotIsSet(codeChallengeIsSet(), "codeChallenge");
      this.codeChallenge = codeChallenge.orElse(null);
      optBits |= OPT_BIT_CODE_CHALLENGE;
      return this;
    }

    /**
     * Builds a new {@link Login Login}.
     * @return An immutable instance of Login
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Login build() {
      return new ImmutableLogin(
          authMethod,
          refreshSecret,
          resourceType,
          language,
          implicitRules,
          code,
          revoked,
          admin,
          user,
          granted,
          authTime,
          client,
          meta,
          membership,
          cookie,
          codeChallengeMethod,
          remoteAddress,
          scope,
          compartments,
          nonce,
          userAgent,
          id,
          codeChallenge);
    }

    private boolean authMethodIsSet() {
      return (optBits & OPT_BIT_AUTH_METHOD) != 0;
    }

    private boolean refreshSecretIsSet() {
      return (optBits & OPT_BIT_REFRESH_SECRET) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (optBits & OPT_BIT_RESOURCE_TYPE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean revokedIsSet() {
      return (optBits & OPT_BIT_REVOKED) != 0;
    }

    private boolean adminIsSet() {
      return (optBits & OPT_BIT_ADMIN) != 0;
    }

    private boolean userIsSet() {
      return (optBits & OPT_BIT_USER) != 0;
    }

    private boolean grantedIsSet() {
      return (optBits & OPT_BIT_GRANTED) != 0;
    }

    private boolean authTimeIsSet() {
      return (optBits & OPT_BIT_AUTH_TIME) != 0;
    }

    private boolean clientIsSet() {
      return (optBits & OPT_BIT_CLIENT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean membershipIsSet() {
      return (optBits & OPT_BIT_MEMBERSHIP) != 0;
    }

    private boolean cookieIsSet() {
      return (optBits & OPT_BIT_COOKIE) != 0;
    }

    private boolean codeChallengeMethodIsSet() {
      return (optBits & OPT_BIT_CODE_CHALLENGE_METHOD) != 0;
    }

    private boolean remoteAddressIsSet() {
      return (optBits & OPT_BIT_REMOTE_ADDRESS) != 0;
    }

    private boolean scopeIsSet() {
      return (optBits & OPT_BIT_SCOPE) != 0;
    }

    private boolean compartmentsIsSet() {
      return (optBits & OPT_BIT_COMPARTMENTS) != 0;
    }

    private boolean nonceIsSet() {
      return (optBits & OPT_BIT_NONCE) != 0;
    }

    private boolean userAgentIsSet() {
      return (optBits & OPT_BIT_USER_AGENT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean codeChallengeIsSet() {
      return (optBits & OPT_BIT_CODE_CHALLENGE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Login is strict, attribute is already set: ".concat(name));
    }
  }
}
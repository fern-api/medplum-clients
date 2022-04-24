//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link PasswordChangeRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePasswordChangeRequest.builder()}.
 */
@org.immutables.value.Generated(from = "PasswordChangeRequest", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePasswordChangeRequest implements com.fhir.PasswordChangeRequest {
  private final @javax.annotation.Nullable java.lang.String secret;
  private final @javax.annotation.Nullable java.lang.Boolean used;
  private final @javax.annotation.Nullable com.fhir.Reference user;
  private final @javax.annotation.Nullable java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.lang.String redirectUri;
  private final @javax.annotation.Nullable com.fhir.Meta meta;

  private ImmutablePasswordChangeRequest(
      @javax.annotation.Nullable java.lang.String secret,
      @javax.annotation.Nullable java.lang.Boolean used,
      @javax.annotation.Nullable com.fhir.Reference user,
      @javax.annotation.Nullable java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.lang.String redirectUri,
      @javax.annotation.Nullable com.fhir.Meta meta) {
    this.secret = secret;
    this.used = used;
    this.user = user;
    this.resourceType = resourceType;
    this.implicitRules = implicitRules;
    this.language = language;
    this.id = id;
    this.redirectUri = redirectUri;
    this.meta = meta;
  }

  /**
   * @return The value of the {@code secret} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("secret")
  @Override
  public java.util.Optional<java.lang.String> secret() {
    return java.util.Optional.ofNullable(secret);
  }

  /**
   * @return The value of the {@code used} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("used")
  @Override
  public java.util.Optional<java.lang.Boolean> used() {
    return java.util.Optional.ofNullable(used);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.util.Optional<java.lang.String> resourceType() {
    return java.util.Optional.ofNullable(resourceType);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
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
   * @return The value of the {@code redirectUri} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("redirectUri")
  @Override
  public java.util.Optional<java.lang.String> redirectUri() {
    return java.util.Optional.ofNullable(redirectUri);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PasswordChangeRequest#secret() secret} attribute.
   * @param value The value for secret
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePasswordChangeRequest withSecret(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "secret");
    if (java.util.Objects.equals(this.secret, newValue)) return this;
    return new ImmutablePasswordChangeRequest(
        newValue,
        this.used,
        this.user,
        this.resourceType,
        this.implicitRules,
        this.language,
        this.id,
        this.redirectUri,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PasswordChangeRequest#secret() secret} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for secret
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePasswordChangeRequest withSecret(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.secret, value)) return this;
    return new ImmutablePasswordChangeRequest(
        value,
        this.used,
        this.user,
        this.resourceType,
        this.implicitRules,
        this.language,
        this.id,
        this.redirectUri,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PasswordChangeRequest#used() used} attribute.
   * @param value The value for used
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePasswordChangeRequest withUsed(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.used, newValue)) return this;
    return new ImmutablePasswordChangeRequest(
        this.secret,
        newValue,
        this.user,
        this.resourceType,
        this.implicitRules,
        this.language,
        this.id,
        this.redirectUri,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PasswordChangeRequest#used() used} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for used
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePasswordChangeRequest withUsed(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.used, value)) return this;
    return new ImmutablePasswordChangeRequest(
        this.secret,
        value,
        this.user,
        this.resourceType,
        this.implicitRules,
        this.language,
        this.id,
        this.redirectUri,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PasswordChangeRequest#user() user} attribute.
   * @param value The value for user
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePasswordChangeRequest withUser(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "user");
    if (this.user == newValue) return this;
    return new ImmutablePasswordChangeRequest(
        this.secret,
        this.used,
        newValue,
        this.resourceType,
        this.implicitRules,
        this.language,
        this.id,
        this.redirectUri,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PasswordChangeRequest#user() user} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for user
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePasswordChangeRequest withUser(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.user == value) return this;
    return new ImmutablePasswordChangeRequest(
        this.secret,
        this.used,
        value,
        this.resourceType,
        this.implicitRules,
        this.language,
        this.id,
        this.redirectUri,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PasswordChangeRequest#resourceType() resourceType} attribute.
   * @param value The value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePasswordChangeRequest withResourceType(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (java.util.Objects.equals(this.resourceType, newValue)) return this;
    return new ImmutablePasswordChangeRequest(
        this.secret,
        this.used,
        this.user,
        newValue,
        this.implicitRules,
        this.language,
        this.id,
        this.redirectUri,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PasswordChangeRequest#resourceType() resourceType} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePasswordChangeRequest withResourceType(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.resourceType, value)) return this;
    return new ImmutablePasswordChangeRequest(
        this.secret,
        this.used,
        this.user,
        value,
        this.implicitRules,
        this.language,
        this.id,
        this.redirectUri,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PasswordChangeRequest#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePasswordChangeRequest withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutablePasswordChangeRequest(
        this.secret,
        this.used,
        this.user,
        this.resourceType,
        newValue,
        this.language,
        this.id,
        this.redirectUri,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PasswordChangeRequest#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePasswordChangeRequest withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutablePasswordChangeRequest(
        this.secret,
        this.used,
        this.user,
        this.resourceType,
        value,
        this.language,
        this.id,
        this.redirectUri,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PasswordChangeRequest#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePasswordChangeRequest withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutablePasswordChangeRequest(
        this.secret,
        this.used,
        this.user,
        this.resourceType,
        this.implicitRules,
        newValue,
        this.id,
        this.redirectUri,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PasswordChangeRequest#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePasswordChangeRequest withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutablePasswordChangeRequest(
        this.secret,
        this.used,
        this.user,
        this.resourceType,
        this.implicitRules,
        value,
        this.id,
        this.redirectUri,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PasswordChangeRequest#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePasswordChangeRequest withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutablePasswordChangeRequest(
        this.secret,
        this.used,
        this.user,
        this.resourceType,
        this.implicitRules,
        this.language,
        newValue,
        this.redirectUri,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PasswordChangeRequest#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePasswordChangeRequest withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutablePasswordChangeRequest(
        this.secret,
        this.used,
        this.user,
        this.resourceType,
        this.implicitRules,
        this.language,
        value,
        this.redirectUri,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PasswordChangeRequest#redirectUri() redirectUri} attribute.
   * @param value The value for redirectUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePasswordChangeRequest withRedirectUri(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "redirectUri");
    if (java.util.Objects.equals(this.redirectUri, newValue)) return this;
    return new ImmutablePasswordChangeRequest(
        this.secret,
        this.used,
        this.user,
        this.resourceType,
        this.implicitRules,
        this.language,
        this.id,
        newValue,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PasswordChangeRequest#redirectUri() redirectUri} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for redirectUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePasswordChangeRequest withRedirectUri(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.redirectUri, value)) return this;
    return new ImmutablePasswordChangeRequest(
        this.secret,
        this.used,
        this.user,
        this.resourceType,
        this.implicitRules,
        this.language,
        this.id,
        value,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PasswordChangeRequest#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePasswordChangeRequest withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutablePasswordChangeRequest(
        this.secret,
        this.used,
        this.user,
        this.resourceType,
        this.implicitRules,
        this.language,
        this.id,
        this.redirectUri,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PasswordChangeRequest#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePasswordChangeRequest withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutablePasswordChangeRequest(
        this.secret,
        this.used,
        this.user,
        this.resourceType,
        this.implicitRules,
        this.language,
        this.id,
        this.redirectUri,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePasswordChangeRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePasswordChangeRequest
        && equalTo((ImmutablePasswordChangeRequest) another);
  }

  private boolean equalTo(ImmutablePasswordChangeRequest another) {
    return java.util.Objects.equals(secret, another.secret)
        && java.util.Objects.equals(used, another.used)
        && java.util.Objects.equals(user, another.user)
        && java.util.Objects.equals(resourceType, another.resourceType)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(redirectUri, another.redirectUri)
        && java.util.Objects.equals(meta, another.meta);
  }

  /**
   * Computes a hash code from attributes: {@code secret}, {@code used}, {@code user}, {@code resourceType}, {@code implicitRules}, {@code language}, {@code id}, {@code redirectUri}, {@code meta}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(secret);
    h += (h << 5) + java.util.Objects.hashCode(used);
    h += (h << 5) + java.util.Objects.hashCode(user);
    h += (h << 5) + java.util.Objects.hashCode(resourceType);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(redirectUri);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    return h;
  }

  /**
   * Prints the immutable value {@code PasswordChangeRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("PasswordChangeRequest{");
    if (secret != null) {
      builder.append("secret=").append(secret);
    }
    if (used != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("used=").append(used);
    }
    if (user != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("user=").append(user);
    }
    if (resourceType != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("resourceType=").append(resourceType);
    }
    if (implicitRules != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (language != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (id != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (redirectUri != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("redirectUri=").append(redirectUri);
    }
    if (meta != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "PasswordChangeRequest", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.PasswordChangeRequest {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> secret = java.util.Optional.empty();
    boolean secretIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> used = java.util.Optional.empty();
    boolean usedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> user = java.util.Optional.empty();
    boolean userIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> resourceType = java.util.Optional.empty();
    boolean resourceTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> redirectUri = java.util.Optional.empty();
    boolean redirectUriIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("secret")
    public void setSecret(java.util.Optional<java.lang.String> secret) {
      this.secret = secret;
      this.secretIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("used")
    public void setUsed(java.util.Optional<java.lang.Boolean> used) {
      this.used = used;
      this.usedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("user")
    public void setUser(java.util.Optional<com.fhir.Reference> user) {
      this.user = user;
      this.userIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.util.Optional<java.lang.String> resourceType) {
      this.resourceType = resourceType;
      this.resourceTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("redirectUri")
    public void setRedirectUri(java.util.Optional<java.lang.String> redirectUri) {
      this.redirectUri = redirectUri;
      this.redirectUriIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> secret() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> used() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> user() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> redirectUri() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutablePasswordChangeRequest fromJson(Json json) {
    ImmutablePasswordChangeRequest.Builder builder = ImmutablePasswordChangeRequest.builder();
    if (json.secretIsSet) {
      builder.secret(json.secret);
    }
    if (json.usedIsSet) {
      builder.used(json.used);
    }
    if (json.userIsSet) {
      builder.user(json.user);
    }
    if (json.resourceTypeIsSet) {
      builder.resourceType(json.resourceType);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.redirectUriIsSet) {
      builder.redirectUri(json.redirectUri);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    return (ImmutablePasswordChangeRequest) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PasswordChangeRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PasswordChangeRequest instance
   */
  public static PasswordChangeRequest copyOf(PasswordChangeRequest instance) {
    if (instance instanceof ImmutablePasswordChangeRequest) {
      return (ImmutablePasswordChangeRequest) instance;
    }
    return ImmutablePasswordChangeRequest.builder()
        .secret(instance.secret())
        .used(instance.used())
        .user(instance.user())
        .resourceType(instance.resourceType())
        .implicitRules(instance.implicitRules())
        .language(instance.language())
        .id(instance.id())
        .redirectUri(instance.redirectUri())
        .meta(instance.meta())
        .build();
  }

  /**
   * Creates a builder for {@link PasswordChangeRequest PasswordChangeRequest}.
   * <pre>
   * ImmutablePasswordChangeRequest.builder()
   *    .secret(String) // optional {@link PasswordChangeRequest#secret() secret}
   *    .used(Boolean) // optional {@link PasswordChangeRequest#used() used}
   *    .user(com.fhir.Reference) // optional {@link PasswordChangeRequest#user() user}
   *    .resourceType(String) // optional {@link PasswordChangeRequest#resourceType() resourceType}
   *    .implicitRules(com.fhir.uri) // optional {@link PasswordChangeRequest#implicitRules() implicitRules}
   *    .language(com.fhir.code) // optional {@link PasswordChangeRequest#language() language}
   *    .id(com.fhir.id) // optional {@link PasswordChangeRequest#id() id}
   *    .redirectUri(String) // optional {@link PasswordChangeRequest#redirectUri() redirectUri}
   *    .meta(com.fhir.Meta) // optional {@link PasswordChangeRequest#meta() meta}
   *    .build();
   * </pre>
   * @return A new PasswordChangeRequest builder
   */
  public static ImmutablePasswordChangeRequest.Builder builder() {
    return new ImmutablePasswordChangeRequest.Builder();
  }

  /**
   * Builds instances of type {@link PasswordChangeRequest PasswordChangeRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "PasswordChangeRequest", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_SECRET = 0x1L;
    private static final long OPT_BIT_USED = 0x2L;
    private static final long OPT_BIT_USER = 0x4L;
    private static final long OPT_BIT_RESOURCE_TYPE = 0x8L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x10L;
    private static final long OPT_BIT_LANGUAGE = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_REDIRECT_URI = 0x80L;
    private static final long OPT_BIT_META = 0x100L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String secret;
    private @javax.annotation.Nullable java.lang.Boolean used;
    private @javax.annotation.Nullable com.fhir.Reference user;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.lang.String redirectUri;
    private @javax.annotation.Nullable com.fhir.Meta meta;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link PasswordChangeRequest#secret() secret} to secret.
     * @param secret The value for secret
     * @return {@code this} builder for chained invocation
     */
    public final Builder secret(java.lang.String secret) {
      checkNotIsSet(secretIsSet(), "secret");
      this.secret = java.util.Objects.requireNonNull(secret, "secret");
      optBits |= OPT_BIT_SECRET;
      return this;
    }

    /**
     * Initializes the optional value {@link PasswordChangeRequest#secret() secret} to secret.
     * @param secret The value for secret
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secret")
    public final Builder secret(java.util.Optional<java.lang.String> secret) {
      checkNotIsSet(secretIsSet(), "secret");
      this.secret = secret.orElse(null);
      optBits |= OPT_BIT_SECRET;
      return this;
    }

    /**
     * Initializes the optional value {@link PasswordChangeRequest#used() used} to used.
     * @param used The value for used
     * @return {@code this} builder for chained invocation
     */
    public final Builder used(boolean used) {
      checkNotIsSet(usedIsSet(), "used");
      this.used = used;
      optBits |= OPT_BIT_USED;
      return this;
    }

    /**
     * Initializes the optional value {@link PasswordChangeRequest#used() used} to used.
     * @param used The value for used
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("used")
    public final Builder used(java.util.Optional<java.lang.Boolean> used) {
      checkNotIsSet(usedIsSet(), "used");
      this.used = used.orElse(null);
      optBits |= OPT_BIT_USED;
      return this;
    }

    /**
     * Initializes the optional value {@link PasswordChangeRequest#user() user} to user.
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
     * Initializes the optional value {@link PasswordChangeRequest#user() user} to user.
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
     * Initializes the optional value {@link PasswordChangeRequest#resourceType() resourceType} to resourceType.
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
     * Initializes the optional value {@link PasswordChangeRequest#resourceType() resourceType} to resourceType.
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
     * Initializes the optional value {@link PasswordChangeRequest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link PasswordChangeRequest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link PasswordChangeRequest#language() language} to language.
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
     * Initializes the optional value {@link PasswordChangeRequest#language() language} to language.
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
     * Initializes the optional value {@link PasswordChangeRequest#id() id} to id.
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
     * Initializes the optional value {@link PasswordChangeRequest#id() id} to id.
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
     * Initializes the optional value {@link PasswordChangeRequest#redirectUri() redirectUri} to redirectUri.
     * @param redirectUri The value for redirectUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder redirectUri(java.lang.String redirectUri) {
      checkNotIsSet(redirectUriIsSet(), "redirectUri");
      this.redirectUri = java.util.Objects.requireNonNull(redirectUri, "redirectUri");
      optBits |= OPT_BIT_REDIRECT_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link PasswordChangeRequest#redirectUri() redirectUri} to redirectUri.
     * @param redirectUri The value for redirectUri
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("redirectUri")
    public final Builder redirectUri(java.util.Optional<java.lang.String> redirectUri) {
      checkNotIsSet(redirectUriIsSet(), "redirectUri");
      this.redirectUri = redirectUri.orElse(null);
      optBits |= OPT_BIT_REDIRECT_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link PasswordChangeRequest#meta() meta} to meta.
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
     * Initializes the optional value {@link PasswordChangeRequest#meta() meta} to meta.
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
     * Builds a new {@link PasswordChangeRequest PasswordChangeRequest}.
     * @return An immutable instance of PasswordChangeRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.PasswordChangeRequest build() {
      return new ImmutablePasswordChangeRequest(secret, used, user, resourceType, implicitRules, language, id, redirectUri, meta);
    }

    private boolean secretIsSet() {
      return (optBits & OPT_BIT_SECRET) != 0;
    }

    private boolean usedIsSet() {
      return (optBits & OPT_BIT_USED) != 0;
    }

    private boolean userIsSet() {
      return (optBits & OPT_BIT_USER) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (optBits & OPT_BIT_RESOURCE_TYPE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean redirectUriIsSet() {
      return (optBits & OPT_BIT_REDIRECT_URI) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of PasswordChangeRequest is strict, attribute is already set: ".concat(name));
    }
  }
}

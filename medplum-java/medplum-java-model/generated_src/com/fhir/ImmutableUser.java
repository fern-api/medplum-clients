//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link User}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUser.builder()}.
 */
@org.immutables.value.Generated(from = "User", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableUser implements com.fhir.User {
  private final java.lang.String passwordHash;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final java.lang.String email;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.lang.String resourceType;
  private final @javax.annotation.Nullable java.lang.Boolean admin;

  private ImmutableUser(
      java.lang.String passwordHash,
      @javax.annotation.Nullable com.fhir.id id,
      java.lang.String email,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.lang.String resourceType,
      @javax.annotation.Nullable java.lang.Boolean admin) {
    this.passwordHash = passwordHash;
    this.id = id;
    this.email = email;
    this.meta = meta;
    this.implicitRules = implicitRules;
    this.language = language;
    this.resourceType = resourceType;
    this.admin = admin;
  }

  /**
   * @return The value of the {@code passwordHash} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("passwordHash")
  @Override
  public java.lang.String passwordHash() {
    return passwordHash;
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
   * @return The value of the {@code email} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("email")
  @Override
  public java.lang.String email() {
    return email;
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.util.Optional<java.lang.String> resourceType() {
    return java.util.Optional.ofNullable(resourceType);
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
   * Copy the current immutable object by setting a value for the {@link User#passwordHash() passwordHash} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for passwordHash
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUser withPasswordHash(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "passwordHash");
    if (this.passwordHash.equals(newValue)) return this;
    return new ImmutableUser(
        newValue,
        this.id,
        this.email,
        this.meta,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.admin);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link User#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUser withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableUser(
        this.passwordHash,
        newValue,
        this.email,
        this.meta,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.admin);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link User#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUser withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableUser(
        this.passwordHash,
        value,
        this.email,
        this.meta,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.admin);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link User#email() email} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for email
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUser withEmail(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "email");
    if (this.email.equals(newValue)) return this;
    return new ImmutableUser(
        this.passwordHash,
        this.id,
        newValue,
        this.meta,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.admin);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link User#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUser withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableUser(
        this.passwordHash,
        this.id,
        this.email,
        newValue,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.admin);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link User#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUser withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableUser(
        this.passwordHash,
        this.id,
        this.email,
        value,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.admin);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link User#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUser withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableUser(
        this.passwordHash,
        this.id,
        this.email,
        this.meta,
        newValue,
        this.language,
        this.resourceType,
        this.admin);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link User#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUser withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableUser(
        this.passwordHash,
        this.id,
        this.email,
        this.meta,
        value,
        this.language,
        this.resourceType,
        this.admin);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link User#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUser withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableUser(
        this.passwordHash,
        this.id,
        this.email,
        this.meta,
        this.implicitRules,
        newValue,
        this.resourceType,
        this.admin);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link User#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUser withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableUser(
        this.passwordHash,
        this.id,
        this.email,
        this.meta,
        this.implicitRules,
        value,
        this.resourceType,
        this.admin);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link User#resourceType() resourceType} attribute.
   * @param value The value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUser withResourceType(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (java.util.Objects.equals(this.resourceType, newValue)) return this;
    return new ImmutableUser(
        this.passwordHash,
        this.id,
        this.email,
        this.meta,
        this.implicitRules,
        this.language,
        newValue,
        this.admin);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link User#resourceType() resourceType} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUser withResourceType(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.resourceType, value)) return this;
    return new ImmutableUser(
        this.passwordHash,
        this.id,
        this.email,
        this.meta,
        this.implicitRules,
        this.language,
        value,
        this.admin);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link User#admin() admin} attribute.
   * @param value The value for admin
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUser withAdmin(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.admin, newValue)) return this;
    return new ImmutableUser(
        this.passwordHash,
        this.id,
        this.email,
        this.meta,
        this.implicitRules,
        this.language,
        this.resourceType,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link User#admin() admin} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for admin
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUser withAdmin(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.admin, value)) return this;
    return new ImmutableUser(
        this.passwordHash,
        this.id,
        this.email,
        this.meta,
        this.implicitRules,
        this.language,
        this.resourceType,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUser} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUser
        && equalTo((ImmutableUser) another);
  }

  private boolean equalTo(ImmutableUser another) {
    return passwordHash.equals(another.passwordHash)
        && java.util.Objects.equals(id, another.id)
        && email.equals(another.email)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(resourceType, another.resourceType)
        && java.util.Objects.equals(admin, another.admin);
  }

  /**
   * Computes a hash code from attributes: {@code passwordHash}, {@code id}, {@code email}, {@code meta}, {@code implicitRules}, {@code language}, {@code resourceType}, {@code admin}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + passwordHash.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + email.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(resourceType);
    h += (h << 5) + java.util.Objects.hashCode(admin);
    return h;
  }

  /**
   * Prints the immutable value {@code User} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("User{");
    builder.append("passwordHash=").append(passwordHash);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    builder.append(", ");
    builder.append("email=").append(email);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (resourceType != null) {
      builder.append(", ");
      builder.append("resourceType=").append(resourceType);
    }
    if (admin != null) {
      builder.append(", ");
      builder.append("admin=").append(admin);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "User", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.User {
    @javax.annotation.Nullable java.lang.String passwordHash;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.lang.String email;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> resourceType = java.util.Optional.empty();
    boolean resourceTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> admin = java.util.Optional.empty();
    boolean adminIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("passwordHash")
    public void setPasswordHash(java.lang.String passwordHash) {
      this.passwordHash = passwordHash;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("email")
    public void setEmail(java.lang.String email) {
      this.email = email;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.util.Optional<java.lang.String> resourceType) {
      this.resourceType = resourceType;
      this.resourceTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("admin")
    public void setAdmin(java.util.Optional<java.lang.Boolean> admin) {
      this.admin = admin;
      this.adminIsSet = true;
    }
    @Override
    public java.lang.String passwordHash() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String email() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> admin() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableUser fromJson(Json json) {
    ImmutableUser.Builder builder = ((ImmutableUser.Builder) ImmutableUser.builder());
    if (json.passwordHash != null) {
      builder.passwordHash(json.passwordHash);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.email != null) {
      builder.email(json.email);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.resourceTypeIsSet) {
      builder.resourceType(json.resourceType);
    }
    if (json.adminIsSet) {
      builder.admin(json.admin);
    }
    return (ImmutableUser) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link User} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable User instance
   */
  public static User copyOf(User instance) {
    if (instance instanceof ImmutableUser) {
      return (ImmutableUser) instance;
    }
    return ((ImmutableUser.Builder) ImmutableUser.builder())
        .passwordHash(instance.passwordHash())
        .id(instance.id())
        .email(instance.email())
        .meta(instance.meta())
        .implicitRules(instance.implicitRules())
        .language(instance.language())
        .resourceType(instance.resourceType())
        .admin(instance.admin())
        .build();
  }

  /**
   * Creates a builder for {@link User User}.
   * <pre>
   * ImmutableUser.builder()
   *    .passwordHash(String) // required {@link User#passwordHash() passwordHash}
   *    .id(com.fhir.id) // optional {@link User#id() id}
   *    .email(String) // required {@link User#email() email}
   *    .meta(com.fhir.Meta) // optional {@link User#meta() meta}
   *    .implicitRules(com.fhir.uri) // optional {@link User#implicitRules() implicitRules}
   *    .language(com.fhir.code) // optional {@link User#language() language}
   *    .resourceType(String) // optional {@link User#resourceType() resourceType}
   *    .admin(Boolean) // optional {@link User#admin() admin}
   *    .build();
   * </pre>
   * @return A new User builder
   */
  public static PasswordHashBuildStage builder() {
    return new ImmutableUser.Builder();
  }

  /**
   * Builds instances of type {@link User User}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "User", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements PasswordHashBuildStage, EmailBuildStage, BuildFinal {
    private static final long INIT_BIT_PASSWORD_HASH = 0x1L;
    private static final long INIT_BIT_EMAIL = 0x2L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_META = 0x2L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4L;
    private static final long OPT_BIT_LANGUAGE = 0x8L;
    private static final long OPT_BIT_RESOURCE_TYPE = 0x10L;
    private static final long OPT_BIT_ADMIN = 0x20L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String passwordHash;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.lang.String email;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.lang.Boolean admin;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link User#passwordHash() passwordHash} attribute.
     * @param passwordHash The value for passwordHash 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordHash")
    public final Builder passwordHash(java.lang.String passwordHash) {
      checkNotIsSet(passwordHashIsSet(), "passwordHash");
      this.passwordHash = java.util.Objects.requireNonNull(passwordHash, "passwordHash");
      initBits &= ~INIT_BIT_PASSWORD_HASH;
      return this;
    }

    /**
     * Initializes the optional value {@link User#id() id} to id.
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
     * Initializes the optional value {@link User#id() id} to id.
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
     * Initializes the value for the {@link User#email() email} attribute.
     * @param email The value for email 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("email")
    public final Builder email(java.lang.String email) {
      checkNotIsSet(emailIsSet(), "email");
      this.email = java.util.Objects.requireNonNull(email, "email");
      initBits &= ~INIT_BIT_EMAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link User#meta() meta} to meta.
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
     * Initializes the optional value {@link User#meta() meta} to meta.
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
     * Initializes the optional value {@link User#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link User#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link User#language() language} to language.
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
     * Initializes the optional value {@link User#language() language} to language.
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
     * Initializes the optional value {@link User#resourceType() resourceType} to resourceType.
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
     * Initializes the optional value {@link User#resourceType() resourceType} to resourceType.
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
     * Initializes the optional value {@link User#admin() admin} to admin.
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
     * Initializes the optional value {@link User#admin() admin} to admin.
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
     * Builds a new {@link User User}.
     * @return An immutable instance of User
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.User build() {
      checkRequiredAttributes();
      return new ImmutableUser(passwordHash, id, email, meta, implicitRules, language, resourceType, admin);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (optBits & OPT_BIT_RESOURCE_TYPE) != 0;
    }

    private boolean adminIsSet() {
      return (optBits & OPT_BIT_ADMIN) != 0;
    }

    private boolean passwordHashIsSet() {
      return (initBits & INIT_BIT_PASSWORD_HASH) == 0;
    }

    private boolean emailIsSet() {
      return (initBits & INIT_BIT_EMAIL) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of User is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!passwordHashIsSet()) attributes.add("passwordHash");
      if (!emailIsSet()) attributes.add("email");
      return "Cannot build User, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "User", generator = "Immutables")
  public interface PasswordHashBuildStage {
    /**
     * Initializes the value for the {@link User#passwordHash() passwordHash} attribute.
     * @param passwordHash The value for passwordHash 
     * @return {@code this} builder for use in a chained invocation
     */
    EmailBuildStage passwordHash(java.lang.String passwordHash);
  }

  @org.immutables.value.Generated(from = "User", generator = "Immutables")
  public interface EmailBuildStage {
    /**
     * Initializes the value for the {@link User#email() email} attribute.
     * @param email The value for email 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal email(java.lang.String email);
  }

  @org.immutables.value.Generated(from = "User", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link User#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link User#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link User#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link User#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link User#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link User#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link User#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link User#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link User#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);

    /**
     * Initializes the optional value {@link User#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.util.Optional<java.lang.String> resourceType);

    /**
     * Initializes the optional value {@link User#admin() admin} to admin.
     * @param admin The value for admin
     * @return {@code this} builder for chained invocation
     */
    BuildFinal admin(boolean admin);

    /**
     * Initializes the optional value {@link User#admin() admin} to admin.
     * @param admin The value for admin
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal admin(java.util.Optional<java.lang.Boolean> admin);

    /**
     * Builds a new {@link User User}.
     * @return An immutable instance of User
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    User build();
  }
}

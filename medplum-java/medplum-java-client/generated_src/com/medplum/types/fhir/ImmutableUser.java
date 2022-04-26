package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link User}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUser.builder()}.
 */
@Generated(from = "User", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableUser implements User {
  private final @Nullable Meta meta;
  private final @Nullable Id id;
  private final @Nullable Uri implicitRules;
  private final @Nullable String resourceType;
  private final @Nullable Boolean admin;
  private final String email;
  private final String passwordHash;
  private final @Nullable Code language;

  private ImmutableUser(
      @Nullable Meta meta,
      @Nullable Id id,
      @Nullable Uri implicitRules,
      @Nullable String resourceType,
      @Nullable Boolean admin,
      String email,
      String passwordHash,
      @Nullable Code language) {
    this.meta = meta;
    this.id = id;
    this.implicitRules = implicitRules;
    this.resourceType = resourceType;
    this.admin = admin;
    this.email = email;
    this.passwordHash = passwordHash;
    this.language = language;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public Optional<String> resourceType() {
    return Optional.ofNullable(resourceType);
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
   * @return The value of the {@code email} attribute
   */
  @JsonProperty("email")
  @Override
  public String email() {
    return email;
  }

  /**
   * @return The value of the {@code passwordHash} attribute
   */
  @JsonProperty("passwordHash")
  @Override
  public String passwordHash() {
    return passwordHash;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link User#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUser withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableUser(
        newValue,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.admin,
        this.email,
        this.passwordHash,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link User#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUser withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableUser(
        value,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.admin,
        this.email,
        this.passwordHash,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link User#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUser withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableUser(
        this.meta,
        newValue,
        this.implicitRules,
        this.resourceType,
        this.admin,
        this.email,
        this.passwordHash,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link User#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUser withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableUser(
        this.meta,
        value,
        this.implicitRules,
        this.resourceType,
        this.admin,
        this.email,
        this.passwordHash,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link User#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUser withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableUser(
        this.meta,
        this.id,
        newValue,
        this.resourceType,
        this.admin,
        this.email,
        this.passwordHash,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link User#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUser withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableUser(
        this.meta,
        this.id,
        value,
        this.resourceType,
        this.admin,
        this.email,
        this.passwordHash,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link User#resourceType() resourceType} attribute.
   * @param value The value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUser withResourceType(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "resourceType");
    if (Objects.equals(this.resourceType, newValue)) return this;
    return new ImmutableUser(
        this.meta,
        this.id,
        this.implicitRules,
        newValue,
        this.admin,
        this.email,
        this.passwordHash,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link User#resourceType() resourceType} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUser withResourceType(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.resourceType, value)) return this;
    return new ImmutableUser(
        this.meta,
        this.id,
        this.implicitRules,
        value,
        this.admin,
        this.email,
        this.passwordHash,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link User#admin() admin} attribute.
   * @param value The value for admin
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUser withAdmin(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.admin, newValue)) return this;
    return new ImmutableUser(
        this.meta,
        this.id,
        this.implicitRules,
        this.resourceType,
        newValue,
        this.email,
        this.passwordHash,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link User#admin() admin} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for admin
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUser withAdmin(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.admin, value)) return this;
    return new ImmutableUser(
        this.meta,
        this.id,
        this.implicitRules,
        this.resourceType,
        value,
        this.email,
        this.passwordHash,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link User#email() email} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for email
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUser withEmail(String value) {
    String newValue = Objects.requireNonNull(value, "email");
    if (this.email.equals(newValue)) return this;
    return new ImmutableUser(
        this.meta,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.admin,
        newValue,
        this.passwordHash,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link User#passwordHash() passwordHash} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for passwordHash
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUser withPasswordHash(String value) {
    String newValue = Objects.requireNonNull(value, "passwordHash");
    if (this.passwordHash.equals(newValue)) return this;
    return new ImmutableUser(
        this.meta,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.admin,
        this.email,
        newValue,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link User#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUser withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableUser(
        this.meta,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.admin,
        this.email,
        this.passwordHash,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link User#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUser withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableUser(
        this.meta,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.admin,
        this.email,
        this.passwordHash,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUser} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUser
        && equalTo((ImmutableUser) another);
  }

  private boolean equalTo(ImmutableUser another) {
    return Objects.equals(meta, another.meta)
        && Objects.equals(id, another.id)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(resourceType, another.resourceType)
        && Objects.equals(admin, another.admin)
        && email.equals(another.email)
        && passwordHash.equals(another.passwordHash)
        && Objects.equals(language, another.language);
  }

  /**
   * Computes a hash code from attributes: {@code meta}, {@code id}, {@code implicitRules}, {@code resourceType}, {@code admin}, {@code email}, {@code passwordHash}, {@code language}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(resourceType);
    h += (h << 5) + Objects.hashCode(admin);
    h += (h << 5) + email.hashCode();
    h += (h << 5) + passwordHash.hashCode();
    h += (h << 5) + Objects.hashCode(language);
    return h;
  }

  /**
   * Prints the immutable value {@code User} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("User{");
    if (meta != null) {
      builder.append("meta=").append(meta);
    }
    if (id != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (implicitRules != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (resourceType != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("resourceType=").append(resourceType);
    }
    if (admin != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("admin=").append(admin);
    }
    if (builder.length() > 5) builder.append(", ");
    builder.append("email=").append(email);
    builder.append(", ");
    builder.append("passwordHash=").append(passwordHash);
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "User", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements User {
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<String> resourceType = Optional.empty();
    boolean resourceTypeIsSet;
    @Nullable Optional<Boolean> admin = Optional.empty();
    boolean adminIsSet;
    @Nullable String email;
    @Nullable String passwordHash;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(Optional<String> resourceType) {
      this.resourceType = resourceType;
      this.resourceTypeIsSet = true;
    }
    @JsonProperty("admin")
    public void setAdmin(Optional<Boolean> admin) {
      this.admin = admin;
      this.adminIsSet = true;
    }
    @JsonProperty("email")
    public void setEmail(String email) {
      this.email = email;
    }
    @JsonProperty("passwordHash")
    public void setPasswordHash(String passwordHash) {
      this.passwordHash = passwordHash;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> admin() { throw new UnsupportedOperationException(); }
    @Override
    public String email() { throw new UnsupportedOperationException(); }
    @Override
    public String passwordHash() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableUser fromJson(Json json) {
    ImmutableUser.Builder builder = ((ImmutableUser.Builder) ImmutableUser.builder());
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.resourceTypeIsSet) {
      builder.resourceType(json.resourceType);
    }
    if (json.adminIsSet) {
      builder.admin(json.admin);
    }
    if (json.email != null) {
      builder.email(json.email);
    }
    if (json.passwordHash != null) {
      builder.passwordHash(json.passwordHash);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
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
        .meta(instance.meta())
        .id(instance.id())
        .implicitRules(instance.implicitRules())
        .resourceType(instance.resourceType())
        .admin(instance.admin())
        .email(instance.email())
        .passwordHash(instance.passwordHash())
        .language(instance.language())
        .build();
  }

  /**
   * Creates a builder for {@link User User}.
   * <pre>
   * ImmutableUser.builder()
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link User#meta() meta}
   *    .id(com.medplum.types.fhir.Id) // optional {@link User#id() id}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link User#implicitRules() implicitRules}
   *    .resourceType(String) // optional {@link User#resourceType() resourceType}
   *    .admin(Boolean) // optional {@link User#admin() admin}
   *    .email(String) // required {@link User#email() email}
   *    .passwordHash(String) // required {@link User#passwordHash() passwordHash}
   *    .language(com.medplum.types.fhir.Code) // optional {@link User#language() language}
   *    .build();
   * </pre>
   * @return A new User builder
   */
  public static EmailBuildStage builder() {
    return new ImmutableUser.Builder();
  }

  /**
   * Builds instances of type {@link User User}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "User", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements EmailBuildStage, PasswordHashBuildStage, BuildFinal {
    private static final long INIT_BIT_EMAIL = 0x1L;
    private static final long INIT_BIT_PASSWORD_HASH = 0x2L;
    private static final long OPT_BIT_META = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4L;
    private static final long OPT_BIT_RESOURCE_TYPE = 0x8L;
    private static final long OPT_BIT_ADMIN = 0x10L;
    private static final long OPT_BIT_LANGUAGE = 0x20L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable Meta meta;
    private @Nullable Id id;
    private @Nullable Uri implicitRules;
    private @Nullable String resourceType;
    private @Nullable Boolean admin;
    private @Nullable String email;
    private @Nullable String passwordHash;
    private @Nullable Code language;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link User#meta() meta} to meta.
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
     * Initializes the optional value {@link User#meta() meta} to meta.
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
     * Initializes the optional value {@link User#id() id} to id.
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
     * Initializes the optional value {@link User#id() id} to id.
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
     * Initializes the optional value {@link User#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link User#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link User#resourceType() resourceType} to resourceType.
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
     * Initializes the optional value {@link User#resourceType() resourceType} to resourceType.
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
    @JsonProperty("admin")
    public final Builder admin(Optional<Boolean> admin) {
      checkNotIsSet(adminIsSet(), "admin");
      this.admin = admin.orElse(null);
      optBits |= OPT_BIT_ADMIN;
      return this;
    }

    /**
     * Initializes the value for the {@link User#email() email} attribute.
     * @param email The value for email 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("email")
    public final Builder email(String email) {
      checkNotIsSet(emailIsSet(), "email");
      this.email = Objects.requireNonNull(email, "email");
      initBits &= ~INIT_BIT_EMAIL;
      return this;
    }

    /**
     * Initializes the value for the {@link User#passwordHash() passwordHash} attribute.
     * @param passwordHash The value for passwordHash 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("passwordHash")
    public final Builder passwordHash(String passwordHash) {
      checkNotIsSet(passwordHashIsSet(), "passwordHash");
      this.passwordHash = Objects.requireNonNull(passwordHash, "passwordHash");
      initBits &= ~INIT_BIT_PASSWORD_HASH;
      return this;
    }

    /**
     * Initializes the optional value {@link User#language() language} to language.
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
     * Initializes the optional value {@link User#language() language} to language.
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
     * Builds a new {@link User User}.
     * @return An immutable instance of User
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public User build() {
      checkRequiredAttributes();
      return new ImmutableUser(meta, id, implicitRules, resourceType, admin, email, passwordHash, language);
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (optBits & OPT_BIT_RESOURCE_TYPE) != 0;
    }

    private boolean adminIsSet() {
      return (optBits & OPT_BIT_ADMIN) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean emailIsSet() {
      return (initBits & INIT_BIT_EMAIL) == 0;
    }

    private boolean passwordHashIsSet() {
      return (initBits & INIT_BIT_PASSWORD_HASH) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of User is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!emailIsSet()) attributes.add("email");
      if (!passwordHashIsSet()) attributes.add("passwordHash");
      return "Cannot build User, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "User", generator = "Immutables")
  public interface EmailBuildStage {
    /**
     * Initializes the value for the {@link User#email() email} attribute.
     * @param email The value for email 
     * @return {@code this} builder for use in a chained invocation
     */
    PasswordHashBuildStage email(String email);
  }

  @Generated(from = "User", generator = "Immutables")
  public interface PasswordHashBuildStage {
    /**
     * Initializes the value for the {@link User#passwordHash() passwordHash} attribute.
     * @param passwordHash The value for passwordHash 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal passwordHash(String passwordHash);
  }

  @Generated(from = "User", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link User#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link User#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link User#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link User#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link User#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link User#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link User#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal resourceType(String resourceType);

    /**
     * Initializes the optional value {@link User#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(Optional<String> resourceType);

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
    BuildFinal admin(Optional<Boolean> admin);

    /**
     * Initializes the optional value {@link User#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link User#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Builds a new {@link User User}.
     * @return An immutable instance of User
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    User build();
  }
}

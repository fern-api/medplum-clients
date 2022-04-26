package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link PasswordChangeRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePasswordChangeRequest.builder()}.
 */
@Generated(from = "PasswordChangeRequest", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePasswordChangeRequest implements PasswordChangeRequest {
  private final @Nullable Reference user;
  private final @Nullable Uri implicitRules;
  private final @Nullable String redirectUri;
  private final @Nullable String resourceType;
  private final @Nullable Boolean used;
  private final @Nullable String secret;
  private final @Nullable Meta meta;
  private final @Nullable Id id;
  private final @Nullable Code language;

  private ImmutablePasswordChangeRequest(
      @Nullable Reference user,
      @Nullable Uri implicitRules,
      @Nullable String redirectUri,
      @Nullable String resourceType,
      @Nullable Boolean used,
      @Nullable String secret,
      @Nullable Meta meta,
      @Nullable Id id,
      @Nullable Code language) {
    this.user = user;
    this.implicitRules = implicitRules;
    this.redirectUri = redirectUri;
    this.resourceType = resourceType;
    this.used = used;
    this.secret = secret;
    this.meta = meta;
    this.id = id;
    this.language = language;
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code redirectUri} attribute
   */
  @JsonProperty("redirectUri")
  @Override
  public Optional<String> redirectUri() {
    return Optional.ofNullable(redirectUri);
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
   * @return The value of the {@code used} attribute
   */
  @JsonProperty("used")
  @Override
  public Optional<Boolean> used() {
    return Optional.ofNullable(used);
  }

  /**
   * @return The value of the {@code secret} attribute
   */
  @JsonProperty("secret")
  @Override
  public Optional<String> secret() {
    return Optional.ofNullable(secret);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PasswordChangeRequest#user() user} attribute.
   * @param value The value for user
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePasswordChangeRequest withUser(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "user");
    if (this.user == newValue) return this;
    return new ImmutablePasswordChangeRequest(
        newValue,
        this.implicitRules,
        this.redirectUri,
        this.resourceType,
        this.used,
        this.secret,
        this.meta,
        this.id,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PasswordChangeRequest#user() user} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for user
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePasswordChangeRequest withUser(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.user == value) return this;
    return new ImmutablePasswordChangeRequest(
        value,
        this.implicitRules,
        this.redirectUri,
        this.resourceType,
        this.used,
        this.secret,
        this.meta,
        this.id,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PasswordChangeRequest#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePasswordChangeRequest withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutablePasswordChangeRequest(
        this.user,
        newValue,
        this.redirectUri,
        this.resourceType,
        this.used,
        this.secret,
        this.meta,
        this.id,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PasswordChangeRequest#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePasswordChangeRequest withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutablePasswordChangeRequest(
        this.user,
        value,
        this.redirectUri,
        this.resourceType,
        this.used,
        this.secret,
        this.meta,
        this.id,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PasswordChangeRequest#redirectUri() redirectUri} attribute.
   * @param value The value for redirectUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePasswordChangeRequest withRedirectUri(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "redirectUri");
    if (Objects.equals(this.redirectUri, newValue)) return this;
    return new ImmutablePasswordChangeRequest(
        this.user,
        this.implicitRules,
        newValue,
        this.resourceType,
        this.used,
        this.secret,
        this.meta,
        this.id,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PasswordChangeRequest#redirectUri() redirectUri} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for redirectUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePasswordChangeRequest withRedirectUri(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.redirectUri, value)) return this;
    return new ImmutablePasswordChangeRequest(
        this.user,
        this.implicitRules,
        value,
        this.resourceType,
        this.used,
        this.secret,
        this.meta,
        this.id,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PasswordChangeRequest#resourceType() resourceType} attribute.
   * @param value The value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePasswordChangeRequest withResourceType(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "resourceType");
    if (Objects.equals(this.resourceType, newValue)) return this;
    return new ImmutablePasswordChangeRequest(
        this.user,
        this.implicitRules,
        this.redirectUri,
        newValue,
        this.used,
        this.secret,
        this.meta,
        this.id,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PasswordChangeRequest#resourceType() resourceType} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePasswordChangeRequest withResourceType(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.resourceType, value)) return this;
    return new ImmutablePasswordChangeRequest(
        this.user,
        this.implicitRules,
        this.redirectUri,
        value,
        this.used,
        this.secret,
        this.meta,
        this.id,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PasswordChangeRequest#used() used} attribute.
   * @param value The value for used
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePasswordChangeRequest withUsed(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.used, newValue)) return this;
    return new ImmutablePasswordChangeRequest(
        this.user,
        this.implicitRules,
        this.redirectUri,
        this.resourceType,
        newValue,
        this.secret,
        this.meta,
        this.id,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PasswordChangeRequest#used() used} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for used
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePasswordChangeRequest withUsed(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.used, value)) return this;
    return new ImmutablePasswordChangeRequest(
        this.user,
        this.implicitRules,
        this.redirectUri,
        this.resourceType,
        value,
        this.secret,
        this.meta,
        this.id,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PasswordChangeRequest#secret() secret} attribute.
   * @param value The value for secret
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePasswordChangeRequest withSecret(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "secret");
    if (Objects.equals(this.secret, newValue)) return this;
    return new ImmutablePasswordChangeRequest(
        this.user,
        this.implicitRules,
        this.redirectUri,
        this.resourceType,
        this.used,
        newValue,
        this.meta,
        this.id,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PasswordChangeRequest#secret() secret} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for secret
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePasswordChangeRequest withSecret(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.secret, value)) return this;
    return new ImmutablePasswordChangeRequest(
        this.user,
        this.implicitRules,
        this.redirectUri,
        this.resourceType,
        this.used,
        value,
        this.meta,
        this.id,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PasswordChangeRequest#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePasswordChangeRequest withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutablePasswordChangeRequest(
        this.user,
        this.implicitRules,
        this.redirectUri,
        this.resourceType,
        this.used,
        this.secret,
        newValue,
        this.id,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PasswordChangeRequest#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePasswordChangeRequest withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutablePasswordChangeRequest(
        this.user,
        this.implicitRules,
        this.redirectUri,
        this.resourceType,
        this.used,
        this.secret,
        value,
        this.id,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PasswordChangeRequest#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePasswordChangeRequest withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutablePasswordChangeRequest(
        this.user,
        this.implicitRules,
        this.redirectUri,
        this.resourceType,
        this.used,
        this.secret,
        this.meta,
        newValue,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PasswordChangeRequest#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePasswordChangeRequest withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutablePasswordChangeRequest(
        this.user,
        this.implicitRules,
        this.redirectUri,
        this.resourceType,
        this.used,
        this.secret,
        this.meta,
        value,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PasswordChangeRequest#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePasswordChangeRequest withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutablePasswordChangeRequest(
        this.user,
        this.implicitRules,
        this.redirectUri,
        this.resourceType,
        this.used,
        this.secret,
        this.meta,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PasswordChangeRequest#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePasswordChangeRequest withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutablePasswordChangeRequest(
        this.user,
        this.implicitRules,
        this.redirectUri,
        this.resourceType,
        this.used,
        this.secret,
        this.meta,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePasswordChangeRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePasswordChangeRequest
        && equalTo((ImmutablePasswordChangeRequest) another);
  }

  private boolean equalTo(ImmutablePasswordChangeRequest another) {
    return Objects.equals(user, another.user)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(redirectUri, another.redirectUri)
        && Objects.equals(resourceType, another.resourceType)
        && Objects.equals(used, another.used)
        && Objects.equals(secret, another.secret)
        && Objects.equals(meta, another.meta)
        && Objects.equals(id, another.id)
        && Objects.equals(language, another.language);
  }

  /**
   * Computes a hash code from attributes: {@code user}, {@code implicitRules}, {@code redirectUri}, {@code resourceType}, {@code used}, {@code secret}, {@code meta}, {@code id}, {@code language}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(user);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(redirectUri);
    h += (h << 5) + Objects.hashCode(resourceType);
    h += (h << 5) + Objects.hashCode(used);
    h += (h << 5) + Objects.hashCode(secret);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(language);
    return h;
  }

  /**
   * Prints the immutable value {@code PasswordChangeRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("PasswordChangeRequest{");
    if (user != null) {
      builder.append("user=").append(user);
    }
    if (implicitRules != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (redirectUri != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("redirectUri=").append(redirectUri);
    }
    if (resourceType != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("resourceType=").append(resourceType);
    }
    if (used != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("used=").append(used);
    }
    if (secret != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("secret=").append(secret);
    }
    if (meta != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (id != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (language != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("language=").append(language);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "PasswordChangeRequest", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements PasswordChangeRequest {
    @Nullable Optional<Reference> user = Optional.empty();
    boolean userIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<String> redirectUri = Optional.empty();
    boolean redirectUriIsSet;
    @Nullable Optional<String> resourceType = Optional.empty();
    boolean resourceTypeIsSet;
    @Nullable Optional<Boolean> used = Optional.empty();
    boolean usedIsSet;
    @Nullable Optional<String> secret = Optional.empty();
    boolean secretIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @JsonProperty("user")
    public void setUser(Optional<Reference> user) {
      this.user = user;
      this.userIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("redirectUri")
    public void setRedirectUri(Optional<String> redirectUri) {
      this.redirectUri = redirectUri;
      this.redirectUriIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(Optional<String> resourceType) {
      this.resourceType = resourceType;
      this.resourceTypeIsSet = true;
    }
    @JsonProperty("used")
    public void setUsed(Optional<Boolean> used) {
      this.used = used;
      this.usedIsSet = true;
    }
    @JsonProperty("secret")
    public void setSecret(Optional<String> secret) {
      this.secret = secret;
      this.secretIsSet = true;
    }
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
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @Override
    public Optional<Reference> user() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> redirectUri() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> used() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> secret() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
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
  static ImmutablePasswordChangeRequest fromJson(Json json) {
    ImmutablePasswordChangeRequest.Builder builder = ImmutablePasswordChangeRequest.builder();
    if (json.userIsSet) {
      builder.user(json.user);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.redirectUriIsSet) {
      builder.redirectUri(json.redirectUri);
    }
    if (json.resourceTypeIsSet) {
      builder.resourceType(json.resourceType);
    }
    if (json.usedIsSet) {
      builder.used(json.used);
    }
    if (json.secretIsSet) {
      builder.secret(json.secret);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
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
        .user(instance.user())
        .implicitRules(instance.implicitRules())
        .redirectUri(instance.redirectUri())
        .resourceType(instance.resourceType())
        .used(instance.used())
        .secret(instance.secret())
        .meta(instance.meta())
        .id(instance.id())
        .language(instance.language())
        .build();
  }

  /**
   * Creates a builder for {@link PasswordChangeRequest PasswordChangeRequest}.
   * <pre>
   * ImmutablePasswordChangeRequest.builder()
   *    .user(com.fhir.types.fhir.Reference) // optional {@link PasswordChangeRequest#user() user}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link PasswordChangeRequest#implicitRules() implicitRules}
   *    .redirectUri(String) // optional {@link PasswordChangeRequest#redirectUri() redirectUri}
   *    .resourceType(String) // optional {@link PasswordChangeRequest#resourceType() resourceType}
   *    .used(Boolean) // optional {@link PasswordChangeRequest#used() used}
   *    .secret(String) // optional {@link PasswordChangeRequest#secret() secret}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link PasswordChangeRequest#meta() meta}
   *    .id(com.fhir.types.fhir.Id) // optional {@link PasswordChangeRequest#id() id}
   *    .language(com.fhir.types.fhir.Code) // optional {@link PasswordChangeRequest#language() language}
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
  @Generated(from = "PasswordChangeRequest", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_USER = 0x1L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2L;
    private static final long OPT_BIT_REDIRECT_URI = 0x4L;
    private static final long OPT_BIT_RESOURCE_TYPE = 0x8L;
    private static final long OPT_BIT_USED = 0x10L;
    private static final long OPT_BIT_SECRET = 0x20L;
    private static final long OPT_BIT_META = 0x40L;
    private static final long OPT_BIT_ID = 0x80L;
    private static final long OPT_BIT_LANGUAGE = 0x100L;
    private long optBits;

    private @Nullable Reference user;
    private @Nullable Uri implicitRules;
    private @Nullable String redirectUri;
    private @Nullable String resourceType;
    private @Nullable Boolean used;
    private @Nullable String secret;
    private @Nullable Meta meta;
    private @Nullable Id id;
    private @Nullable Code language;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link PasswordChangeRequest#user() user} to user.
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
     * Initializes the optional value {@link PasswordChangeRequest#user() user} to user.
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
     * Initializes the optional value {@link PasswordChangeRequest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link PasswordChangeRequest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link PasswordChangeRequest#redirectUri() redirectUri} to redirectUri.
     * @param redirectUri The value for redirectUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder redirectUri(String redirectUri) {
      checkNotIsSet(redirectUriIsSet(), "redirectUri");
      this.redirectUri = Objects.requireNonNull(redirectUri, "redirectUri");
      optBits |= OPT_BIT_REDIRECT_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link PasswordChangeRequest#redirectUri() redirectUri} to redirectUri.
     * @param redirectUri The value for redirectUri
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("redirectUri")
    public final Builder redirectUri(Optional<String> redirectUri) {
      checkNotIsSet(redirectUriIsSet(), "redirectUri");
      this.redirectUri = redirectUri.orElse(null);
      optBits |= OPT_BIT_REDIRECT_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link PasswordChangeRequest#resourceType() resourceType} to resourceType.
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
     * Initializes the optional value {@link PasswordChangeRequest#resourceType() resourceType} to resourceType.
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
    @JsonProperty("used")
    public final Builder used(Optional<Boolean> used) {
      checkNotIsSet(usedIsSet(), "used");
      this.used = used.orElse(null);
      optBits |= OPT_BIT_USED;
      return this;
    }

    /**
     * Initializes the optional value {@link PasswordChangeRequest#secret() secret} to secret.
     * @param secret The value for secret
     * @return {@code this} builder for chained invocation
     */
    public final Builder secret(String secret) {
      checkNotIsSet(secretIsSet(), "secret");
      this.secret = Objects.requireNonNull(secret, "secret");
      optBits |= OPT_BIT_SECRET;
      return this;
    }

    /**
     * Initializes the optional value {@link PasswordChangeRequest#secret() secret} to secret.
     * @param secret The value for secret
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("secret")
    public final Builder secret(Optional<String> secret) {
      checkNotIsSet(secretIsSet(), "secret");
      this.secret = secret.orElse(null);
      optBits |= OPT_BIT_SECRET;
      return this;
    }

    /**
     * Initializes the optional value {@link PasswordChangeRequest#meta() meta} to meta.
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
     * Initializes the optional value {@link PasswordChangeRequest#meta() meta} to meta.
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
     * Initializes the optional value {@link PasswordChangeRequest#id() id} to id.
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
     * Initializes the optional value {@link PasswordChangeRequest#id() id} to id.
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
     * Initializes the optional value {@link PasswordChangeRequest#language() language} to language.
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
     * Initializes the optional value {@link PasswordChangeRequest#language() language} to language.
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
     * Builds a new {@link PasswordChangeRequest PasswordChangeRequest}.
     * @return An immutable instance of PasswordChangeRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public PasswordChangeRequest build() {
      return new ImmutablePasswordChangeRequest(user, implicitRules, redirectUri, resourceType, used, secret, meta, id, language);
    }

    private boolean userIsSet() {
      return (optBits & OPT_BIT_USER) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean redirectUriIsSet() {
      return (optBits & OPT_BIT_REDIRECT_URI) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (optBits & OPT_BIT_RESOURCE_TYPE) != 0;
    }

    private boolean usedIsSet() {
      return (optBits & OPT_BIT_USED) != 0;
    }

    private boolean secretIsSet() {
      return (optBits & OPT_BIT_SECRET) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of PasswordChangeRequest is strict, attribute is already set: ".concat(name));
    }
  }
}

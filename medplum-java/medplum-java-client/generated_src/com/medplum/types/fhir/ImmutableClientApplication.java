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
 * Immutable implementation of {@link ClientApplication}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClientApplication.builder()}.
 */
@Generated(from = "ClientApplication", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClientApplication implements ClientApplication {
  private final String secret;
  private final @Nullable String name;
  private final String resourceType;
  private final @Nullable Id id;
  private final @Nullable Uri implicitRules;
  private final @Nullable Code language;
  private final @Nullable Meta meta;
  private final @Nullable String redirectUri;
  private final @Nullable String description;

  private ImmutableClientApplication(
      String secret,
      @Nullable String name,
      String resourceType,
      @Nullable Id id,
      @Nullable Uri implicitRules,
      @Nullable Code language,
      @Nullable Meta meta,
      @Nullable String redirectUri,
      @Nullable String description) {
    this.secret = secret;
    this.name = name;
    this.resourceType = resourceType;
    this.id = id;
    this.implicitRules = implicitRules;
    this.language = language;
    this.meta = meta;
    this.redirectUri = redirectUri;
    this.description = description;
  }

  /**
   * @return The value of the {@code secret} attribute
   */
  @JsonProperty("secret")
  @Override
  public String secret() {
    return secret;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
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
   * @return The value of the {@code redirectUri} attribute
   */
  @JsonProperty("redirectUri")
  @Override
  public Optional<String> redirectUri() {
    return Optional.ofNullable(redirectUri);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClientApplication#secret() secret} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for secret
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClientApplication withSecret(String value) {
    String newValue = Objects.requireNonNull(value, "secret");
    if (this.secret.equals(newValue)) return this;
    return new ImmutableClientApplication(
        newValue,
        this.name,
        this.resourceType,
        this.id,
        this.implicitRules,
        this.language,
        this.meta,
        this.redirectUri,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClientApplication#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClientApplication withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableClientApplication(
        this.secret,
        newValue,
        this.resourceType,
        this.id,
        this.implicitRules,
        this.language,
        this.meta,
        this.redirectUri,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClientApplication#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClientApplication withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableClientApplication(
        this.secret,
        value,
        this.resourceType,
        this.id,
        this.implicitRules,
        this.language,
        this.meta,
        this.redirectUri,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClientApplication#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClientApplication withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableClientApplication(
        this.secret,
        this.name,
        newValue,
        this.id,
        this.implicitRules,
        this.language,
        this.meta,
        this.redirectUri,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClientApplication#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClientApplication withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableClientApplication(
        this.secret,
        this.name,
        this.resourceType,
        newValue,
        this.implicitRules,
        this.language,
        this.meta,
        this.redirectUri,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClientApplication#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClientApplication withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableClientApplication(
        this.secret,
        this.name,
        this.resourceType,
        value,
        this.implicitRules,
        this.language,
        this.meta,
        this.redirectUri,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClientApplication#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClientApplication withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableClientApplication(
        this.secret,
        this.name,
        this.resourceType,
        this.id,
        newValue,
        this.language,
        this.meta,
        this.redirectUri,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClientApplication#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClientApplication withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableClientApplication(
        this.secret,
        this.name,
        this.resourceType,
        this.id,
        value,
        this.language,
        this.meta,
        this.redirectUri,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClientApplication#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClientApplication withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableClientApplication(
        this.secret,
        this.name,
        this.resourceType,
        this.id,
        this.implicitRules,
        newValue,
        this.meta,
        this.redirectUri,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClientApplication#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClientApplication withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableClientApplication(
        this.secret,
        this.name,
        this.resourceType,
        this.id,
        this.implicitRules,
        value,
        this.meta,
        this.redirectUri,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClientApplication#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClientApplication withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableClientApplication(
        this.secret,
        this.name,
        this.resourceType,
        this.id,
        this.implicitRules,
        this.language,
        newValue,
        this.redirectUri,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClientApplication#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClientApplication withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableClientApplication(
        this.secret,
        this.name,
        this.resourceType,
        this.id,
        this.implicitRules,
        this.language,
        value,
        this.redirectUri,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClientApplication#redirectUri() redirectUri} attribute.
   * @param value The value for redirectUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClientApplication withRedirectUri(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "redirectUri");
    if (Objects.equals(this.redirectUri, newValue)) return this;
    return new ImmutableClientApplication(
        this.secret,
        this.name,
        this.resourceType,
        this.id,
        this.implicitRules,
        this.language,
        this.meta,
        newValue,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClientApplication#redirectUri() redirectUri} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for redirectUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClientApplication withRedirectUri(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.redirectUri, value)) return this;
    return new ImmutableClientApplication(
        this.secret,
        this.name,
        this.resourceType,
        this.id,
        this.implicitRules,
        this.language,
        this.meta,
        value,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClientApplication#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClientApplication withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableClientApplication(
        this.secret,
        this.name,
        this.resourceType,
        this.id,
        this.implicitRules,
        this.language,
        this.meta,
        this.redirectUri,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClientApplication#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClientApplication withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableClientApplication(
        this.secret,
        this.name,
        this.resourceType,
        this.id,
        this.implicitRules,
        this.language,
        this.meta,
        this.redirectUri,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClientApplication} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClientApplication
        && equalTo((ImmutableClientApplication) another);
  }

  private boolean equalTo(ImmutableClientApplication another) {
    return secret.equals(another.secret)
        && Objects.equals(name, another.name)
        && resourceType.equals(another.resourceType)
        && Objects.equals(id, another.id)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(language, another.language)
        && Objects.equals(meta, another.meta)
        && Objects.equals(redirectUri, another.redirectUri)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code secret}, {@code name}, {@code resourceType}, {@code id}, {@code implicitRules}, {@code language}, {@code meta}, {@code redirectUri}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + secret.hashCode();
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(redirectUri);
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code ClientApplication} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ClientApplication{");
    builder.append("secret=").append(secret);
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (redirectUri != null) {
      builder.append(", ");
      builder.append("redirectUri=").append(redirectUri);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ClientApplication", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ClientApplication {
    @Nullable String secret;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<String> redirectUri = Optional.empty();
    boolean redirectUriIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @JsonProperty("secret")
    public void setSecret(String secret) {
      this.secret = secret;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
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
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("redirectUri")
    public void setRedirectUri(Optional<String> redirectUri) {
      this.redirectUri = redirectUri;
      this.redirectUriIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @Override
    public String secret() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> redirectUri() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableClientApplication fromJson(Json json) {
    ImmutableClientApplication.Builder builder = ((ImmutableClientApplication.Builder) ImmutableClientApplication.builder());
    if (json.secret != null) {
      builder.secret(json.secret);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.redirectUriIsSet) {
      builder.redirectUri(json.redirectUri);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    return (ImmutableClientApplication) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ClientApplication} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ClientApplication instance
   */
  public static ClientApplication copyOf(ClientApplication instance) {
    if (instance instanceof ImmutableClientApplication) {
      return (ImmutableClientApplication) instance;
    }
    return ((ImmutableClientApplication.Builder) ImmutableClientApplication.builder())
        .secret(instance.secret())
        .name(instance.name())
        .resourceType(instance.resourceType())
        .id(instance.id())
        .implicitRules(instance.implicitRules())
        .language(instance.language())
        .meta(instance.meta())
        .redirectUri(instance.redirectUri())
        .description(instance.description())
        .build();
  }

  /**
   * Creates a builder for {@link ClientApplication ClientApplication}.
   * <pre>
   * ImmutableClientApplication.builder()
   *    .secret(String) // required {@link ClientApplication#secret() secret}
   *    .name(String) // optional {@link ClientApplication#name() name}
   *    .resourceType(String) // required {@link ClientApplication#resourceType() resourceType}
   *    .id(com.medplum.types.fhir.Id) // optional {@link ClientApplication#id() id}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link ClientApplication#implicitRules() implicitRules}
   *    .language(com.medplum.types.fhir.Code) // optional {@link ClientApplication#language() language}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link ClientApplication#meta() meta}
   *    .redirectUri(String) // optional {@link ClientApplication#redirectUri() redirectUri}
   *    .description(String) // optional {@link ClientApplication#description() description}
   *    .build();
   * </pre>
   * @return A new ClientApplication builder
   */
  public static SecretBuildStage builder() {
    return new ImmutableClientApplication.Builder();
  }

  /**
   * Builds instances of type {@link ClientApplication ClientApplication}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ClientApplication", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements SecretBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_SECRET = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_NAME = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4L;
    private static final long OPT_BIT_LANGUAGE = 0x8L;
    private static final long OPT_BIT_META = 0x10L;
    private static final long OPT_BIT_REDIRECT_URI = 0x20L;
    private static final long OPT_BIT_DESCRIPTION = 0x40L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable String secret;
    private @Nullable String name;
    private @Nullable String resourceType;
    private @Nullable Id id;
    private @Nullable Uri implicitRules;
    private @Nullable Code language;
    private @Nullable Meta meta;
    private @Nullable String redirectUri;
    private @Nullable String description;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link ClientApplication#secret() secret} attribute.
     * @param secret The value for secret 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("secret")
    public final Builder secret(String secret) {
      checkNotIsSet(secretIsSet(), "secret");
      this.secret = Objects.requireNonNull(secret, "secret");
      initBits &= ~INIT_BIT_SECRET;
      return this;
    }

    /**
     * Initializes the optional value {@link ClientApplication#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link ClientApplication#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link ClientApplication#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resourceType")
    public final Builder resourceType(String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClientApplication#id() id} to id.
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
     * Initializes the optional value {@link ClientApplication#id() id} to id.
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
     * Initializes the optional value {@link ClientApplication#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ClientApplication#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ClientApplication#language() language} to language.
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
     * Initializes the optional value {@link ClientApplication#language() language} to language.
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
     * Initializes the optional value {@link ClientApplication#meta() meta} to meta.
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
     * Initializes the optional value {@link ClientApplication#meta() meta} to meta.
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
     * Initializes the optional value {@link ClientApplication#redirectUri() redirectUri} to redirectUri.
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
     * Initializes the optional value {@link ClientApplication#redirectUri() redirectUri} to redirectUri.
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
     * Initializes the optional value {@link ClientApplication#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ClientApplication#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Builds a new {@link ClientApplication ClientApplication}.
     * @return An immutable instance of ClientApplication
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ClientApplication build() {
      checkRequiredAttributes();
      return new ImmutableClientApplication(secret, name, resourceType, id, implicitRules, language, meta, redirectUri, description);
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean redirectUriIsSet() {
      return (optBits & OPT_BIT_REDIRECT_URI) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean secretIsSet() {
      return (initBits & INIT_BIT_SECRET) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ClientApplication is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!secretIsSet()) attributes.add("secret");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build ClientApplication, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ClientApplication", generator = "Immutables")
  public interface SecretBuildStage {
    /**
     * Initializes the value for the {@link ClientApplication#secret() secret} attribute.
     * @param secret The value for secret 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage secret(String secret);
  }

  @Generated(from = "ClientApplication", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ClientApplication#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "ClientApplication", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ClientApplication#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link ClientApplication#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link ClientApplication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link ClientApplication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link ClientApplication#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link ClientApplication#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link ClientApplication#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link ClientApplication#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link ClientApplication#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link ClientApplication#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link ClientApplication#redirectUri() redirectUri} to redirectUri.
     * @param redirectUri The value for redirectUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal redirectUri(String redirectUri);

    /**
     * Initializes the optional value {@link ClientApplication#redirectUri() redirectUri} to redirectUri.
     * @param redirectUri The value for redirectUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal redirectUri(Optional<String> redirectUri);

    /**
     * Initializes the optional value {@link ClientApplication#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(String description);

    /**
     * Initializes the optional value {@link ClientApplication#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<String> description);

    /**
     * Builds a new {@link ClientApplication ClientApplication}.
     * @return An immutable instance of ClientApplication
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ClientApplication build();
  }
}

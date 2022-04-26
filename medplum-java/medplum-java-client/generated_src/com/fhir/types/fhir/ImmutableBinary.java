package com.fhir.types.fhir;

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
 * Immutable implementation of {@link Binary}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBinary.builder()}.
 */
@Generated(from = "Binary", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableBinary implements Binary {
  private final @Nullable Reference securityContext;
  private final @Nullable Meta meta;
  private final @Nullable Uri implicitRules;
  private final String resourceType;
  private final @Nullable Id id;
  private final @Nullable Code contentType;
  private final @Nullable Code language;
  private final @Nullable Base64Binary data;

  private ImmutableBinary(
      @Nullable Reference securityContext,
      @Nullable Meta meta,
      @Nullable Uri implicitRules,
      String resourceType,
      @Nullable Id id,
      @Nullable Code contentType,
      @Nullable Code language,
      @Nullable Base64Binary data) {
    this.securityContext = securityContext;
    this.meta = meta;
    this.implicitRules = implicitRules;
    this.resourceType = resourceType;
    this.id = id;
    this.contentType = contentType;
    this.language = language;
    this.data = data;
  }

  /**
   * @return The value of the {@code securityContext} attribute
   */
  @JsonProperty("securityContext")
  @Override
  public Optional<Reference> securityContext() {
    return Optional.ofNullable(securityContext);
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
   * @return The value of the {@code contentType} attribute
   */
  @JsonProperty("contentType")
  @Override
  public Optional<Code> contentType() {
    return Optional.ofNullable(contentType);
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
   * @return The value of the {@code data} attribute
   */
  @JsonProperty("data")
  @Override
  public Optional<Base64Binary> data() {
    return Optional.ofNullable(data);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Binary#securityContext() securityContext} attribute.
   * @param value The value for securityContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBinary withSecurityContext(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "securityContext");
    if (this.securityContext == newValue) return this;
    return new ImmutableBinary(
        newValue,
        this.meta,
        this.implicitRules,
        this.resourceType,
        this.id,
        this.contentType,
        this.language,
        this.data);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Binary#securityContext() securityContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for securityContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBinary withSecurityContext(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.securityContext == value) return this;
    return new ImmutableBinary(
        value,
        this.meta,
        this.implicitRules,
        this.resourceType,
        this.id,
        this.contentType,
        this.language,
        this.data);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Binary#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBinary withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableBinary(
        this.securityContext,
        newValue,
        this.implicitRules,
        this.resourceType,
        this.id,
        this.contentType,
        this.language,
        this.data);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Binary#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBinary withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableBinary(
        this.securityContext,
        value,
        this.implicitRules,
        this.resourceType,
        this.id,
        this.contentType,
        this.language,
        this.data);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Binary#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBinary withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableBinary(
        this.securityContext,
        this.meta,
        newValue,
        this.resourceType,
        this.id,
        this.contentType,
        this.language,
        this.data);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Binary#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBinary withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableBinary(
        this.securityContext,
        this.meta,
        value,
        this.resourceType,
        this.id,
        this.contentType,
        this.language,
        this.data);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Binary#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBinary withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableBinary(
        this.securityContext,
        this.meta,
        this.implicitRules,
        newValue,
        this.id,
        this.contentType,
        this.language,
        this.data);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Binary#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBinary withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableBinary(
        this.securityContext,
        this.meta,
        this.implicitRules,
        this.resourceType,
        newValue,
        this.contentType,
        this.language,
        this.data);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Binary#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBinary withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableBinary(
        this.securityContext,
        this.meta,
        this.implicitRules,
        this.resourceType,
        value,
        this.contentType,
        this.language,
        this.data);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Binary#contentType() contentType} attribute.
   * @param value The value for contentType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBinary withContentType(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "contentType");
    if (this.contentType == newValue) return this;
    return new ImmutableBinary(
        this.securityContext,
        this.meta,
        this.implicitRules,
        this.resourceType,
        this.id,
        newValue,
        this.language,
        this.data);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Binary#contentType() contentType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contentType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBinary withContentType(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.contentType == value) return this;
    return new ImmutableBinary(
        this.securityContext,
        this.meta,
        this.implicitRules,
        this.resourceType,
        this.id,
        value,
        this.language,
        this.data);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Binary#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBinary withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableBinary(
        this.securityContext,
        this.meta,
        this.implicitRules,
        this.resourceType,
        this.id,
        this.contentType,
        newValue,
        this.data);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Binary#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBinary withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableBinary(
        this.securityContext,
        this.meta,
        this.implicitRules,
        this.resourceType,
        this.id,
        this.contentType,
        value,
        this.data);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Binary#data() data} attribute.
   * @param value The value for data
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBinary withData(Base64Binary value) {
    @Nullable Base64Binary newValue = Objects.requireNonNull(value, "data");
    if (this.data == newValue) return this;
    return new ImmutableBinary(
        this.securityContext,
        this.meta,
        this.implicitRules,
        this.resourceType,
        this.id,
        this.contentType,
        this.language,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Binary#data() data} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for data
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBinary withData(Optional<? extends Base64Binary> optional) {
    @Nullable Base64Binary value = optional.orElse(null);
    if (this.data == value) return this;
    return new ImmutableBinary(
        this.securityContext,
        this.meta,
        this.implicitRules,
        this.resourceType,
        this.id,
        this.contentType,
        this.language,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBinary} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBinary
        && equalTo((ImmutableBinary) another);
  }

  private boolean equalTo(ImmutableBinary another) {
    return Objects.equals(securityContext, another.securityContext)
        && Objects.equals(meta, another.meta)
        && Objects.equals(implicitRules, another.implicitRules)
        && resourceType.equals(another.resourceType)
        && Objects.equals(id, another.id)
        && Objects.equals(contentType, another.contentType)
        && Objects.equals(language, another.language)
        && Objects.equals(data, another.data);
  }

  /**
   * Computes a hash code from attributes: {@code securityContext}, {@code meta}, {@code implicitRules}, {@code resourceType}, {@code id}, {@code contentType}, {@code language}, {@code data}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(securityContext);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(contentType);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(data);
    return h;
  }

  /**
   * Prints the immutable value {@code Binary} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Binary{");
    if (securityContext != null) {
      builder.append("securityContext=").append(securityContext);
    }
    if (meta != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (implicitRules != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (builder.length() > 7) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (contentType != null) {
      builder.append(", ");
      builder.append("contentType=").append(contentType);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (data != null) {
      builder.append(", ");
      builder.append("data=").append(data);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Binary", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Binary {
    @Nullable Optional<Reference> securityContext = Optional.empty();
    boolean securityContextIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Code> contentType = Optional.empty();
    boolean contentTypeIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Base64Binary> data = Optional.empty();
    boolean dataIsSet;
    @JsonProperty("securityContext")
    public void setSecurityContext(Optional<Reference> securityContext) {
      this.securityContext = securityContext;
      this.securityContextIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
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
    @JsonProperty("contentType")
    public void setContentType(Optional<Code> contentType) {
      this.contentType = contentType;
      this.contentTypeIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("data")
    public void setData(Optional<Base64Binary> data) {
      this.data = data;
      this.dataIsSet = true;
    }
    @Override
    public Optional<Reference> securityContext() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> contentType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Base64Binary> data() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableBinary fromJson(Json json) {
    ImmutableBinary.Builder builder = ((ImmutableBinary.Builder) ImmutableBinary.builder());
    if (json.securityContextIsSet) {
      builder.securityContext(json.securityContext);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.contentTypeIsSet) {
      builder.contentType(json.contentType);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.dataIsSet) {
      builder.data(json.data);
    }
    return (ImmutableBinary) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Binary} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Binary instance
   */
  public static Binary copyOf(Binary instance) {
    if (instance instanceof ImmutableBinary) {
      return (ImmutableBinary) instance;
    }
    return ((ImmutableBinary.Builder) ImmutableBinary.builder())
        .securityContext(instance.securityContext())
        .meta(instance.meta())
        .implicitRules(instance.implicitRules())
        .resourceType(instance.resourceType())
        .id(instance.id())
        .contentType(instance.contentType())
        .language(instance.language())
        .data(instance.data())
        .build();
  }

  /**
   * Creates a builder for {@link Binary Binary}.
   * <pre>
   * ImmutableBinary.builder()
   *    .securityContext(com.fhir.types.fhir.Reference) // optional {@link Binary#securityContext() securityContext}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link Binary#meta() meta}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link Binary#implicitRules() implicitRules}
   *    .resourceType(String) // required {@link Binary#resourceType() resourceType}
   *    .id(com.fhir.types.fhir.Id) // optional {@link Binary#id() id}
   *    .contentType(com.fhir.types.fhir.Code) // optional {@link Binary#contentType() contentType}
   *    .language(com.fhir.types.fhir.Code) // optional {@link Binary#language() language}
   *    .data(com.fhir.types.fhir.Base64Binary) // optional {@link Binary#data() data}
   *    .build();
   * </pre>
   * @return A new Binary builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableBinary.Builder();
  }

  /**
   * Builds instances of type {@link Binary Binary}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Binary", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_SECURITY_CONTEXT = 0x1L;
    private static final long OPT_BIT_META = 0x2L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_CONTENT_TYPE = 0x10L;
    private static final long OPT_BIT_LANGUAGE = 0x20L;
    private static final long OPT_BIT_DATA = 0x40L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Reference securityContext;
    private @Nullable Meta meta;
    private @Nullable Uri implicitRules;
    private @Nullable String resourceType;
    private @Nullable Id id;
    private @Nullable Code contentType;
    private @Nullable Code language;
    private @Nullable Base64Binary data;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Binary#securityContext() securityContext} to securityContext.
     * @param securityContext The value for securityContext
     * @return {@code this} builder for chained invocation
     */
    public final Builder securityContext(Reference securityContext) {
      checkNotIsSet(securityContextIsSet(), "securityContext");
      this.securityContext = Objects.requireNonNull(securityContext, "securityContext");
      optBits |= OPT_BIT_SECURITY_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Binary#securityContext() securityContext} to securityContext.
     * @param securityContext The value for securityContext
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("securityContext")
    public final Builder securityContext(Optional<? extends Reference> securityContext) {
      checkNotIsSet(securityContextIsSet(), "securityContext");
      this.securityContext = securityContext.orElse(null);
      optBits |= OPT_BIT_SECURITY_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Binary#meta() meta} to meta.
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
     * Initializes the optional value {@link Binary#meta() meta} to meta.
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
     * Initializes the optional value {@link Binary#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Binary#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the value for the {@link Binary#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Binary#id() id} to id.
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
     * Initializes the optional value {@link Binary#id() id} to id.
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
     * Initializes the optional value {@link Binary#contentType() contentType} to contentType.
     * @param contentType The value for contentType
     * @return {@code this} builder for chained invocation
     */
    public final Builder contentType(Code contentType) {
      checkNotIsSet(contentTypeIsSet(), "contentType");
      this.contentType = Objects.requireNonNull(contentType, "contentType");
      optBits |= OPT_BIT_CONTENT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Binary#contentType() contentType} to contentType.
     * @param contentType The value for contentType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contentType")
    public final Builder contentType(Optional<? extends Code> contentType) {
      checkNotIsSet(contentTypeIsSet(), "contentType");
      this.contentType = contentType.orElse(null);
      optBits |= OPT_BIT_CONTENT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Binary#language() language} to language.
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
     * Initializes the optional value {@link Binary#language() language} to language.
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
     * Initializes the optional value {@link Binary#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for chained invocation
     */
    public final Builder data(Base64Binary data) {
      checkNotIsSet(dataIsSet(), "data");
      this.data = Objects.requireNonNull(data, "data");
      optBits |= OPT_BIT_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link Binary#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("data")
    public final Builder data(Optional<? extends Base64Binary> data) {
      checkNotIsSet(dataIsSet(), "data");
      this.data = data.orElse(null);
      optBits |= OPT_BIT_DATA;
      return this;
    }

    /**
     * Builds a new {@link Binary Binary}.
     * @return An immutable instance of Binary
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Binary build() {
      checkRequiredAttributes();
      return new ImmutableBinary(securityContext, meta, implicitRules, resourceType, id, contentType, language, data);
    }

    private boolean securityContextIsSet() {
      return (optBits & OPT_BIT_SECURITY_CONTEXT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean contentTypeIsSet() {
      return (optBits & OPT_BIT_CONTENT_TYPE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean dataIsSet() {
      return (optBits & OPT_BIT_DATA) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Binary is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Binary, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Binary", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Binary#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "Binary", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Binary#securityContext() securityContext} to securityContext.
     * @param securityContext The value for securityContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal securityContext(Reference securityContext);

    /**
     * Initializes the optional value {@link Binary#securityContext() securityContext} to securityContext.
     * @param securityContext The value for securityContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal securityContext(Optional<? extends Reference> securityContext);

    /**
     * Initializes the optional value {@link Binary#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Binary#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Binary#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Binary#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Binary#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Binary#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Binary#contentType() contentType} to contentType.
     * @param contentType The value for contentType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contentType(Code contentType);

    /**
     * Initializes the optional value {@link Binary#contentType() contentType} to contentType.
     * @param contentType The value for contentType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contentType(Optional<? extends Code> contentType);

    /**
     * Initializes the optional value {@link Binary#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Binary#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Binary#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for chained invocation
     */
    BuildFinal data(Base64Binary data);

    /**
     * Initializes the optional value {@link Binary#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal data(Optional<? extends Base64Binary> data);

    /**
     * Builds a new {@link Binary Binary}.
     * @return An immutable instance of Binary
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Binary build();
  }
}

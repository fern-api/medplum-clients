//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Binary}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBinary.builder()}.
 */
@org.immutables.value.Generated(from = "Binary", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableBinary implements com.fhir.Binary {
  private final @javax.annotation.Nullable com.fhir.code contentType;
  private final @javax.annotation.Nullable com.fhir.Reference securityContext;
  private final @javax.annotation.Nullable com.fhir.base64Binary data;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.code language;

  private ImmutableBinary(
      @javax.annotation.Nullable com.fhir.code contentType,
      @javax.annotation.Nullable com.fhir.Reference securityContext,
      @javax.annotation.Nullable com.fhir.base64Binary data,
      @javax.annotation.Nullable com.fhir.id id,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.code language) {
    this.contentType = contentType;
    this.securityContext = securityContext;
    this.data = data;
    this.id = id;
    this.resourceType = resourceType;
    this.meta = meta;
    this.implicitRules = implicitRules;
    this.language = language;
  }

  /**
   * @return The value of the {@code contentType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contentType")
  @Override
  public java.util.Optional<com.fhir.code> contentType() {
    return java.util.Optional.ofNullable(contentType);
  }

  /**
   * @return The value of the {@code securityContext} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("securityContext")
  @Override
  public java.util.Optional<com.fhir.Reference> securityContext() {
    return java.util.Optional.ofNullable(securityContext);
  }

  /**
   * @return The value of the {@code data} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("data")
  @Override
  public java.util.Optional<com.fhir.base64Binary> data() {
    return java.util.Optional.ofNullable(data);
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
  public java.lang.String resourceType() {
    return resourceType;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Binary#contentType() contentType} attribute.
   * @param value The value for contentType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBinary withContentType(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "contentType");
    if (this.contentType == newValue) return this;
    return new ImmutableBinary(
        newValue,
        this.securityContext,
        this.data,
        this.id,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Binary#contentType() contentType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contentType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBinary withContentType(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.contentType == value) return this;
    return new ImmutableBinary(
        value,
        this.securityContext,
        this.data,
        this.id,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Binary#securityContext() securityContext} attribute.
   * @param value The value for securityContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBinary withSecurityContext(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "securityContext");
    if (this.securityContext == newValue) return this;
    return new ImmutableBinary(
        this.contentType,
        newValue,
        this.data,
        this.id,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Binary#securityContext() securityContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for securityContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBinary withSecurityContext(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.securityContext == value) return this;
    return new ImmutableBinary(
        this.contentType,
        value,
        this.data,
        this.id,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Binary#data() data} attribute.
   * @param value The value for data
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBinary withData(com.fhir.base64Binary value) {
    @javax.annotation.Nullable com.fhir.base64Binary newValue = java.util.Objects.requireNonNull(value, "data");
    if (this.data == newValue) return this;
    return new ImmutableBinary(
        this.contentType,
        this.securityContext,
        newValue,
        this.id,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Binary#data() data} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for data
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBinary withData(java.util.Optional<? extends com.fhir.base64Binary> optional) {
    @javax.annotation.Nullable com.fhir.base64Binary value = optional.orElse(null);
    if (this.data == value) return this;
    return new ImmutableBinary(
        this.contentType,
        this.securityContext,
        value,
        this.id,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Binary#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBinary withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableBinary(
        this.contentType,
        this.securityContext,
        this.data,
        newValue,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Binary#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBinary withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableBinary(
        this.contentType,
        this.securityContext,
        this.data,
        value,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Binary#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBinary withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableBinary(
        this.contentType,
        this.securityContext,
        this.data,
        this.id,
        newValue,
        this.meta,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Binary#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBinary withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableBinary(
        this.contentType,
        this.securityContext,
        this.data,
        this.id,
        this.resourceType,
        newValue,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Binary#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBinary withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableBinary(
        this.contentType,
        this.securityContext,
        this.data,
        this.id,
        this.resourceType,
        value,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Binary#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBinary withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableBinary(
        this.contentType,
        this.securityContext,
        this.data,
        this.id,
        this.resourceType,
        this.meta,
        newValue,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Binary#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBinary withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableBinary(
        this.contentType,
        this.securityContext,
        this.data,
        this.id,
        this.resourceType,
        this.meta,
        value,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Binary#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBinary withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableBinary(
        this.contentType,
        this.securityContext,
        this.data,
        this.id,
        this.resourceType,
        this.meta,
        this.implicitRules,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Binary#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBinary withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableBinary(
        this.contentType,
        this.securityContext,
        this.data,
        this.id,
        this.resourceType,
        this.meta,
        this.implicitRules,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBinary} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBinary
        && equalTo((ImmutableBinary) another);
  }

  private boolean equalTo(ImmutableBinary another) {
    return java.util.Objects.equals(contentType, another.contentType)
        && java.util.Objects.equals(securityContext, another.securityContext)
        && java.util.Objects.equals(data, another.data)
        && java.util.Objects.equals(id, another.id)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(language, another.language);
  }

  /**
   * Computes a hash code from attributes: {@code contentType}, {@code securityContext}, {@code data}, {@code id}, {@code resourceType}, {@code meta}, {@code implicitRules}, {@code language}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(contentType);
    h += (h << 5) + java.util.Objects.hashCode(securityContext);
    h += (h << 5) + java.util.Objects.hashCode(data);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(language);
    return h;
  }

  /**
   * Prints the immutable value {@code Binary} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Binary{");
    if (contentType != null) {
      builder.append("contentType=").append(contentType);
    }
    if (securityContext != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("securityContext=").append(securityContext);
    }
    if (data != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("data=").append(data);
    }
    if (id != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (builder.length() > 7) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
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
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Binary", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Binary {
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> contentType = java.util.Optional.empty();
    boolean contentTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> securityContext = java.util.Optional.empty();
    boolean securityContextIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.base64Binary> data = java.util.Optional.empty();
    boolean dataIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    public void setContentType(java.util.Optional<com.fhir.code> contentType) {
      this.contentType = contentType;
      this.contentTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("securityContext")
    public void setSecurityContext(java.util.Optional<com.fhir.Reference> securityContext) {
      this.securityContext = securityContext;
      this.securityContextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    public void setData(java.util.Optional<com.fhir.base64Binary> data) {
      this.data = data;
      this.dataIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
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
    @Override
    public java.util.Optional<com.fhir.code> contentType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> securityContext() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.base64Binary> data() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableBinary fromJson(Json json) {
    ImmutableBinary.Builder builder = ((ImmutableBinary.Builder) ImmutableBinary.builder());
    if (json.contentTypeIsSet) {
      builder.contentType(json.contentType);
    }
    if (json.securityContextIsSet) {
      builder.securityContext(json.securityContext);
    }
    if (json.dataIsSet) {
      builder.data(json.data);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
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
        .contentType(instance.contentType())
        .securityContext(instance.securityContext())
        .data(instance.data())
        .id(instance.id())
        .resourceType(instance.resourceType())
        .meta(instance.meta())
        .implicitRules(instance.implicitRules())
        .language(instance.language())
        .build();
  }

  /**
   * Creates a builder for {@link Binary Binary}.
   * <pre>
   * ImmutableBinary.builder()
   *    .contentType(com.fhir.code) // optional {@link Binary#contentType() contentType}
   *    .securityContext(com.fhir.Reference) // optional {@link Binary#securityContext() securityContext}
   *    .data(com.fhir.base64Binary) // optional {@link Binary#data() data}
   *    .id(com.fhir.id) // optional {@link Binary#id() id}
   *    .resourceType(String) // required {@link Binary#resourceType() resourceType}
   *    .meta(com.fhir.Meta) // optional {@link Binary#meta() meta}
   *    .implicitRules(com.fhir.uri) // optional {@link Binary#implicitRules() implicitRules}
   *    .language(com.fhir.code) // optional {@link Binary#language() language}
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
  @org.immutables.value.Generated(from = "Binary", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_CONTENT_TYPE = 0x1L;
    private static final long OPT_BIT_SECURITY_CONTEXT = 0x2L;
    private static final long OPT_BIT_DATA = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_META = 0x10L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x20L;
    private static final long OPT_BIT_LANGUAGE = 0x40L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.code contentType;
    private @javax.annotation.Nullable com.fhir.Reference securityContext;
    private @javax.annotation.Nullable com.fhir.base64Binary data;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.code language;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Binary#contentType() contentType} to contentType.
     * @param contentType The value for contentType
     * @return {@code this} builder for chained invocation
     */
    public final Builder contentType(com.fhir.code contentType) {
      checkNotIsSet(contentTypeIsSet(), "contentType");
      this.contentType = java.util.Objects.requireNonNull(contentType, "contentType");
      optBits |= OPT_BIT_CONTENT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Binary#contentType() contentType} to contentType.
     * @param contentType The value for contentType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    public final Builder contentType(java.util.Optional<? extends com.fhir.code> contentType) {
      checkNotIsSet(contentTypeIsSet(), "contentType");
      this.contentType = contentType.orElse(null);
      optBits |= OPT_BIT_CONTENT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Binary#securityContext() securityContext} to securityContext.
     * @param securityContext The value for securityContext
     * @return {@code this} builder for chained invocation
     */
    public final Builder securityContext(com.fhir.Reference securityContext) {
      checkNotIsSet(securityContextIsSet(), "securityContext");
      this.securityContext = java.util.Objects.requireNonNull(securityContext, "securityContext");
      optBits |= OPT_BIT_SECURITY_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Binary#securityContext() securityContext} to securityContext.
     * @param securityContext The value for securityContext
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityContext")
    public final Builder securityContext(java.util.Optional<? extends com.fhir.Reference> securityContext) {
      checkNotIsSet(securityContextIsSet(), "securityContext");
      this.securityContext = securityContext.orElse(null);
      optBits |= OPT_BIT_SECURITY_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Binary#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for chained invocation
     */
    public final Builder data(com.fhir.base64Binary data) {
      checkNotIsSet(dataIsSet(), "data");
      this.data = java.util.Objects.requireNonNull(data, "data");
      optBits |= OPT_BIT_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link Binary#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    public final Builder data(java.util.Optional<? extends com.fhir.base64Binary> data) {
      checkNotIsSet(dataIsSet(), "data");
      this.data = data.orElse(null);
      optBits |= OPT_BIT_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link Binary#id() id} to id.
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
     * Initializes the optional value {@link Binary#id() id} to id.
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
     * Initializes the value for the {@link Binary#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public final Builder resourceType(java.lang.String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = java.util.Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Binary#meta() meta} to meta.
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
     * Initializes the optional value {@link Binary#meta() meta} to meta.
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
     * Initializes the optional value {@link Binary#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Binary#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Binary#language() language} to language.
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
     * Initializes the optional value {@link Binary#language() language} to language.
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
     * Builds a new {@link Binary Binary}.
     * @return An immutable instance of Binary
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Binary build() {
      checkRequiredAttributes();
      return new ImmutableBinary(contentType, securityContext, data, id, resourceType, meta, implicitRules, language);
    }

    private boolean contentTypeIsSet() {
      return (optBits & OPT_BIT_CONTENT_TYPE) != 0;
    }

    private boolean securityContextIsSet() {
      return (optBits & OPT_BIT_SECURITY_CONTEXT) != 0;
    }

    private boolean dataIsSet() {
      return (optBits & OPT_BIT_DATA) != 0;
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
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Binary is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Binary, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Binary", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Binary#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Binary", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Binary#contentType() contentType} to contentType.
     * @param contentType The value for contentType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contentType(com.fhir.code contentType);

    /**
     * Initializes the optional value {@link Binary#contentType() contentType} to contentType.
     * @param contentType The value for contentType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contentType(java.util.Optional<? extends com.fhir.code> contentType);

    /**
     * Initializes the optional value {@link Binary#securityContext() securityContext} to securityContext.
     * @param securityContext The value for securityContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal securityContext(com.fhir.Reference securityContext);

    /**
     * Initializes the optional value {@link Binary#securityContext() securityContext} to securityContext.
     * @param securityContext The value for securityContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal securityContext(java.util.Optional<? extends com.fhir.Reference> securityContext);

    /**
     * Initializes the optional value {@link Binary#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for chained invocation
     */
    BuildFinal data(com.fhir.base64Binary data);

    /**
     * Initializes the optional value {@link Binary#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal data(java.util.Optional<? extends com.fhir.base64Binary> data);

    /**
     * Initializes the optional value {@link Binary#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Binary#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Binary#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Binary#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Binary#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Binary#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Binary#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Binary#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Builds a new {@link Binary Binary}.
     * @return An immutable instance of Binary
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Binary build();
  }
}

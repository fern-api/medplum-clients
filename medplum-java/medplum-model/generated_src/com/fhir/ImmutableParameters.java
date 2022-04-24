//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Parameters}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableParameters.builder()}.
 */
@org.immutables.value.Generated(from = "Parameters", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableParameters implements com.fhir.Parameters {
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Parameters_Parameter> parameter;

  private ImmutableParameters(
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.Parameters_Parameter> parameter) {
    this.resourceType = resourceType;
    this.implicitRules = implicitRules;
    this.id = id;
    this.meta = meta;
    this.language = language;
    this.parameter = parameter;
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
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
   * @return The value of the {@code parameter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("parameter")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Parameters_Parameter>> parameter() {
    return java.util.Optional.ofNullable(parameter);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Parameters#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableParameters withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableParameters(newValue, this.implicitRules, this.id, this.meta, this.language, this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableParameters(this.resourceType, newValue, this.id, this.meta, this.language, this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableParameters(this.resourceType, value, this.id, this.meta, this.language, this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableParameters(this.resourceType, this.implicitRules, newValue, this.meta, this.language, this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableParameters(this.resourceType, this.implicitRules, value, this.meta, this.language, this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableParameters(this.resourceType, this.implicitRules, this.id, newValue, this.language, this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableParameters(this.resourceType, this.implicitRules, this.id, value, this.language, this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableParameters(this.resourceType, this.implicitRules, this.id, this.meta, newValue, this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableParameters(this.resourceType, this.implicitRules, this.id, this.meta, value, this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters#parameter() parameter} attribute.
   * @param value The value for parameter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters withParameter(java.util.List<com.fhir.Parameters_Parameter> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Parameters_Parameter> newValue = java.util.Objects.requireNonNull(value, "parameter");
    if (this.parameter == newValue) return this;
    return new ImmutableParameters(this.resourceType, this.implicitRules, this.id, this.meta, this.language, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters#parameter() parameter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parameter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters withParameter(java.util.Optional<? extends java.util.List<com.fhir.Parameters_Parameter>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Parameters_Parameter> value = optional.orElse(null);
    if (this.parameter == value) return this;
    return new ImmutableParameters(this.resourceType, this.implicitRules, this.id, this.meta, this.language, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableParameters} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableParameters
        && equalTo((ImmutableParameters) another);
  }

  private boolean equalTo(ImmutableParameters another) {
    return resourceType.equals(another.resourceType)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(parameter, another.parameter);
  }

  /**
   * Computes a hash code from attributes: {@code resourceType}, {@code implicitRules}, {@code id}, {@code meta}, {@code language}, {@code parameter}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(parameter);
    return h;
  }

  /**
   * Prints the immutable value {@code Parameters} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Parameters{");
    builder.append("resourceType=").append(resourceType);
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (parameter != null) {
      builder.append(", ");
      builder.append("parameter=").append(parameter);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Parameters", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Parameters {
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Parameters_Parameter>> parameter = java.util.Optional.empty();
    boolean parameterIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("parameter")
    public void setParameter(java.util.Optional<java.util.List<com.fhir.Parameters_Parameter>> parameter) {
      this.parameter = parameter;
      this.parameterIsSet = true;
    }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Parameters_Parameter>> parameter() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableParameters fromJson(Json json) {
    ImmutableParameters.Builder builder = ((ImmutableParameters.Builder) ImmutableParameters.builder());
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.parameterIsSet) {
      builder.parameter(json.parameter);
    }
    return (ImmutableParameters) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Parameters} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Parameters instance
   */
  public static Parameters copyOf(Parameters instance) {
    if (instance instanceof ImmutableParameters) {
      return (ImmutableParameters) instance;
    }
    return ((ImmutableParameters.Builder) ImmutableParameters.builder())
        .resourceType(instance.resourceType())
        .implicitRules(instance.implicitRules())
        .id(instance.id())
        .meta(instance.meta())
        .language(instance.language())
        .parameter(instance.parameter())
        .build();
  }

  /**
   * Creates a builder for {@link Parameters Parameters}.
   * <pre>
   * ImmutableParameters.builder()
   *    .resourceType(String) // required {@link Parameters#resourceType() resourceType}
   *    .implicitRules(com.fhir.uri) // optional {@link Parameters#implicitRules() implicitRules}
   *    .id(com.fhir.id) // optional {@link Parameters#id() id}
   *    .meta(com.fhir.Meta) // optional {@link Parameters#meta() meta}
   *    .language(com.fhir.code) // optional {@link Parameters#language() language}
   *    .parameter(List&amp;lt;com.fhir.Parameters_Parameter&amp;gt;) // optional {@link Parameters#parameter() parameter}
   *    .build();
   * </pre>
   * @return A new Parameters builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableParameters.Builder();
  }

  /**
   * Builds instances of type {@link Parameters Parameters}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Parameters", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_META = 0x4L;
    private static final long OPT_BIT_LANGUAGE = 0x8L;
    private static final long OPT_BIT_PARAMETER = 0x10L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.Parameters_Parameter> parameter;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link Parameters#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Parameters#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Parameters#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Parameters#id() id} to id.
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
     * Initializes the optional value {@link Parameters#id() id} to id.
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
     * Initializes the optional value {@link Parameters#meta() meta} to meta.
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
     * Initializes the optional value {@link Parameters#meta() meta} to meta.
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
     * Initializes the optional value {@link Parameters#language() language} to language.
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
     * Initializes the optional value {@link Parameters#language() language} to language.
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
     * Initializes the optional value {@link Parameters#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for chained invocation
     */
    public final Builder parameter(java.util.List<com.fhir.Parameters_Parameter> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = java.util.Objects.requireNonNull(parameter, "parameter");
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parameter")
    public final Builder parameter(java.util.Optional<? extends java.util.List<com.fhir.Parameters_Parameter>> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = parameter.orElse(null);
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Builds a new {@link Parameters Parameters}.
     * @return An immutable instance of Parameters
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Parameters build() {
      checkRequiredAttributes();
      return new ImmutableParameters(resourceType, implicitRules, id, meta, language, parameter);
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean parameterIsSet() {
      return (optBits & OPT_BIT_PARAMETER) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Parameters is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Parameters, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Parameters", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Parameters#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Parameters", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Parameters#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Parameters#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Parameters#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Parameters#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Parameters#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Parameters#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Parameters#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Parameters#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Parameters#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal parameter(java.util.List<com.fhir.Parameters_Parameter> parameter);

    /**
     * Initializes the optional value {@link Parameters#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal parameter(java.util.Optional<? extends java.util.List<com.fhir.Parameters_Parameter>> parameter);

    /**
     * Builds a new {@link Parameters Parameters}.
     * @return An immutable instance of Parameters
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Parameters build();
  }
}

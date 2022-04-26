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
 * Immutable implementation of {@link Parameters}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableParameters.builder()}.
 */
@Generated(from = "Parameters", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableParameters implements Parameters {
  private final String resourceType;
  private final @Nullable Id id;
  private final @Nullable Code language;
  private final @Nullable Meta meta;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<Parameters_Parameter> parameter;

  private ImmutableParameters(
      String resourceType,
      @Nullable Id id,
      @Nullable Code language,
      @Nullable Meta meta,
      @Nullable Uri implicitRules,
      @Nullable List<Parameters_Parameter> parameter) {
    this.resourceType = resourceType;
    this.id = id;
    this.language = language;
    this.meta = meta;
    this.implicitRules = implicitRules;
    this.parameter = parameter;
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code parameter} attribute
   */
  @JsonProperty("parameter")
  @Override
  public Optional<List<Parameters_Parameter>> parameter() {
    return Optional.ofNullable(parameter);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Parameters#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableParameters withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableParameters(newValue, this.id, this.language, this.meta, this.implicitRules, this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableParameters(this.resourceType, newValue, this.language, this.meta, this.implicitRules, this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableParameters(this.resourceType, value, this.language, this.meta, this.implicitRules, this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableParameters(this.resourceType, this.id, newValue, this.meta, this.implicitRules, this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableParameters(this.resourceType, this.id, value, this.meta, this.implicitRules, this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableParameters(this.resourceType, this.id, this.language, newValue, this.implicitRules, this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableParameters(this.resourceType, this.id, this.language, value, this.implicitRules, this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableParameters(this.resourceType, this.id, this.language, this.meta, newValue, this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableParameters(this.resourceType, this.id, this.language, this.meta, value, this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters#parameter() parameter} attribute.
   * @param value The value for parameter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters withParameter(List<Parameters_Parameter> value) {
    @Nullable List<Parameters_Parameter> newValue = Objects.requireNonNull(value, "parameter");
    if (this.parameter == newValue) return this;
    return new ImmutableParameters(this.resourceType, this.id, this.language, this.meta, this.implicitRules, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters#parameter() parameter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parameter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters withParameter(Optional<? extends List<Parameters_Parameter>> optional) {
    @Nullable List<Parameters_Parameter> value = optional.orElse(null);
    if (this.parameter == value) return this;
    return new ImmutableParameters(this.resourceType, this.id, this.language, this.meta, this.implicitRules, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableParameters} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableParameters
        && equalTo((ImmutableParameters) another);
  }

  private boolean equalTo(ImmutableParameters another) {
    return resourceType.equals(another.resourceType)
        && Objects.equals(id, another.id)
        && Objects.equals(language, another.language)
        && Objects.equals(meta, another.meta)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(parameter, another.parameter);
  }

  /**
   * Computes a hash code from attributes: {@code resourceType}, {@code id}, {@code language}, {@code meta}, {@code implicitRules}, {@code parameter}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(parameter);
    return h;
  }

  /**
   * Prints the immutable value {@code Parameters} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Parameters{");
    builder.append("resourceType=").append(resourceType);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
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
  @Generated(from = "Parameters", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Parameters {
    @Nullable String resourceType;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<Parameters_Parameter>> parameter = Optional.empty();
    boolean parameterIsSet;
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
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
    @JsonProperty("parameter")
    public void setParameter(Optional<List<Parameters_Parameter>> parameter) {
      this.parameter = parameter;
      this.parameterIsSet = true;
    }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Parameters_Parameter>> parameter() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableParameters fromJson(Json json) {
    ImmutableParameters.Builder builder = ((ImmutableParameters.Builder) ImmutableParameters.builder());
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
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
        .id(instance.id())
        .language(instance.language())
        .meta(instance.meta())
        .implicitRules(instance.implicitRules())
        .parameter(instance.parameter())
        .build();
  }

  /**
   * Creates a builder for {@link Parameters Parameters}.
   * <pre>
   * ImmutableParameters.builder()
   *    .resourceType(String) // required {@link Parameters#resourceType() resourceType}
   *    .id(com.fhir.types.fhir.Id) // optional {@link Parameters#id() id}
   *    .language(com.fhir.types.fhir.Code) // optional {@link Parameters#language() language}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link Parameters#meta() meta}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link Parameters#implicitRules() implicitRules}
   *    .parameter(List&amp;lt;com.fhir.types.fhir.Parameters_Parameter&amp;gt;) // optional {@link Parameters#parameter() parameter}
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
  @Generated(from = "Parameters", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_LANGUAGE = 0x2L;
    private static final long OPT_BIT_META = 0x4L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x8L;
    private static final long OPT_BIT_PARAMETER = 0x10L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String resourceType;
    private @Nullable Id id;
    private @Nullable Code language;
    private @Nullable Meta meta;
    private @Nullable Uri implicitRules;
    private @Nullable List<Parameters_Parameter> parameter;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link Parameters#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Parameters#id() id} to id.
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
     * Initializes the optional value {@link Parameters#id() id} to id.
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
     * Initializes the optional value {@link Parameters#language() language} to language.
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
     * Initializes the optional value {@link Parameters#language() language} to language.
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
     * Initializes the optional value {@link Parameters#meta() meta} to meta.
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
     * Initializes the optional value {@link Parameters#meta() meta} to meta.
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
     * Initializes the optional value {@link Parameters#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Parameters#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Parameters#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for chained invocation
     */
    public final Builder parameter(List<Parameters_Parameter> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = Objects.requireNonNull(parameter, "parameter");
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parameter")
    public final Builder parameter(Optional<? extends List<Parameters_Parameter>> parameter) {
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
    public Parameters build() {
      checkRequiredAttributes();
      return new ImmutableParameters(resourceType, id, language, meta, implicitRules, parameter);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean parameterIsSet() {
      return (optBits & OPT_BIT_PARAMETER) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Parameters is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Parameters, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Parameters", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Parameters#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "Parameters", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Parameters#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Parameters#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Parameters#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Parameters#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Parameters#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Parameters#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Parameters#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Parameters#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Parameters#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal parameter(List<Parameters_Parameter> parameter);

    /**
     * Initializes the optional value {@link Parameters#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal parameter(Optional<? extends List<Parameters_Parameter>> parameter);

    /**
     * Builds a new {@link Parameters Parameters}.
     * @return An immutable instance of Parameters
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Parameters build();
  }
}

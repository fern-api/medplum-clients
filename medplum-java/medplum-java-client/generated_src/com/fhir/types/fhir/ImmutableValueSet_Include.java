package com.fhir.types.fhir;

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
 * Immutable implementation of {@link ValueSet_Include}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableValueSet_Include.builder()}.
 */
@Generated(from = "ValueSet_Include", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableValueSet_Include implements ValueSet_Include {
  private final @Nullable List<Canonical> valueSet;
  private final @Nullable String version;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<ValueSet_Concept> concept;
  private final @Nullable Uri system;
  private final @Nullable List<ValueSet_Filter> filter;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableValueSet_Include(
      @Nullable List<Canonical> valueSet,
      @Nullable String version,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable List<ValueSet_Concept> concept,
      @Nullable Uri system,
      @Nullable List<ValueSet_Filter> filter,
      @Nullable List<Extension> modifierExtension) {
    this.valueSet = valueSet;
    this.version = version;
    this.id = id;
    this.extension = extension;
    this.concept = concept;
    this.system = system;
    this.filter = filter;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code valueSet} attribute
   */
  @JsonProperty("valueSet")
  @Override
  public Optional<List<Canonical>> valueSet() {
    return Optional.ofNullable(valueSet);
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  public Optional<String> version() {
    return Optional.ofNullable(version);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code concept} attribute
   */
  @JsonProperty("concept")
  @Override
  public Optional<List<ValueSet_Concept>> concept() {
    return Optional.ofNullable(concept);
  }

  /**
   * @return The value of the {@code system} attribute
   */
  @JsonProperty("system")
  @Override
  public Optional<Uri> system() {
    return Optional.ofNullable(system);
  }

  /**
   * @return The value of the {@code filter} attribute
   */
  @JsonProperty("filter")
  @Override
  public Optional<List<ValueSet_Filter>> filter() {
    return Optional.ofNullable(filter);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Include#valueSet() valueSet} attribute.
   * @param value The value for valueSet
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Include withValueSet(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "valueSet");
    if (this.valueSet == newValue) return this;
    return new ImmutableValueSet_Include(
        newValue,
        this.version,
        this.id,
        this.extension,
        this.concept,
        this.system,
        this.filter,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Include#valueSet() valueSet} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueSet
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Include withValueSet(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.valueSet == value) return this;
    return new ImmutableValueSet_Include(
        value,
        this.version,
        this.id,
        this.extension,
        this.concept,
        this.system,
        this.filter,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Include#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Include withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutableValueSet_Include(
        this.valueSet,
        newValue,
        this.id,
        this.extension,
        this.concept,
        this.system,
        this.filter,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Include#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Include withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutableValueSet_Include(
        this.valueSet,
        value,
        this.id,
        this.extension,
        this.concept,
        this.system,
        this.filter,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Include#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Include withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableValueSet_Include(
        this.valueSet,
        this.version,
        newValue,
        this.extension,
        this.concept,
        this.system,
        this.filter,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Include#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Include withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableValueSet_Include(
        this.valueSet,
        this.version,
        value,
        this.extension,
        this.concept,
        this.system,
        this.filter,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Include#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Include withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableValueSet_Include(
        this.valueSet,
        this.version,
        this.id,
        newValue,
        this.concept,
        this.system,
        this.filter,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Include#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Include withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableValueSet_Include(
        this.valueSet,
        this.version,
        this.id,
        value,
        this.concept,
        this.system,
        this.filter,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Include#concept() concept} attribute.
   * @param value The value for concept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Include withConcept(List<ValueSet_Concept> value) {
    @Nullable List<ValueSet_Concept> newValue = Objects.requireNonNull(value, "concept");
    if (this.concept == newValue) return this;
    return new ImmutableValueSet_Include(
        this.valueSet,
        this.version,
        this.id,
        this.extension,
        newValue,
        this.system,
        this.filter,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Include#concept() concept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for concept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Include withConcept(Optional<? extends List<ValueSet_Concept>> optional) {
    @Nullable List<ValueSet_Concept> value = optional.orElse(null);
    if (this.concept == value) return this;
    return new ImmutableValueSet_Include(
        this.valueSet,
        this.version,
        this.id,
        this.extension,
        value,
        this.system,
        this.filter,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Include#system() system} attribute.
   * @param value The value for system
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Include withSystem(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "system");
    if (this.system == newValue) return this;
    return new ImmutableValueSet_Include(
        this.valueSet,
        this.version,
        this.id,
        this.extension,
        this.concept,
        newValue,
        this.filter,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Include#system() system} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for system
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Include withSystem(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.system == value) return this;
    return new ImmutableValueSet_Include(
        this.valueSet,
        this.version,
        this.id,
        this.extension,
        this.concept,
        value,
        this.filter,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Include#filter() filter} attribute.
   * @param value The value for filter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Include withFilter(List<ValueSet_Filter> value) {
    @Nullable List<ValueSet_Filter> newValue = Objects.requireNonNull(value, "filter");
    if (this.filter == newValue) return this;
    return new ImmutableValueSet_Include(
        this.valueSet,
        this.version,
        this.id,
        this.extension,
        this.concept,
        this.system,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Include#filter() filter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for filter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Include withFilter(Optional<? extends List<ValueSet_Filter>> optional) {
    @Nullable List<ValueSet_Filter> value = optional.orElse(null);
    if (this.filter == value) return this;
    return new ImmutableValueSet_Include(
        this.valueSet,
        this.version,
        this.id,
        this.extension,
        this.concept,
        this.system,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Include#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Include withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableValueSet_Include(
        this.valueSet,
        this.version,
        this.id,
        this.extension,
        this.concept,
        this.system,
        this.filter,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Include#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Include withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableValueSet_Include(
        this.valueSet,
        this.version,
        this.id,
        this.extension,
        this.concept,
        this.system,
        this.filter,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableValueSet_Include} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableValueSet_Include
        && equalTo((ImmutableValueSet_Include) another);
  }

  private boolean equalTo(ImmutableValueSet_Include another) {
    return Objects.equals(valueSet, another.valueSet)
        && Objects.equals(version, another.version)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(concept, another.concept)
        && Objects.equals(system, another.system)
        && Objects.equals(filter, another.filter)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code valueSet}, {@code version}, {@code id}, {@code extension}, {@code concept}, {@code system}, {@code filter}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(valueSet);
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(concept);
    h += (h << 5) + Objects.hashCode(system);
    h += (h << 5) + Objects.hashCode(filter);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code ValueSet_Include} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ValueSet_Include{");
    if (valueSet != null) {
      builder.append("valueSet=").append(valueSet);
    }
    if (version != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (id != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (concept != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("concept=").append(concept);
    }
    if (system != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("system=").append(system);
    }
    if (filter != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("filter=").append(filter);
    }
    if (modifierExtension != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ValueSet_Include", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ValueSet_Include {
    @Nullable Optional<List<Canonical>> valueSet = Optional.empty();
    boolean valueSetIsSet;
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<ValueSet_Concept>> concept = Optional.empty();
    boolean conceptIsSet;
    @Nullable Optional<Uri> system = Optional.empty();
    boolean systemIsSet;
    @Nullable Optional<List<ValueSet_Filter>> filter = Optional.empty();
    boolean filterIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("valueSet")
    public void setValueSet(Optional<List<Canonical>> valueSet) {
      this.valueSet = valueSet;
      this.valueSetIsSet = true;
    }
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("concept")
    public void setConcept(Optional<List<ValueSet_Concept>> concept) {
      this.concept = concept;
      this.conceptIsSet = true;
    }
    @JsonProperty("system")
    public void setSystem(Optional<Uri> system) {
      this.system = system;
      this.systemIsSet = true;
    }
    @JsonProperty("filter")
    public void setFilter(Optional<List<ValueSet_Filter>> filter) {
      this.filter = filter;
      this.filterIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<List<Canonical>> valueSet() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ValueSet_Concept>> concept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> system() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ValueSet_Filter>> filter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableValueSet_Include fromJson(Json json) {
    ImmutableValueSet_Include.Builder builder = ImmutableValueSet_Include.builder();
    if (json.valueSetIsSet) {
      builder.valueSet(json.valueSet);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.conceptIsSet) {
      builder.concept(json.concept);
    }
    if (json.systemIsSet) {
      builder.system(json.system);
    }
    if (json.filterIsSet) {
      builder.filter(json.filter);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableValueSet_Include) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ValueSet_Include} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ValueSet_Include instance
   */
  public static ValueSet_Include copyOf(ValueSet_Include instance) {
    if (instance instanceof ImmutableValueSet_Include) {
      return (ImmutableValueSet_Include) instance;
    }
    return ImmutableValueSet_Include.builder()
        .valueSet(instance.valueSet())
        .version(instance.version())
        .id(instance.id())
        .extension(instance.extension())
        .concept(instance.concept())
        .system(instance.system())
        .filter(instance.filter())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link ValueSet_Include ValueSet_Include}.
   * <pre>
   * ImmutableValueSet_Include.builder()
   *    .valueSet(List&amp;lt;com.fhir.types.fhir.Canonical&amp;gt;) // optional {@link ValueSet_Include#valueSet() valueSet}
   *    .version(String) // optional {@link ValueSet_Include#version() version}
   *    .id(String) // optional {@link ValueSet_Include#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ValueSet_Include#extension() extension}
   *    .concept(List&amp;lt;com.fhir.types.fhir.ValueSet_Concept&amp;gt;) // optional {@link ValueSet_Include#concept() concept}
   *    .system(com.fhir.types.fhir.Uri) // optional {@link ValueSet_Include#system() system}
   *    .filter(List&amp;lt;com.fhir.types.fhir.ValueSet_Filter&amp;gt;) // optional {@link ValueSet_Include#filter() filter}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ValueSet_Include#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new ValueSet_Include builder
   */
  public static ImmutableValueSet_Include.Builder builder() {
    return new ImmutableValueSet_Include.Builder();
  }

  /**
   * Builds instances of type {@link ValueSet_Include ValueSet_Include}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ValueSet_Include", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_VALUE_SET = 0x1L;
    private static final long OPT_BIT_VERSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_CONCEPT = 0x10L;
    private static final long OPT_BIT_SYSTEM = 0x20L;
    private static final long OPT_BIT_FILTER = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private long optBits;

    private @Nullable List<Canonical> valueSet;
    private @Nullable String version;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable List<ValueSet_Concept> concept;
    private @Nullable Uri system;
    private @Nullable List<ValueSet_Filter> filter;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#valueSet() valueSet} to valueSet.
     * @param valueSet The value for valueSet
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueSet(List<Canonical> valueSet) {
      checkNotIsSet(valueSetIsSet(), "valueSet");
      this.valueSet = Objects.requireNonNull(valueSet, "valueSet");
      optBits |= OPT_BIT_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#valueSet() valueSet} to valueSet.
     * @param valueSet The value for valueSet
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueSet")
    public final Builder valueSet(Optional<? extends List<Canonical>> valueSet) {
      checkNotIsSet(valueSetIsSet(), "valueSet");
      this.valueSet = valueSet.orElse(null);
      optBits |= OPT_BIT_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(String version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = Objects.requireNonNull(version, "version");
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("version")
    public final Builder version(Optional<String> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = version.orElse(null);
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extension")
    public final Builder extension(Optional<? extends List<Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#concept() concept} to concept.
     * @param concept The value for concept
     * @return {@code this} builder for chained invocation
     */
    public final Builder concept(List<ValueSet_Concept> concept) {
      checkNotIsSet(conceptIsSet(), "concept");
      this.concept = Objects.requireNonNull(concept, "concept");
      optBits |= OPT_BIT_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#concept() concept} to concept.
     * @param concept The value for concept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("concept")
    public final Builder concept(Optional<? extends List<ValueSet_Concept>> concept) {
      checkNotIsSet(conceptIsSet(), "concept");
      this.concept = concept.orElse(null);
      optBits |= OPT_BIT_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for chained invocation
     */
    public final Builder system(Uri system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = Objects.requireNonNull(system, "system");
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("system")
    public final Builder system(Optional<? extends Uri> system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = system.orElse(null);
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#filter() filter} to filter.
     * @param filter The value for filter
     * @return {@code this} builder for chained invocation
     */
    public final Builder filter(List<ValueSet_Filter> filter) {
      checkNotIsSet(filterIsSet(), "filter");
      this.filter = Objects.requireNonNull(filter, "filter");
      optBits |= OPT_BIT_FILTER;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#filter() filter} to filter.
     * @param filter The value for filter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("filter")
    public final Builder filter(Optional<? extends List<ValueSet_Filter>> filter) {
      checkNotIsSet(filterIsSet(), "filter");
      this.filter = filter.orElse(null);
      optBits |= OPT_BIT_FILTER;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(List<Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifierExtension")
    public final Builder modifierExtension(Optional<? extends List<Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Builds a new {@link ValueSet_Include ValueSet_Include}.
     * @return An immutable instance of ValueSet_Include
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ValueSet_Include build() {
      return new ImmutableValueSet_Include(valueSet, version, id, extension, concept, system, filter, modifierExtension);
    }

    private boolean valueSetIsSet() {
      return (optBits & OPT_BIT_VALUE_SET) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean conceptIsSet() {
      return (optBits & OPT_BIT_CONCEPT) != 0;
    }

    private boolean systemIsSet() {
      return (optBits & OPT_BIT_SYSTEM) != 0;
    }

    private boolean filterIsSet() {
      return (optBits & OPT_BIT_FILTER) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ValueSet_Include is strict, attribute is already set: ".concat(name));
    }
  }
}

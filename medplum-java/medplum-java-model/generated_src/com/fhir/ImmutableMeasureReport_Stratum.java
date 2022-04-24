package com.fhir;

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
 * Immutable implementation of {@link MeasureReport_Stratum}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMeasureReport_Stratum.builder()}.
 */
@Generated(from = "MeasureReport_Stratum", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMeasureReport_Stratum implements MeasureReport_Stratum {
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable List<MeasureReport_Population1> population;
  private final @Nullable CodeableConcept value;
  private final @Nullable List<MeasureReport_Component> component;
  private final @Nullable Quantity measureScore;

  private ImmutableMeasureReport_Stratum(
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable List<MeasureReport_Population1> population,
      @Nullable CodeableConcept value,
      @Nullable List<MeasureReport_Component> component,
      @Nullable Quantity measureScore) {
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.population = population;
    this.value = value;
    this.component = component;
    this.measureScore = measureScore;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code population} attribute
   */
  @JsonProperty("population")
  @Override
  public Optional<List<MeasureReport_Population1>> population() {
    return Optional.ofNullable(population);
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public Optional<CodeableConcept> value() {
    return Optional.ofNullable(value);
  }

  /**
   * @return The value of the {@code component} attribute
   */
  @JsonProperty("component")
  @Override
  public Optional<List<MeasureReport_Component>> component() {
    return Optional.ofNullable(component);
  }

  /**
   * @return The value of the {@code measureScore} attribute
   */
  @JsonProperty("measureScore")
  @Override
  public Optional<Quantity> measureScore() {
    return Optional.ofNullable(measureScore);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport_Stratum#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Stratum withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMeasureReport_Stratum(
        newValue,
        this.modifierExtension,
        this.id,
        this.population,
        this.value,
        this.component,
        this.measureScore);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport_Stratum#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport_Stratum withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMeasureReport_Stratum(
        value,
        this.modifierExtension,
        this.id,
        this.population,
        this.value,
        this.component,
        this.measureScore);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport_Stratum#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Stratum withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMeasureReport_Stratum(
        this.extension,
        newValue,
        this.id,
        this.population,
        this.value,
        this.component,
        this.measureScore);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport_Stratum#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport_Stratum withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMeasureReport_Stratum(this.extension, value, this.id, this.population, this.value, this.component, this.measureScore);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport_Stratum#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Stratum withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMeasureReport_Stratum(
        this.extension,
        this.modifierExtension,
        newValue,
        this.population,
        this.value,
        this.component,
        this.measureScore);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport_Stratum#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Stratum withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMeasureReport_Stratum(
        this.extension,
        this.modifierExtension,
        value,
        this.population,
        this.value,
        this.component,
        this.measureScore);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport_Stratum#population() population} attribute.
   * @param value The value for population
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Stratum withPopulation(List<MeasureReport_Population1> value) {
    @Nullable List<MeasureReport_Population1> newValue = Objects.requireNonNull(value, "population");
    if (this.population == newValue) return this;
    return new ImmutableMeasureReport_Stratum(
        this.extension,
        this.modifierExtension,
        this.id,
        newValue,
        this.value,
        this.component,
        this.measureScore);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport_Stratum#population() population} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for population
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport_Stratum withPopulation(Optional<? extends List<MeasureReport_Population1>> optional) {
    @Nullable List<MeasureReport_Population1> value = optional.orElse(null);
    if (this.population == value) return this;
    return new ImmutableMeasureReport_Stratum(
        this.extension,
        this.modifierExtension,
        this.id,
        value,
        this.value,
        this.component,
        this.measureScore);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport_Stratum#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Stratum withValue(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "value");
    if (this.value == newValue) return this;
    return new ImmutableMeasureReport_Stratum(
        this.extension,
        this.modifierExtension,
        this.id,
        this.population,
        newValue,
        this.component,
        this.measureScore);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport_Stratum#value() value} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport_Stratum withValue(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.value == value) return this;
    return new ImmutableMeasureReport_Stratum(
        this.extension,
        this.modifierExtension,
        this.id,
        this.population,
        value,
        this.component,
        this.measureScore);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport_Stratum#component() component} attribute.
   * @param value The value for component
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Stratum withComponent(List<MeasureReport_Component> value) {
    @Nullable List<MeasureReport_Component> newValue = Objects.requireNonNull(value, "component");
    if (this.component == newValue) return this;
    return new ImmutableMeasureReport_Stratum(
        this.extension,
        this.modifierExtension,
        this.id,
        this.population,
        this.value,
        newValue,
        this.measureScore);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport_Stratum#component() component} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for component
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport_Stratum withComponent(Optional<? extends List<MeasureReport_Component>> optional) {
    @Nullable List<MeasureReport_Component> value = optional.orElse(null);
    if (this.component == value) return this;
    return new ImmutableMeasureReport_Stratum(
        this.extension,
        this.modifierExtension,
        this.id,
        this.population,
        this.value,
        value,
        this.measureScore);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport_Stratum#measureScore() measureScore} attribute.
   * @param value The value for measureScore
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Stratum withMeasureScore(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "measureScore");
    if (this.measureScore == newValue) return this;
    return new ImmutableMeasureReport_Stratum(
        this.extension,
        this.modifierExtension,
        this.id,
        this.population,
        this.value,
        this.component,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport_Stratum#measureScore() measureScore} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for measureScore
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport_Stratum withMeasureScore(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.measureScore == value) return this;
    return new ImmutableMeasureReport_Stratum(
        this.extension,
        this.modifierExtension,
        this.id,
        this.population,
        this.value,
        this.component,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMeasureReport_Stratum} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMeasureReport_Stratum
        && equalTo((ImmutableMeasureReport_Stratum) another);
  }

  private boolean equalTo(ImmutableMeasureReport_Stratum another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(population, another.population)
        && Objects.equals(value, another.value)
        && Objects.equals(component, another.component)
        && Objects.equals(measureScore, another.measureScore);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code modifierExtension}, {@code id}, {@code population}, {@code value}, {@code component}, {@code measureScore}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(population);
    h += (h << 5) + Objects.hashCode(value);
    h += (h << 5) + Objects.hashCode(component);
    h += (h << 5) + Objects.hashCode(measureScore);
    return h;
  }

  /**
   * Prints the immutable value {@code MeasureReport_Stratum} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MeasureReport_Stratum{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (population != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("population=").append(population);
    }
    if (value != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("value=").append(value);
    }
    if (component != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("component=").append(component);
    }
    if (measureScore != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("measureScore=").append(measureScore);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MeasureReport_Stratum", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MeasureReport_Stratum {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<MeasureReport_Population1>> population = Optional.empty();
    boolean populationIsSet;
    @Nullable Optional<CodeableConcept> value = Optional.empty();
    boolean valueIsSet;
    @Nullable Optional<List<MeasureReport_Component>> component = Optional.empty();
    boolean componentIsSet;
    @Nullable Optional<Quantity> measureScore = Optional.empty();
    boolean measureScoreIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("population")
    public void setPopulation(Optional<List<MeasureReport_Population1>> population) {
      this.population = population;
      this.populationIsSet = true;
    }
    @JsonProperty("value")
    public void setValue(Optional<CodeableConcept> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @JsonProperty("component")
    public void setComponent(Optional<List<MeasureReport_Component>> component) {
      this.component = component;
      this.componentIsSet = true;
    }
    @JsonProperty("measureScore")
    public void setMeasureScore(Optional<Quantity> measureScore) {
      this.measureScore = measureScore;
      this.measureScoreIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MeasureReport_Population1>> population() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> value() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MeasureReport_Component>> component() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> measureScore() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMeasureReport_Stratum fromJson(Json json) {
    ImmutableMeasureReport_Stratum.Builder builder = ImmutableMeasureReport_Stratum.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.populationIsSet) {
      builder.population(json.population);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.componentIsSet) {
      builder.component(json.component);
    }
    if (json.measureScoreIsSet) {
      builder.measureScore(json.measureScore);
    }
    return (ImmutableMeasureReport_Stratum) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MeasureReport_Stratum} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MeasureReport_Stratum instance
   */
  public static MeasureReport_Stratum copyOf(MeasureReport_Stratum instance) {
    if (instance instanceof ImmutableMeasureReport_Stratum) {
      return (ImmutableMeasureReport_Stratum) instance;
    }
    return ImmutableMeasureReport_Stratum.builder()
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .population(instance.population())
        .value(instance.value())
        .component(instance.component())
        .measureScore(instance.measureScore())
        .build();
  }

  /**
   * Creates a builder for {@link MeasureReport_Stratum MeasureReport_Stratum}.
   * <pre>
   * ImmutableMeasureReport_Stratum.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MeasureReport_Stratum#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MeasureReport_Stratum#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link MeasureReport_Stratum#id() id}
   *    .population(List&amp;lt;com.fhir.MeasureReport_Population1&amp;gt;) // optional {@link MeasureReport_Stratum#population() population}
   *    .value(com.fhir.CodeableConcept) // optional {@link MeasureReport_Stratum#value() value}
   *    .component(List&amp;lt;com.fhir.MeasureReport_Component&amp;gt;) // optional {@link MeasureReport_Stratum#component() component}
   *    .measureScore(com.fhir.Quantity) // optional {@link MeasureReport_Stratum#measureScore() measureScore}
   *    .build();
   * </pre>
   * @return A new MeasureReport_Stratum builder
   */
  public static ImmutableMeasureReport_Stratum.Builder builder() {
    return new ImmutableMeasureReport_Stratum.Builder();
  }

  /**
   * Builds instances of type {@link MeasureReport_Stratum MeasureReport_Stratum}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MeasureReport_Stratum", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_POPULATION = 0x8L;
    private static final long OPT_BIT_VALUE = 0x10L;
    private static final long OPT_BIT_COMPONENT = 0x20L;
    private static final long OPT_BIT_MEASURE_SCORE = 0x40L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable List<MeasureReport_Population1> population;
    private @Nullable CodeableConcept value;
    private @Nullable List<MeasureReport_Component> component;
    private @Nullable Quantity measureScore;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MeasureReport_Stratum#extension() extension} to extension.
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
     * Initializes the optional value {@link MeasureReport_Stratum#extension() extension} to extension.
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
     * Initializes the optional value {@link MeasureReport_Stratum#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MeasureReport_Stratum#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MeasureReport_Stratum#id() id} to id.
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
     * Initializes the optional value {@link MeasureReport_Stratum#id() id} to id.
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
     * Initializes the optional value {@link MeasureReport_Stratum#population() population} to population.
     * @param population The value for population
     * @return {@code this} builder for chained invocation
     */
    public final Builder population(List<MeasureReport_Population1> population) {
      checkNotIsSet(populationIsSet(), "population");
      this.population = Objects.requireNonNull(population, "population");
      optBits |= OPT_BIT_POPULATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport_Stratum#population() population} to population.
     * @param population The value for population
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("population")
    public final Builder population(Optional<? extends List<MeasureReport_Population1>> population) {
      checkNotIsSet(populationIsSet(), "population");
      this.population = population.orElse(null);
      optBits |= OPT_BIT_POPULATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport_Stratum#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    public final Builder value(CodeableConcept value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = Objects.requireNonNull(value, "value");
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport_Stratum#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder value(Optional<? extends CodeableConcept> value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = value.orElse(null);
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport_Stratum#component() component} to component.
     * @param component The value for component
     * @return {@code this} builder for chained invocation
     */
    public final Builder component(List<MeasureReport_Component> component) {
      checkNotIsSet(componentIsSet(), "component");
      this.component = Objects.requireNonNull(component, "component");
      optBits |= OPT_BIT_COMPONENT;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport_Stratum#component() component} to component.
     * @param component The value for component
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("component")
    public final Builder component(Optional<? extends List<MeasureReport_Component>> component) {
      checkNotIsSet(componentIsSet(), "component");
      this.component = component.orElse(null);
      optBits |= OPT_BIT_COMPONENT;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport_Stratum#measureScore() measureScore} to measureScore.
     * @param measureScore The value for measureScore
     * @return {@code this} builder for chained invocation
     */
    public final Builder measureScore(Quantity measureScore) {
      checkNotIsSet(measureScoreIsSet(), "measureScore");
      this.measureScore = Objects.requireNonNull(measureScore, "measureScore");
      optBits |= OPT_BIT_MEASURE_SCORE;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport_Stratum#measureScore() measureScore} to measureScore.
     * @param measureScore The value for measureScore
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("measureScore")
    public final Builder measureScore(Optional<? extends Quantity> measureScore) {
      checkNotIsSet(measureScoreIsSet(), "measureScore");
      this.measureScore = measureScore.orElse(null);
      optBits |= OPT_BIT_MEASURE_SCORE;
      return this;
    }

    /**
     * Builds a new {@link MeasureReport_Stratum MeasureReport_Stratum}.
     * @return An immutable instance of MeasureReport_Stratum
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MeasureReport_Stratum build() {
      return new ImmutableMeasureReport_Stratum(extension, modifierExtension, id, population, value, component, measureScore);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean populationIsSet() {
      return (optBits & OPT_BIT_POPULATION) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean componentIsSet() {
      return (optBits & OPT_BIT_COMPONENT) != 0;
    }

    private boolean measureScoreIsSet() {
      return (optBits & OPT_BIT_MEASURE_SCORE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MeasureReport_Stratum is strict, attribute is already set: ".concat(name));
    }
  }
}

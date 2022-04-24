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
 * Immutable implementation of {@link MeasureReport_Group}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMeasureReport_Group.builder()}.
 */
@Generated(from = "MeasureReport_Group", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMeasureReport_Group implements MeasureReport_Group {
  private final @Nullable String id;
  private final @Nullable Quantity measureScore;
  private final @Nullable CodeableConcept code;
  private final @Nullable List<MeasureReport_Population> population;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<MeasureReport_Stratifier> stratifier;
  private final @Nullable List<Extension> extension;

  private ImmutableMeasureReport_Group(
      @Nullable String id,
      @Nullable Quantity measureScore,
      @Nullable CodeableConcept code,
      @Nullable List<MeasureReport_Population> population,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<MeasureReport_Stratifier> stratifier,
      @Nullable List<Extension> extension) {
    this.id = id;
    this.measureScore = measureScore;
    this.code = code;
    this.population = population;
    this.modifierExtension = modifierExtension;
    this.stratifier = stratifier;
    this.extension = extension;
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
   * @return The value of the {@code measureScore} attribute
   */
  @JsonProperty("measureScore")
  @Override
  public Optional<Quantity> measureScore() {
    return Optional.ofNullable(measureScore);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<CodeableConcept> code() {
    return Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code population} attribute
   */
  @JsonProperty("population")
  @Override
  public Optional<List<MeasureReport_Population>> population() {
    return Optional.ofNullable(population);
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
   * @return The value of the {@code stratifier} attribute
   */
  @JsonProperty("stratifier")
  @Override
  public Optional<List<MeasureReport_Stratifier>> stratifier() {
    return Optional.ofNullable(stratifier);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport_Group#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Group withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMeasureReport_Group(
        newValue,
        this.measureScore,
        this.code,
        this.population,
        this.modifierExtension,
        this.stratifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport_Group#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Group withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMeasureReport_Group(
        value,
        this.measureScore,
        this.code,
        this.population,
        this.modifierExtension,
        this.stratifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport_Group#measureScore() measureScore} attribute.
   * @param value The value for measureScore
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Group withMeasureScore(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "measureScore");
    if (this.measureScore == newValue) return this;
    return new ImmutableMeasureReport_Group(
        this.id,
        newValue,
        this.code,
        this.population,
        this.modifierExtension,
        this.stratifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport_Group#measureScore() measureScore} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for measureScore
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport_Group withMeasureScore(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.measureScore == value) return this;
    return new ImmutableMeasureReport_Group(
        this.id,
        value,
        this.code,
        this.population,
        this.modifierExtension,
        this.stratifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport_Group#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Group withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableMeasureReport_Group(
        this.id,
        this.measureScore,
        newValue,
        this.population,
        this.modifierExtension,
        this.stratifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport_Group#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport_Group withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableMeasureReport_Group(
        this.id,
        this.measureScore,
        value,
        this.population,
        this.modifierExtension,
        this.stratifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport_Group#population() population} attribute.
   * @param value The value for population
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Group withPopulation(List<MeasureReport_Population> value) {
    @Nullable List<MeasureReport_Population> newValue = Objects.requireNonNull(value, "population");
    if (this.population == newValue) return this;
    return new ImmutableMeasureReport_Group(
        this.id,
        this.measureScore,
        this.code,
        newValue,
        this.modifierExtension,
        this.stratifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport_Group#population() population} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for population
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport_Group withPopulation(Optional<? extends List<MeasureReport_Population>> optional) {
    @Nullable List<MeasureReport_Population> value = optional.orElse(null);
    if (this.population == value) return this;
    return new ImmutableMeasureReport_Group(
        this.id,
        this.measureScore,
        this.code,
        value,
        this.modifierExtension,
        this.stratifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport_Group#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Group withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMeasureReport_Group(
        this.id,
        this.measureScore,
        this.code,
        this.population,
        newValue,
        this.stratifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport_Group#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport_Group withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMeasureReport_Group(this.id, this.measureScore, this.code, this.population, value, this.stratifier, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport_Group#stratifier() stratifier} attribute.
   * @param value The value for stratifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Group withStratifier(List<MeasureReport_Stratifier> value) {
    @Nullable List<MeasureReport_Stratifier> newValue = Objects.requireNonNull(value, "stratifier");
    if (this.stratifier == newValue) return this;
    return new ImmutableMeasureReport_Group(
        this.id,
        this.measureScore,
        this.code,
        this.population,
        this.modifierExtension,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport_Group#stratifier() stratifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for stratifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport_Group withStratifier(Optional<? extends List<MeasureReport_Stratifier>> optional) {
    @Nullable List<MeasureReport_Stratifier> value = optional.orElse(null);
    if (this.stratifier == value) return this;
    return new ImmutableMeasureReport_Group(
        this.id,
        this.measureScore,
        this.code,
        this.population,
        this.modifierExtension,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport_Group#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Group withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMeasureReport_Group(
        this.id,
        this.measureScore,
        this.code,
        this.population,
        this.modifierExtension,
        this.stratifier,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport_Group#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport_Group withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMeasureReport_Group(
        this.id,
        this.measureScore,
        this.code,
        this.population,
        this.modifierExtension,
        this.stratifier,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMeasureReport_Group} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMeasureReport_Group
        && equalTo((ImmutableMeasureReport_Group) another);
  }

  private boolean equalTo(ImmutableMeasureReport_Group another) {
    return Objects.equals(id, another.id)
        && Objects.equals(measureScore, another.measureScore)
        && Objects.equals(code, another.code)
        && Objects.equals(population, another.population)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(stratifier, another.stratifier)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code measureScore}, {@code code}, {@code population}, {@code modifierExtension}, {@code stratifier}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(measureScore);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(population);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(stratifier);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code MeasureReport_Group} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MeasureReport_Group{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (measureScore != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("measureScore=").append(measureScore);
    }
    if (code != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (population != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("population=").append(population);
    }
    if (modifierExtension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (stratifier != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("stratifier=").append(stratifier);
    }
    if (extension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MeasureReport_Group", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MeasureReport_Group {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Quantity> measureScore = Optional.empty();
    boolean measureScoreIsSet;
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<List<MeasureReport_Population>> population = Optional.empty();
    boolean populationIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<MeasureReport_Stratifier>> stratifier = Optional.empty();
    boolean stratifierIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("measureScore")
    public void setMeasureScore(Optional<Quantity> measureScore) {
      this.measureScore = measureScore;
      this.measureScoreIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("population")
    public void setPopulation(Optional<List<MeasureReport_Population>> population) {
      this.population = population;
      this.populationIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("stratifier")
    public void setStratifier(Optional<List<MeasureReport_Stratifier>> stratifier) {
      this.stratifier = stratifier;
      this.stratifierIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> measureScore() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MeasureReport_Population>> population() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MeasureReport_Stratifier>> stratifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMeasureReport_Group fromJson(Json json) {
    ImmutableMeasureReport_Group.Builder builder = ImmutableMeasureReport_Group.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.measureScoreIsSet) {
      builder.measureScore(json.measureScore);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.populationIsSet) {
      builder.population(json.population);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.stratifierIsSet) {
      builder.stratifier(json.stratifier);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableMeasureReport_Group) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MeasureReport_Group} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MeasureReport_Group instance
   */
  public static MeasureReport_Group copyOf(MeasureReport_Group instance) {
    if (instance instanceof ImmutableMeasureReport_Group) {
      return (ImmutableMeasureReport_Group) instance;
    }
    return ImmutableMeasureReport_Group.builder()
        .id(instance.id())
        .measureScore(instance.measureScore())
        .code(instance.code())
        .population(instance.population())
        .modifierExtension(instance.modifierExtension())
        .stratifier(instance.stratifier())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link MeasureReport_Group MeasureReport_Group}.
   * <pre>
   * ImmutableMeasureReport_Group.builder()
   *    .id(String) // optional {@link MeasureReport_Group#id() id}
   *    .measureScore(com.fhir.Quantity) // optional {@link MeasureReport_Group#measureScore() measureScore}
   *    .code(com.fhir.CodeableConcept) // optional {@link MeasureReport_Group#code() code}
   *    .population(List&amp;lt;com.fhir.MeasureReport_Population&amp;gt;) // optional {@link MeasureReport_Group#population() population}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MeasureReport_Group#modifierExtension() modifierExtension}
   *    .stratifier(List&amp;lt;com.fhir.MeasureReport_Stratifier&amp;gt;) // optional {@link MeasureReport_Group#stratifier() stratifier}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MeasureReport_Group#extension() extension}
   *    .build();
   * </pre>
   * @return A new MeasureReport_Group builder
   */
  public static ImmutableMeasureReport_Group.Builder builder() {
    return new ImmutableMeasureReport_Group.Builder();
  }

  /**
   * Builds instances of type {@link MeasureReport_Group MeasureReport_Group}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MeasureReport_Group", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_MEASURE_SCORE = 0x2L;
    private static final long OPT_BIT_CODE = 0x4L;
    private static final long OPT_BIT_POPULATION = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_STRATIFIER = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private long optBits;

    private @Nullable String id;
    private @Nullable Quantity measureScore;
    private @Nullable CodeableConcept code;
    private @Nullable List<MeasureReport_Population> population;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<MeasureReport_Stratifier> stratifier;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MeasureReport_Group#id() id} to id.
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
     * Initializes the optional value {@link MeasureReport_Group#id() id} to id.
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
     * Initializes the optional value {@link MeasureReport_Group#measureScore() measureScore} to measureScore.
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
     * Initializes the optional value {@link MeasureReport_Group#measureScore() measureScore} to measureScore.
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
     * Initializes the optional value {@link MeasureReport_Group#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport_Group#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport_Group#population() population} to population.
     * @param population The value for population
     * @return {@code this} builder for chained invocation
     */
    public final Builder population(List<MeasureReport_Population> population) {
      checkNotIsSet(populationIsSet(), "population");
      this.population = Objects.requireNonNull(population, "population");
      optBits |= OPT_BIT_POPULATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport_Group#population() population} to population.
     * @param population The value for population
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("population")
    public final Builder population(Optional<? extends List<MeasureReport_Population>> population) {
      checkNotIsSet(populationIsSet(), "population");
      this.population = population.orElse(null);
      optBits |= OPT_BIT_POPULATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport_Group#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MeasureReport_Group#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MeasureReport_Group#stratifier() stratifier} to stratifier.
     * @param stratifier The value for stratifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder stratifier(List<MeasureReport_Stratifier> stratifier) {
      checkNotIsSet(stratifierIsSet(), "stratifier");
      this.stratifier = Objects.requireNonNull(stratifier, "stratifier");
      optBits |= OPT_BIT_STRATIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport_Group#stratifier() stratifier} to stratifier.
     * @param stratifier The value for stratifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("stratifier")
    public final Builder stratifier(Optional<? extends List<MeasureReport_Stratifier>> stratifier) {
      checkNotIsSet(stratifierIsSet(), "stratifier");
      this.stratifier = stratifier.orElse(null);
      optBits |= OPT_BIT_STRATIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport_Group#extension() extension} to extension.
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
     * Initializes the optional value {@link MeasureReport_Group#extension() extension} to extension.
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
     * Builds a new {@link MeasureReport_Group MeasureReport_Group}.
     * @return An immutable instance of MeasureReport_Group
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MeasureReport_Group build() {
      return new ImmutableMeasureReport_Group(id, measureScore, code, population, modifierExtension, stratifier, extension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean measureScoreIsSet() {
      return (optBits & OPT_BIT_MEASURE_SCORE) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean populationIsSet() {
      return (optBits & OPT_BIT_POPULATION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean stratifierIsSet() {
      return (optBits & OPT_BIT_STRATIFIER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MeasureReport_Group is strict, attribute is already set: ".concat(name));
    }
  }
}

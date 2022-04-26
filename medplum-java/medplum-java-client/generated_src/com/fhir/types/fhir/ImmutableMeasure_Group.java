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
 * Immutable implementation of {@link Measure_Group}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMeasure_Group.builder()}.
 */
@Generated(from = "Measure_Group", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMeasure_Group implements Measure_Group {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String description;
  private final @Nullable List<Measure_Stratifier> stratifier;
  private final @Nullable String id;
  private final @Nullable CodeableConcept code;
  private final @Nullable List<Measure_Population> population;
  private final @Nullable List<Extension> extension;

  private ImmutableMeasure_Group(
      @Nullable List<Extension> modifierExtension,
      @Nullable String description,
      @Nullable List<Measure_Stratifier> stratifier,
      @Nullable String id,
      @Nullable CodeableConcept code,
      @Nullable List<Measure_Population> population,
      @Nullable List<Extension> extension) {
    this.modifierExtension = modifierExtension;
    this.description = description;
    this.stratifier = stratifier;
    this.id = id;
    this.code = code;
    this.population = population;
    this.extension = extension;
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code stratifier} attribute
   */
  @JsonProperty("stratifier")
  @Override
  public Optional<List<Measure_Stratifier>> stratifier() {
    return Optional.ofNullable(stratifier);
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
  public Optional<List<Measure_Population>> population() {
    return Optional.ofNullable(population);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure_Group#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure_Group withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMeasure_Group(
        newValue,
        this.description,
        this.stratifier,
        this.id,
        this.code,
        this.population,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure_Group#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure_Group withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMeasure_Group(value, this.description, this.stratifier, this.id, this.code, this.population, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure_Group#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure_Group withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableMeasure_Group(
        this.modifierExtension,
        newValue,
        this.stratifier,
        this.id,
        this.code,
        this.population,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure_Group#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure_Group withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableMeasure_Group(
        this.modifierExtension,
        value,
        this.stratifier,
        this.id,
        this.code,
        this.population,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure_Group#stratifier() stratifier} attribute.
   * @param value The value for stratifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure_Group withStratifier(List<Measure_Stratifier> value) {
    @Nullable List<Measure_Stratifier> newValue = Objects.requireNonNull(value, "stratifier");
    if (this.stratifier == newValue) return this;
    return new ImmutableMeasure_Group(
        this.modifierExtension,
        this.description,
        newValue,
        this.id,
        this.code,
        this.population,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure_Group#stratifier() stratifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for stratifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure_Group withStratifier(Optional<? extends List<Measure_Stratifier>> optional) {
    @Nullable List<Measure_Stratifier> value = optional.orElse(null);
    if (this.stratifier == value) return this;
    return new ImmutableMeasure_Group(
        this.modifierExtension,
        this.description,
        value,
        this.id,
        this.code,
        this.population,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure_Group#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure_Group withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMeasure_Group(
        this.modifierExtension,
        this.description,
        this.stratifier,
        newValue,
        this.code,
        this.population,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure_Group#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure_Group withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMeasure_Group(
        this.modifierExtension,
        this.description,
        this.stratifier,
        value,
        this.code,
        this.population,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure_Group#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure_Group withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableMeasure_Group(
        this.modifierExtension,
        this.description,
        this.stratifier,
        this.id,
        newValue,
        this.population,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure_Group#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure_Group withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableMeasure_Group(
        this.modifierExtension,
        this.description,
        this.stratifier,
        this.id,
        value,
        this.population,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure_Group#population() population} attribute.
   * @param value The value for population
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure_Group withPopulation(List<Measure_Population> value) {
    @Nullable List<Measure_Population> newValue = Objects.requireNonNull(value, "population");
    if (this.population == newValue) return this;
    return new ImmutableMeasure_Group(
        this.modifierExtension,
        this.description,
        this.stratifier,
        this.id,
        this.code,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure_Group#population() population} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for population
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure_Group withPopulation(Optional<? extends List<Measure_Population>> optional) {
    @Nullable List<Measure_Population> value = optional.orElse(null);
    if (this.population == value) return this;
    return new ImmutableMeasure_Group(
        this.modifierExtension,
        this.description,
        this.stratifier,
        this.id,
        this.code,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure_Group#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure_Group withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMeasure_Group(
        this.modifierExtension,
        this.description,
        this.stratifier,
        this.id,
        this.code,
        this.population,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure_Group#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure_Group withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMeasure_Group(
        this.modifierExtension,
        this.description,
        this.stratifier,
        this.id,
        this.code,
        this.population,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMeasure_Group} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMeasure_Group
        && equalTo((ImmutableMeasure_Group) another);
  }

  private boolean equalTo(ImmutableMeasure_Group another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(description, another.description)
        && Objects.equals(stratifier, another.stratifier)
        && Objects.equals(id, another.id)
        && Objects.equals(code, another.code)
        && Objects.equals(population, another.population)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code description}, {@code stratifier}, {@code id}, {@code code}, {@code population}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(stratifier);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(population);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code Measure_Group} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Measure_Group{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (description != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (stratifier != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("stratifier=").append(stratifier);
    }
    if (id != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (code != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (population != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("population=").append(population);
    }
    if (extension != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Measure_Group", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Measure_Group {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<List<Measure_Stratifier>> stratifier = Optional.empty();
    boolean stratifierIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<List<Measure_Population>> population = Optional.empty();
    boolean populationIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("stratifier")
    public void setStratifier(Optional<List<Measure_Stratifier>> stratifier) {
      this.stratifier = stratifier;
      this.stratifierIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("population")
    public void setPopulation(Optional<List<Measure_Population>> population) {
      this.population = population;
      this.populationIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Measure_Stratifier>> stratifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Measure_Population>> population() { throw new UnsupportedOperationException(); }
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
  static ImmutableMeasure_Group fromJson(Json json) {
    ImmutableMeasure_Group.Builder builder = ImmutableMeasure_Group.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.stratifierIsSet) {
      builder.stratifier(json.stratifier);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.populationIsSet) {
      builder.population(json.population);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableMeasure_Group) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Measure_Group} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Measure_Group instance
   */
  public static Measure_Group copyOf(Measure_Group instance) {
    if (instance instanceof ImmutableMeasure_Group) {
      return (ImmutableMeasure_Group) instance;
    }
    return ImmutableMeasure_Group.builder()
        .modifierExtension(instance.modifierExtension())
        .description(instance.description())
        .stratifier(instance.stratifier())
        .id(instance.id())
        .code(instance.code())
        .population(instance.population())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link Measure_Group Measure_Group}.
   * <pre>
   * ImmutableMeasure_Group.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Measure_Group#modifierExtension() modifierExtension}
   *    .description(String) // optional {@link Measure_Group#description() description}
   *    .stratifier(List&amp;lt;com.fhir.types.fhir.Measure_Stratifier&amp;gt;) // optional {@link Measure_Group#stratifier() stratifier}
   *    .id(String) // optional {@link Measure_Group#id() id}
   *    .code(com.fhir.types.fhir.CodeableConcept) // optional {@link Measure_Group#code() code}
   *    .population(List&amp;lt;com.fhir.types.fhir.Measure_Population&amp;gt;) // optional {@link Measure_Group#population() population}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Measure_Group#extension() extension}
   *    .build();
   * </pre>
   * @return A new Measure_Group builder
   */
  public static ImmutableMeasure_Group.Builder builder() {
    return new ImmutableMeasure_Group.Builder();
  }

  /**
   * Builds instances of type {@link Measure_Group Measure_Group}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Measure_Group", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_DESCRIPTION = 0x2L;
    private static final long OPT_BIT_STRATIFIER = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_CODE = 0x10L;
    private static final long OPT_BIT_POPULATION = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable String description;
    private @Nullable List<Measure_Stratifier> stratifier;
    private @Nullable String id;
    private @Nullable CodeableConcept code;
    private @Nullable List<Measure_Population> population;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Measure_Group#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Measure_Group#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Measure_Group#description() description} to description.
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
     * Initializes the optional value {@link Measure_Group#description() description} to description.
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
     * Initializes the optional value {@link Measure_Group#stratifier() stratifier} to stratifier.
     * @param stratifier The value for stratifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder stratifier(List<Measure_Stratifier> stratifier) {
      checkNotIsSet(stratifierIsSet(), "stratifier");
      this.stratifier = Objects.requireNonNull(stratifier, "stratifier");
      optBits |= OPT_BIT_STRATIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure_Group#stratifier() stratifier} to stratifier.
     * @param stratifier The value for stratifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("stratifier")
    public final Builder stratifier(Optional<? extends List<Measure_Stratifier>> stratifier) {
      checkNotIsSet(stratifierIsSet(), "stratifier");
      this.stratifier = stratifier.orElse(null);
      optBits |= OPT_BIT_STRATIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure_Group#id() id} to id.
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
     * Initializes the optional value {@link Measure_Group#id() id} to id.
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
     * Initializes the optional value {@link Measure_Group#code() code} to code.
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
     * Initializes the optional value {@link Measure_Group#code() code} to code.
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
     * Initializes the optional value {@link Measure_Group#population() population} to population.
     * @param population The value for population
     * @return {@code this} builder for chained invocation
     */
    public final Builder population(List<Measure_Population> population) {
      checkNotIsSet(populationIsSet(), "population");
      this.population = Objects.requireNonNull(population, "population");
      optBits |= OPT_BIT_POPULATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure_Group#population() population} to population.
     * @param population The value for population
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("population")
    public final Builder population(Optional<? extends List<Measure_Population>> population) {
      checkNotIsSet(populationIsSet(), "population");
      this.population = population.orElse(null);
      optBits |= OPT_BIT_POPULATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure_Group#extension() extension} to extension.
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
     * Initializes the optional value {@link Measure_Group#extension() extension} to extension.
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
     * Builds a new {@link Measure_Group Measure_Group}.
     * @return An immutable instance of Measure_Group
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Measure_Group build() {
      return new ImmutableMeasure_Group(modifierExtension, description, stratifier, id, code, population, extension);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean stratifierIsSet() {
      return (optBits & OPT_BIT_STRATIFIER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean populationIsSet() {
      return (optBits & OPT_BIT_POPULATION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Measure_Group is strict, attribute is already set: ".concat(name));
    }
  }
}

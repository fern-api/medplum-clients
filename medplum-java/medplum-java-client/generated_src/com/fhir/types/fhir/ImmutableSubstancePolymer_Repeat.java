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
 * Immutable implementation of {@link SubstancePolymer_Repeat}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstancePolymer_Repeat.builder()}.
 */
@Generated(from = "SubstancePolymer_Repeat", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstancePolymer_Repeat implements SubstancePolymer_Repeat {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable Integer numberOfUnits;
  private final @Nullable String averageMolecularFormula;
  private final @Nullable CodeableConcept repeatUnitAmountType;
  private final @Nullable List<SubstancePolymer_RepeatUnit> repeatUnit;

  private ImmutableSubstancePolymer_Repeat(
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable Integer numberOfUnits,
      @Nullable String averageMolecularFormula,
      @Nullable CodeableConcept repeatUnitAmountType,
      @Nullable List<SubstancePolymer_RepeatUnit> repeatUnit) {
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.id = id;
    this.numberOfUnits = numberOfUnits;
    this.averageMolecularFormula = averageMolecularFormula;
    this.repeatUnitAmountType = repeatUnitAmountType;
    this.repeatUnit = repeatUnit;
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code numberOfUnits} attribute
   */
  @JsonProperty("numberOfUnits")
  @Override
  public Optional<Integer> numberOfUnits() {
    return Optional.ofNullable(numberOfUnits);
  }

  /**
   * @return The value of the {@code averageMolecularFormula} attribute
   */
  @JsonProperty("averageMolecularFormula")
  @Override
  public Optional<String> averageMolecularFormula() {
    return Optional.ofNullable(averageMolecularFormula);
  }

  /**
   * @return The value of the {@code repeatUnitAmountType} attribute
   */
  @JsonProperty("repeatUnitAmountType")
  @Override
  public Optional<CodeableConcept> repeatUnitAmountType() {
    return Optional.ofNullable(repeatUnitAmountType);
  }

  /**
   * @return The value of the {@code repeatUnit} attribute
   */
  @JsonProperty("repeatUnit")
  @Override
  public Optional<List<SubstancePolymer_RepeatUnit>> repeatUnit() {
    return Optional.ofNullable(repeatUnit);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_Repeat#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_Repeat withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstancePolymer_Repeat(
        newValue,
        this.extension,
        this.id,
        this.numberOfUnits,
        this.averageMolecularFormula,
        this.repeatUnitAmountType,
        this.repeatUnit);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_Repeat#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer_Repeat withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstancePolymer_Repeat(
        value,
        this.extension,
        this.id,
        this.numberOfUnits,
        this.averageMolecularFormula,
        this.repeatUnitAmountType,
        this.repeatUnit);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_Repeat#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_Repeat withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstancePolymer_Repeat(
        this.modifierExtension,
        newValue,
        this.id,
        this.numberOfUnits,
        this.averageMolecularFormula,
        this.repeatUnitAmountType,
        this.repeatUnit);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_Repeat#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer_Repeat withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstancePolymer_Repeat(
        this.modifierExtension,
        value,
        this.id,
        this.numberOfUnits,
        this.averageMolecularFormula,
        this.repeatUnitAmountType,
        this.repeatUnit);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_Repeat#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_Repeat withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstancePolymer_Repeat(
        this.modifierExtension,
        this.extension,
        newValue,
        this.numberOfUnits,
        this.averageMolecularFormula,
        this.repeatUnitAmountType,
        this.repeatUnit);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_Repeat#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_Repeat withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstancePolymer_Repeat(
        this.modifierExtension,
        this.extension,
        value,
        this.numberOfUnits,
        this.averageMolecularFormula,
        this.repeatUnitAmountType,
        this.repeatUnit);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_Repeat#numberOfUnits() numberOfUnits} attribute.
   * @param value The value for numberOfUnits
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_Repeat withNumberOfUnits(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.numberOfUnits, newValue)) return this;
    return new ImmutableSubstancePolymer_Repeat(
        this.modifierExtension,
        this.extension,
        this.id,
        newValue,
        this.averageMolecularFormula,
        this.repeatUnitAmountType,
        this.repeatUnit);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_Repeat#numberOfUnits() numberOfUnits} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for numberOfUnits
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_Repeat withNumberOfUnits(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.numberOfUnits, value)) return this;
    return new ImmutableSubstancePolymer_Repeat(
        this.modifierExtension,
        this.extension,
        this.id,
        value,
        this.averageMolecularFormula,
        this.repeatUnitAmountType,
        this.repeatUnit);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_Repeat#averageMolecularFormula() averageMolecularFormula} attribute.
   * @param value The value for averageMolecularFormula
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_Repeat withAverageMolecularFormula(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "averageMolecularFormula");
    if (Objects.equals(this.averageMolecularFormula, newValue)) return this;
    return new ImmutableSubstancePolymer_Repeat(
        this.modifierExtension,
        this.extension,
        this.id,
        this.numberOfUnits,
        newValue,
        this.repeatUnitAmountType,
        this.repeatUnit);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_Repeat#averageMolecularFormula() averageMolecularFormula} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for averageMolecularFormula
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_Repeat withAverageMolecularFormula(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.averageMolecularFormula, value)) return this;
    return new ImmutableSubstancePolymer_Repeat(
        this.modifierExtension,
        this.extension,
        this.id,
        this.numberOfUnits,
        value,
        this.repeatUnitAmountType,
        this.repeatUnit);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_Repeat#repeatUnitAmountType() repeatUnitAmountType} attribute.
   * @param value The value for repeatUnitAmountType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_Repeat withRepeatUnitAmountType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "repeatUnitAmountType");
    if (this.repeatUnitAmountType == newValue) return this;
    return new ImmutableSubstancePolymer_Repeat(
        this.modifierExtension,
        this.extension,
        this.id,
        this.numberOfUnits,
        this.averageMolecularFormula,
        newValue,
        this.repeatUnit);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_Repeat#repeatUnitAmountType() repeatUnitAmountType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for repeatUnitAmountType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer_Repeat withRepeatUnitAmountType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.repeatUnitAmountType == value) return this;
    return new ImmutableSubstancePolymer_Repeat(
        this.modifierExtension,
        this.extension,
        this.id,
        this.numberOfUnits,
        this.averageMolecularFormula,
        value,
        this.repeatUnit);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_Repeat#repeatUnit() repeatUnit} attribute.
   * @param value The value for repeatUnit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_Repeat withRepeatUnit(List<SubstancePolymer_RepeatUnit> value) {
    @Nullable List<SubstancePolymer_RepeatUnit> newValue = Objects.requireNonNull(value, "repeatUnit");
    if (this.repeatUnit == newValue) return this;
    return new ImmutableSubstancePolymer_Repeat(
        this.modifierExtension,
        this.extension,
        this.id,
        this.numberOfUnits,
        this.averageMolecularFormula,
        this.repeatUnitAmountType,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_Repeat#repeatUnit() repeatUnit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for repeatUnit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer_Repeat withRepeatUnit(Optional<? extends List<SubstancePolymer_RepeatUnit>> optional) {
    @Nullable List<SubstancePolymer_RepeatUnit> value = optional.orElse(null);
    if (this.repeatUnit == value) return this;
    return new ImmutableSubstancePolymer_Repeat(
        this.modifierExtension,
        this.extension,
        this.id,
        this.numberOfUnits,
        this.averageMolecularFormula,
        this.repeatUnitAmountType,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstancePolymer_Repeat} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstancePolymer_Repeat
        && equalTo((ImmutableSubstancePolymer_Repeat) another);
  }

  private boolean equalTo(ImmutableSubstancePolymer_Repeat another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(numberOfUnits, another.numberOfUnits)
        && Objects.equals(averageMolecularFormula, another.averageMolecularFormula)
        && Objects.equals(repeatUnitAmountType, another.repeatUnitAmountType)
        && Objects.equals(repeatUnit, another.repeatUnit);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code extension}, {@code id}, {@code numberOfUnits}, {@code averageMolecularFormula}, {@code repeatUnitAmountType}, {@code repeatUnit}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(numberOfUnits);
    h += (h << 5) + Objects.hashCode(averageMolecularFormula);
    h += (h << 5) + Objects.hashCode(repeatUnitAmountType);
    h += (h << 5) + Objects.hashCode(repeatUnit);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstancePolymer_Repeat} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstancePolymer_Repeat{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (numberOfUnits != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("numberOfUnits=").append(numberOfUnits);
    }
    if (averageMolecularFormula != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("averageMolecularFormula=").append(averageMolecularFormula);
    }
    if (repeatUnitAmountType != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("repeatUnitAmountType=").append(repeatUnitAmountType);
    }
    if (repeatUnit != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("repeatUnit=").append(repeatUnit);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstancePolymer_Repeat", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstancePolymer_Repeat {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Integer> numberOfUnits = Optional.empty();
    boolean numberOfUnitsIsSet;
    @Nullable Optional<String> averageMolecularFormula = Optional.empty();
    boolean averageMolecularFormulaIsSet;
    @Nullable Optional<CodeableConcept> repeatUnitAmountType = Optional.empty();
    boolean repeatUnitAmountTypeIsSet;
    @Nullable Optional<List<SubstancePolymer_RepeatUnit>> repeatUnit = Optional.empty();
    boolean repeatUnitIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("numberOfUnits")
    public void setNumberOfUnits(Optional<Integer> numberOfUnits) {
      this.numberOfUnits = numberOfUnits;
      this.numberOfUnitsIsSet = true;
    }
    @JsonProperty("averageMolecularFormula")
    public void setAverageMolecularFormula(Optional<String> averageMolecularFormula) {
      this.averageMolecularFormula = averageMolecularFormula;
      this.averageMolecularFormulaIsSet = true;
    }
    @JsonProperty("repeatUnitAmountType")
    public void setRepeatUnitAmountType(Optional<CodeableConcept> repeatUnitAmountType) {
      this.repeatUnitAmountType = repeatUnitAmountType;
      this.repeatUnitAmountTypeIsSet = true;
    }
    @JsonProperty("repeatUnit")
    public void setRepeatUnit(Optional<List<SubstancePolymer_RepeatUnit>> repeatUnit) {
      this.repeatUnit = repeatUnit;
      this.repeatUnitIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> numberOfUnits() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> averageMolecularFormula() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> repeatUnitAmountType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SubstancePolymer_RepeatUnit>> repeatUnit() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubstancePolymer_Repeat fromJson(Json json) {
    ImmutableSubstancePolymer_Repeat.Builder builder = ImmutableSubstancePolymer_Repeat.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.numberOfUnitsIsSet) {
      builder.numberOfUnits(json.numberOfUnits);
    }
    if (json.averageMolecularFormulaIsSet) {
      builder.averageMolecularFormula(json.averageMolecularFormula);
    }
    if (json.repeatUnitAmountTypeIsSet) {
      builder.repeatUnitAmountType(json.repeatUnitAmountType);
    }
    if (json.repeatUnitIsSet) {
      builder.repeatUnit(json.repeatUnit);
    }
    return (ImmutableSubstancePolymer_Repeat) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstancePolymer_Repeat} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstancePolymer_Repeat instance
   */
  public static SubstancePolymer_Repeat copyOf(SubstancePolymer_Repeat instance) {
    if (instance instanceof ImmutableSubstancePolymer_Repeat) {
      return (ImmutableSubstancePolymer_Repeat) instance;
    }
    return ImmutableSubstancePolymer_Repeat.builder()
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .id(instance.id())
        .numberOfUnits(instance.numberOfUnits())
        .averageMolecularFormula(instance.averageMolecularFormula())
        .repeatUnitAmountType(instance.repeatUnitAmountType())
        .repeatUnit(instance.repeatUnit())
        .build();
  }

  /**
   * Creates a builder for {@link SubstancePolymer_Repeat SubstancePolymer_Repeat}.
   * <pre>
   * ImmutableSubstancePolymer_Repeat.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SubstancePolymer_Repeat#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SubstancePolymer_Repeat#extension() extension}
   *    .id(String) // optional {@link SubstancePolymer_Repeat#id() id}
   *    .numberOfUnits(Integer) // optional {@link SubstancePolymer_Repeat#numberOfUnits() numberOfUnits}
   *    .averageMolecularFormula(String) // optional {@link SubstancePolymer_Repeat#averageMolecularFormula() averageMolecularFormula}
   *    .repeatUnitAmountType(com.fhir.types.fhir.CodeableConcept) // optional {@link SubstancePolymer_Repeat#repeatUnitAmountType() repeatUnitAmountType}
   *    .repeatUnit(List&amp;lt;com.fhir.types.fhir.SubstancePolymer_RepeatUnit&amp;gt;) // optional {@link SubstancePolymer_Repeat#repeatUnit() repeatUnit}
   *    .build();
   * </pre>
   * @return A new SubstancePolymer_Repeat builder
   */
  public static ImmutableSubstancePolymer_Repeat.Builder builder() {
    return new ImmutableSubstancePolymer_Repeat.Builder();
  }

  /**
   * Builds instances of type {@link SubstancePolymer_Repeat SubstancePolymer_Repeat}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstancePolymer_Repeat", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_NUMBER_OF_UNITS = 0x8L;
    private static final long OPT_BIT_AVERAGE_MOLECULAR_FORMULA = 0x10L;
    private static final long OPT_BIT_REPEAT_UNIT_AMOUNT_TYPE = 0x20L;
    private static final long OPT_BIT_REPEAT_UNIT = 0x40L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable Integer numberOfUnits;
    private @Nullable String averageMolecularFormula;
    private @Nullable CodeableConcept repeatUnitAmountType;
    private @Nullable List<SubstancePolymer_RepeatUnit> repeatUnit;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_Repeat#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstancePolymer_Repeat#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstancePolymer_Repeat#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstancePolymer_Repeat#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstancePolymer_Repeat#id() id} to id.
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
     * Initializes the optional value {@link SubstancePolymer_Repeat#id() id} to id.
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
     * Initializes the optional value {@link SubstancePolymer_Repeat#numberOfUnits() numberOfUnits} to numberOfUnits.
     * @param numberOfUnits The value for numberOfUnits
     * @return {@code this} builder for chained invocation
     */
    public final Builder numberOfUnits(int numberOfUnits) {
      checkNotIsSet(numberOfUnitsIsSet(), "numberOfUnits");
      this.numberOfUnits = numberOfUnits;
      optBits |= OPT_BIT_NUMBER_OF_UNITS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_Repeat#numberOfUnits() numberOfUnits} to numberOfUnits.
     * @param numberOfUnits The value for numberOfUnits
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("numberOfUnits")
    public final Builder numberOfUnits(Optional<Integer> numberOfUnits) {
      checkNotIsSet(numberOfUnitsIsSet(), "numberOfUnits");
      this.numberOfUnits = numberOfUnits.orElse(null);
      optBits |= OPT_BIT_NUMBER_OF_UNITS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_Repeat#averageMolecularFormula() averageMolecularFormula} to averageMolecularFormula.
     * @param averageMolecularFormula The value for averageMolecularFormula
     * @return {@code this} builder for chained invocation
     */
    public final Builder averageMolecularFormula(String averageMolecularFormula) {
      checkNotIsSet(averageMolecularFormulaIsSet(), "averageMolecularFormula");
      this.averageMolecularFormula = Objects.requireNonNull(averageMolecularFormula, "averageMolecularFormula");
      optBits |= OPT_BIT_AVERAGE_MOLECULAR_FORMULA;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_Repeat#averageMolecularFormula() averageMolecularFormula} to averageMolecularFormula.
     * @param averageMolecularFormula The value for averageMolecularFormula
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("averageMolecularFormula")
    public final Builder averageMolecularFormula(Optional<String> averageMolecularFormula) {
      checkNotIsSet(averageMolecularFormulaIsSet(), "averageMolecularFormula");
      this.averageMolecularFormula = averageMolecularFormula.orElse(null);
      optBits |= OPT_BIT_AVERAGE_MOLECULAR_FORMULA;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_Repeat#repeatUnitAmountType() repeatUnitAmountType} to repeatUnitAmountType.
     * @param repeatUnitAmountType The value for repeatUnitAmountType
     * @return {@code this} builder for chained invocation
     */
    public final Builder repeatUnitAmountType(CodeableConcept repeatUnitAmountType) {
      checkNotIsSet(repeatUnitAmountTypeIsSet(), "repeatUnitAmountType");
      this.repeatUnitAmountType = Objects.requireNonNull(repeatUnitAmountType, "repeatUnitAmountType");
      optBits |= OPT_BIT_REPEAT_UNIT_AMOUNT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_Repeat#repeatUnitAmountType() repeatUnitAmountType} to repeatUnitAmountType.
     * @param repeatUnitAmountType The value for repeatUnitAmountType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("repeatUnitAmountType")
    public final Builder repeatUnitAmountType(Optional<? extends CodeableConcept> repeatUnitAmountType) {
      checkNotIsSet(repeatUnitAmountTypeIsSet(), "repeatUnitAmountType");
      this.repeatUnitAmountType = repeatUnitAmountType.orElse(null);
      optBits |= OPT_BIT_REPEAT_UNIT_AMOUNT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_Repeat#repeatUnit() repeatUnit} to repeatUnit.
     * @param repeatUnit The value for repeatUnit
     * @return {@code this} builder for chained invocation
     */
    public final Builder repeatUnit(List<SubstancePolymer_RepeatUnit> repeatUnit) {
      checkNotIsSet(repeatUnitIsSet(), "repeatUnit");
      this.repeatUnit = Objects.requireNonNull(repeatUnit, "repeatUnit");
      optBits |= OPT_BIT_REPEAT_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_Repeat#repeatUnit() repeatUnit} to repeatUnit.
     * @param repeatUnit The value for repeatUnit
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("repeatUnit")
    public final Builder repeatUnit(Optional<? extends List<SubstancePolymer_RepeatUnit>> repeatUnit) {
      checkNotIsSet(repeatUnitIsSet(), "repeatUnit");
      this.repeatUnit = repeatUnit.orElse(null);
      optBits |= OPT_BIT_REPEAT_UNIT;
      return this;
    }

    /**
     * Builds a new {@link SubstancePolymer_Repeat SubstancePolymer_Repeat}.
     * @return An immutable instance of SubstancePolymer_Repeat
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstancePolymer_Repeat build() {
      return new ImmutableSubstancePolymer_Repeat(
          modifierExtension,
          extension,
          id,
          numberOfUnits,
          averageMolecularFormula,
          repeatUnitAmountType,
          repeatUnit);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean numberOfUnitsIsSet() {
      return (optBits & OPT_BIT_NUMBER_OF_UNITS) != 0;
    }

    private boolean averageMolecularFormulaIsSet() {
      return (optBits & OPT_BIT_AVERAGE_MOLECULAR_FORMULA) != 0;
    }

    private boolean repeatUnitAmountTypeIsSet() {
      return (optBits & OPT_BIT_REPEAT_UNIT_AMOUNT_TYPE) != 0;
    }

    private boolean repeatUnitIsSet() {
      return (optBits & OPT_BIT_REPEAT_UNIT) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstancePolymer_Repeat is strict, attribute is already set: ".concat(name));
    }
  }
}

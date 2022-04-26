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
 * Immutable implementation of {@link MolecularSequence_Roc}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMolecularSequence_Roc.builder()}.
 */
@Generated(from = "MolecularSequence_Roc", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMolecularSequence_Roc implements MolecularSequence_Roc {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Integer> numFP;
  private final @Nullable List<Integer> numFN;
  private final @Nullable List<Decimal> sensitivity;
  private final @Nullable List<Integer> score;
  private final @Nullable List<Decimal> precision;
  private final @Nullable List<Decimal> fMeasure;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable List<Integer> numTP;

  private ImmutableMolecularSequence_Roc(
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Integer> numFP,
      @Nullable List<Integer> numFN,
      @Nullable List<Decimal> sensitivity,
      @Nullable List<Integer> score,
      @Nullable List<Decimal> precision,
      @Nullable List<Decimal> fMeasure,
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable List<Integer> numTP) {
    this.modifierExtension = modifierExtension;
    this.numFP = numFP;
    this.numFN = numFN;
    this.sensitivity = sensitivity;
    this.score = score;
    this.precision = precision;
    this.fMeasure = fMeasure;
    this.extension = extension;
    this.id = id;
    this.numTP = numTP;
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
   * @return The value of the {@code numFP} attribute
   */
  @JsonProperty("numFP")
  @Override
  public Optional<List<Integer>> numFP() {
    return Optional.ofNullable(numFP);
  }

  /**
   * @return The value of the {@code numFN} attribute
   */
  @JsonProperty("numFN")
  @Override
  public Optional<List<Integer>> numFN() {
    return Optional.ofNullable(numFN);
  }

  /**
   * @return The value of the {@code sensitivity} attribute
   */
  @JsonProperty("sensitivity")
  @Override
  public Optional<List<Decimal>> sensitivity() {
    return Optional.ofNullable(sensitivity);
  }

  /**
   * @return The value of the {@code score} attribute
   */
  @JsonProperty("score")
  @Override
  public Optional<List<Integer>> score() {
    return Optional.ofNullable(score);
  }

  /**
   * @return The value of the {@code precision} attribute
   */
  @JsonProperty("precision")
  @Override
  public Optional<List<Decimal>> precision() {
    return Optional.ofNullable(precision);
  }

  /**
   * @return The value of the {@code fMeasure} attribute
   */
  @JsonProperty("fMeasure")
  @Override
  public Optional<List<Decimal>> fMeasure() {
    return Optional.ofNullable(fMeasure);
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
   * @return The value of the {@code numTP} attribute
   */
  @JsonProperty("numTP")
  @Override
  public Optional<List<Integer>> numTP() {
    return Optional.ofNullable(numTP);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Roc#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Roc withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMolecularSequence_Roc(
        newValue,
        this.numFP,
        this.numFN,
        this.sensitivity,
        this.score,
        this.precision,
        this.fMeasure,
        this.extension,
        this.id,
        this.numTP);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Roc#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Roc withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMolecularSequence_Roc(
        value,
        this.numFP,
        this.numFN,
        this.sensitivity,
        this.score,
        this.precision,
        this.fMeasure,
        this.extension,
        this.id,
        this.numTP);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Roc#numFP() numFP} attribute.
   * @param value The value for numFP
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Roc withNumFP(List<Integer> value) {
    @Nullable List<Integer> newValue = Objects.requireNonNull(value, "numFP");
    if (this.numFP == newValue) return this;
    return new ImmutableMolecularSequence_Roc(
        this.modifierExtension,
        newValue,
        this.numFN,
        this.sensitivity,
        this.score,
        this.precision,
        this.fMeasure,
        this.extension,
        this.id,
        this.numTP);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Roc#numFP() numFP} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for numFP
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Roc withNumFP(Optional<? extends List<Integer>> optional) {
    @Nullable List<Integer> value = optional.orElse(null);
    if (this.numFP == value) return this;
    return new ImmutableMolecularSequence_Roc(
        this.modifierExtension,
        value,
        this.numFN,
        this.sensitivity,
        this.score,
        this.precision,
        this.fMeasure,
        this.extension,
        this.id,
        this.numTP);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Roc#numFN() numFN} attribute.
   * @param value The value for numFN
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Roc withNumFN(List<Integer> value) {
    @Nullable List<Integer> newValue = Objects.requireNonNull(value, "numFN");
    if (this.numFN == newValue) return this;
    return new ImmutableMolecularSequence_Roc(
        this.modifierExtension,
        this.numFP,
        newValue,
        this.sensitivity,
        this.score,
        this.precision,
        this.fMeasure,
        this.extension,
        this.id,
        this.numTP);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Roc#numFN() numFN} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for numFN
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Roc withNumFN(Optional<? extends List<Integer>> optional) {
    @Nullable List<Integer> value = optional.orElse(null);
    if (this.numFN == value) return this;
    return new ImmutableMolecularSequence_Roc(
        this.modifierExtension,
        this.numFP,
        value,
        this.sensitivity,
        this.score,
        this.precision,
        this.fMeasure,
        this.extension,
        this.id,
        this.numTP);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Roc#sensitivity() sensitivity} attribute.
   * @param value The value for sensitivity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Roc withSensitivity(List<Decimal> value) {
    @Nullable List<Decimal> newValue = Objects.requireNonNull(value, "sensitivity");
    if (this.sensitivity == newValue) return this;
    return new ImmutableMolecularSequence_Roc(
        this.modifierExtension,
        this.numFP,
        this.numFN,
        newValue,
        this.score,
        this.precision,
        this.fMeasure,
        this.extension,
        this.id,
        this.numTP);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Roc#sensitivity() sensitivity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sensitivity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Roc withSensitivity(Optional<? extends List<Decimal>> optional) {
    @Nullable List<Decimal> value = optional.orElse(null);
    if (this.sensitivity == value) return this;
    return new ImmutableMolecularSequence_Roc(
        this.modifierExtension,
        this.numFP,
        this.numFN,
        value,
        this.score,
        this.precision,
        this.fMeasure,
        this.extension,
        this.id,
        this.numTP);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Roc#score() score} attribute.
   * @param value The value for score
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Roc withScore(List<Integer> value) {
    @Nullable List<Integer> newValue = Objects.requireNonNull(value, "score");
    if (this.score == newValue) return this;
    return new ImmutableMolecularSequence_Roc(
        this.modifierExtension,
        this.numFP,
        this.numFN,
        this.sensitivity,
        newValue,
        this.precision,
        this.fMeasure,
        this.extension,
        this.id,
        this.numTP);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Roc#score() score} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for score
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Roc withScore(Optional<? extends List<Integer>> optional) {
    @Nullable List<Integer> value = optional.orElse(null);
    if (this.score == value) return this;
    return new ImmutableMolecularSequence_Roc(
        this.modifierExtension,
        this.numFP,
        this.numFN,
        this.sensitivity,
        value,
        this.precision,
        this.fMeasure,
        this.extension,
        this.id,
        this.numTP);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Roc#precision() precision} attribute.
   * @param value The value for precision
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Roc withPrecision(List<Decimal> value) {
    @Nullable List<Decimal> newValue = Objects.requireNonNull(value, "precision");
    if (this.precision == newValue) return this;
    return new ImmutableMolecularSequence_Roc(
        this.modifierExtension,
        this.numFP,
        this.numFN,
        this.sensitivity,
        this.score,
        newValue,
        this.fMeasure,
        this.extension,
        this.id,
        this.numTP);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Roc#precision() precision} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for precision
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Roc withPrecision(Optional<? extends List<Decimal>> optional) {
    @Nullable List<Decimal> value = optional.orElse(null);
    if (this.precision == value) return this;
    return new ImmutableMolecularSequence_Roc(
        this.modifierExtension,
        this.numFP,
        this.numFN,
        this.sensitivity,
        this.score,
        value,
        this.fMeasure,
        this.extension,
        this.id,
        this.numTP);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Roc#fMeasure() fMeasure} attribute.
   * @param value The value for fMeasure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Roc withFMeasure(List<Decimal> value) {
    @Nullable List<Decimal> newValue = Objects.requireNonNull(value, "fMeasure");
    if (this.fMeasure == newValue) return this;
    return new ImmutableMolecularSequence_Roc(
        this.modifierExtension,
        this.numFP,
        this.numFN,
        this.sensitivity,
        this.score,
        this.precision,
        newValue,
        this.extension,
        this.id,
        this.numTP);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Roc#fMeasure() fMeasure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fMeasure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Roc withFMeasure(Optional<? extends List<Decimal>> optional) {
    @Nullable List<Decimal> value = optional.orElse(null);
    if (this.fMeasure == value) return this;
    return new ImmutableMolecularSequence_Roc(
        this.modifierExtension,
        this.numFP,
        this.numFN,
        this.sensitivity,
        this.score,
        this.precision,
        value,
        this.extension,
        this.id,
        this.numTP);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Roc#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Roc withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMolecularSequence_Roc(
        this.modifierExtension,
        this.numFP,
        this.numFN,
        this.sensitivity,
        this.score,
        this.precision,
        this.fMeasure,
        newValue,
        this.id,
        this.numTP);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Roc#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Roc withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMolecularSequence_Roc(
        this.modifierExtension,
        this.numFP,
        this.numFN,
        this.sensitivity,
        this.score,
        this.precision,
        this.fMeasure,
        value,
        this.id,
        this.numTP);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Roc#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Roc withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMolecularSequence_Roc(
        this.modifierExtension,
        this.numFP,
        this.numFN,
        this.sensitivity,
        this.score,
        this.precision,
        this.fMeasure,
        this.extension,
        newValue,
        this.numTP);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Roc#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Roc withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMolecularSequence_Roc(
        this.modifierExtension,
        this.numFP,
        this.numFN,
        this.sensitivity,
        this.score,
        this.precision,
        this.fMeasure,
        this.extension,
        value,
        this.numTP);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Roc#numTP() numTP} attribute.
   * @param value The value for numTP
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Roc withNumTP(List<Integer> value) {
    @Nullable List<Integer> newValue = Objects.requireNonNull(value, "numTP");
    if (this.numTP == newValue) return this;
    return new ImmutableMolecularSequence_Roc(
        this.modifierExtension,
        this.numFP,
        this.numFN,
        this.sensitivity,
        this.score,
        this.precision,
        this.fMeasure,
        this.extension,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Roc#numTP() numTP} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for numTP
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Roc withNumTP(Optional<? extends List<Integer>> optional) {
    @Nullable List<Integer> value = optional.orElse(null);
    if (this.numTP == value) return this;
    return new ImmutableMolecularSequence_Roc(
        this.modifierExtension,
        this.numFP,
        this.numFN,
        this.sensitivity,
        this.score,
        this.precision,
        this.fMeasure,
        this.extension,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMolecularSequence_Roc} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMolecularSequence_Roc
        && equalTo((ImmutableMolecularSequence_Roc) another);
  }

  private boolean equalTo(ImmutableMolecularSequence_Roc another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(numFP, another.numFP)
        && Objects.equals(numFN, another.numFN)
        && Objects.equals(sensitivity, another.sensitivity)
        && Objects.equals(score, another.score)
        && Objects.equals(precision, another.precision)
        && Objects.equals(fMeasure, another.fMeasure)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(numTP, another.numTP);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code numFP}, {@code numFN}, {@code sensitivity}, {@code score}, {@code precision}, {@code fMeasure}, {@code extension}, {@code id}, {@code numTP}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(numFP);
    h += (h << 5) + Objects.hashCode(numFN);
    h += (h << 5) + Objects.hashCode(sensitivity);
    h += (h << 5) + Objects.hashCode(score);
    h += (h << 5) + Objects.hashCode(precision);
    h += (h << 5) + Objects.hashCode(fMeasure);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(numTP);
    return h;
  }

  /**
   * Prints the immutable value {@code MolecularSequence_Roc} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MolecularSequence_Roc{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (numFP != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("numFP=").append(numFP);
    }
    if (numFN != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("numFN=").append(numFN);
    }
    if (sensitivity != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("sensitivity=").append(sensitivity);
    }
    if (score != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("score=").append(score);
    }
    if (precision != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("precision=").append(precision);
    }
    if (fMeasure != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("fMeasure=").append(fMeasure);
    }
    if (extension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (numTP != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("numTP=").append(numTP);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MolecularSequence_Roc", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MolecularSequence_Roc {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Integer>> numFP = Optional.empty();
    boolean numFPIsSet;
    @Nullable Optional<List<Integer>> numFN = Optional.empty();
    boolean numFNIsSet;
    @Nullable Optional<List<Decimal>> sensitivity = Optional.empty();
    boolean sensitivityIsSet;
    @Nullable Optional<List<Integer>> score = Optional.empty();
    boolean scoreIsSet;
    @Nullable Optional<List<Decimal>> precision = Optional.empty();
    boolean precisionIsSet;
    @Nullable Optional<List<Decimal>> fMeasure = Optional.empty();
    boolean fMeasureIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Integer>> numTP = Optional.empty();
    boolean numTPIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("numFP")
    public void setNumFP(Optional<List<Integer>> numFP) {
      this.numFP = numFP;
      this.numFPIsSet = true;
    }
    @JsonProperty("numFN")
    public void setNumFN(Optional<List<Integer>> numFN) {
      this.numFN = numFN;
      this.numFNIsSet = true;
    }
    @JsonProperty("sensitivity")
    public void setSensitivity(Optional<List<Decimal>> sensitivity) {
      this.sensitivity = sensitivity;
      this.sensitivityIsSet = true;
    }
    @JsonProperty("score")
    public void setScore(Optional<List<Integer>> score) {
      this.score = score;
      this.scoreIsSet = true;
    }
    @JsonProperty("precision")
    public void setPrecision(Optional<List<Decimal>> precision) {
      this.precision = precision;
      this.precisionIsSet = true;
    }
    @JsonProperty("fMeasure")
    public void setFMeasure(Optional<List<Decimal>> fMeasure) {
      this.fMeasure = fMeasure;
      this.fMeasureIsSet = true;
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
    @JsonProperty("numTP")
    public void setNumTP(Optional<List<Integer>> numTP) {
      this.numTP = numTP;
      this.numTPIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Integer>> numFP() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Integer>> numFN() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Decimal>> sensitivity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Integer>> score() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Decimal>> precision() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Decimal>> fMeasure() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Integer>> numTP() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMolecularSequence_Roc fromJson(Json json) {
    ImmutableMolecularSequence_Roc.Builder builder = ImmutableMolecularSequence_Roc.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.numFPIsSet) {
      builder.numFP(json.numFP);
    }
    if (json.numFNIsSet) {
      builder.numFN(json.numFN);
    }
    if (json.sensitivityIsSet) {
      builder.sensitivity(json.sensitivity);
    }
    if (json.scoreIsSet) {
      builder.score(json.score);
    }
    if (json.precisionIsSet) {
      builder.precision(json.precision);
    }
    if (json.fMeasureIsSet) {
      builder.fMeasure(json.fMeasure);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.numTPIsSet) {
      builder.numTP(json.numTP);
    }
    return (ImmutableMolecularSequence_Roc) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MolecularSequence_Roc} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MolecularSequence_Roc instance
   */
  public static MolecularSequence_Roc copyOf(MolecularSequence_Roc instance) {
    if (instance instanceof ImmutableMolecularSequence_Roc) {
      return (ImmutableMolecularSequence_Roc) instance;
    }
    return ImmutableMolecularSequence_Roc.builder()
        .modifierExtension(instance.modifierExtension())
        .numFP(instance.numFP())
        .numFN(instance.numFN())
        .sensitivity(instance.sensitivity())
        .score(instance.score())
        .precision(instance.precision())
        .fMeasure(instance.fMeasure())
        .extension(instance.extension())
        .id(instance.id())
        .numTP(instance.numTP())
        .build();
  }

  /**
   * Creates a builder for {@link MolecularSequence_Roc MolecularSequence_Roc}.
   * <pre>
   * ImmutableMolecularSequence_Roc.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MolecularSequence_Roc#modifierExtension() modifierExtension}
   *    .numFP(List&amp;lt;Integer&amp;gt;) // optional {@link MolecularSequence_Roc#numFP() numFP}
   *    .numFN(List&amp;lt;Integer&amp;gt;) // optional {@link MolecularSequence_Roc#numFN() numFN}
   *    .sensitivity(List&amp;lt;com.fhir.types.fhir.Decimal&amp;gt;) // optional {@link MolecularSequence_Roc#sensitivity() sensitivity}
   *    .score(List&amp;lt;Integer&amp;gt;) // optional {@link MolecularSequence_Roc#score() score}
   *    .precision(List&amp;lt;com.fhir.types.fhir.Decimal&amp;gt;) // optional {@link MolecularSequence_Roc#precision() precision}
   *    .fMeasure(List&amp;lt;com.fhir.types.fhir.Decimal&amp;gt;) // optional {@link MolecularSequence_Roc#fMeasure() fMeasure}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MolecularSequence_Roc#extension() extension}
   *    .id(String) // optional {@link MolecularSequence_Roc#id() id}
   *    .numTP(List&amp;lt;Integer&amp;gt;) // optional {@link MolecularSequence_Roc#numTP() numTP}
   *    .build();
   * </pre>
   * @return A new MolecularSequence_Roc builder
   */
  public static ImmutableMolecularSequence_Roc.Builder builder() {
    return new ImmutableMolecularSequence_Roc.Builder();
  }

  /**
   * Builds instances of type {@link MolecularSequence_Roc MolecularSequence_Roc}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MolecularSequence_Roc", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_NUM_F_P = 0x2L;
    private static final long OPT_BIT_NUM_F_N = 0x4L;
    private static final long OPT_BIT_SENSITIVITY = 0x8L;
    private static final long OPT_BIT_SCORE = 0x10L;
    private static final long OPT_BIT_PRECISION = 0x20L;
    private static final long OPT_BIT_F_MEASURE = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private static final long OPT_BIT_ID = 0x100L;
    private static final long OPT_BIT_NUM_T_P = 0x200L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Integer> numFP;
    private @Nullable List<Integer> numFN;
    private @Nullable List<Decimal> sensitivity;
    private @Nullable List<Integer> score;
    private @Nullable List<Decimal> precision;
    private @Nullable List<Decimal> fMeasure;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable List<Integer> numTP;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Roc#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MolecularSequence_Roc#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MolecularSequence_Roc#numFP() numFP} to numFP.
     * @param numFP The value for numFP
     * @return {@code this} builder for chained invocation
     */
    public final Builder numFP(List<Integer> numFP) {
      checkNotIsSet(numFPIsSet(), "numFP");
      this.numFP = Objects.requireNonNull(numFP, "numFP");
      optBits |= OPT_BIT_NUM_F_P;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Roc#numFP() numFP} to numFP.
     * @param numFP The value for numFP
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("numFP")
    public final Builder numFP(Optional<? extends List<Integer>> numFP) {
      checkNotIsSet(numFPIsSet(), "numFP");
      this.numFP = numFP.orElse(null);
      optBits |= OPT_BIT_NUM_F_P;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Roc#numFN() numFN} to numFN.
     * @param numFN The value for numFN
     * @return {@code this} builder for chained invocation
     */
    public final Builder numFN(List<Integer> numFN) {
      checkNotIsSet(numFNIsSet(), "numFN");
      this.numFN = Objects.requireNonNull(numFN, "numFN");
      optBits |= OPT_BIT_NUM_F_N;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Roc#numFN() numFN} to numFN.
     * @param numFN The value for numFN
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("numFN")
    public final Builder numFN(Optional<? extends List<Integer>> numFN) {
      checkNotIsSet(numFNIsSet(), "numFN");
      this.numFN = numFN.orElse(null);
      optBits |= OPT_BIT_NUM_F_N;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Roc#sensitivity() sensitivity} to sensitivity.
     * @param sensitivity The value for sensitivity
     * @return {@code this} builder for chained invocation
     */
    public final Builder sensitivity(List<Decimal> sensitivity) {
      checkNotIsSet(sensitivityIsSet(), "sensitivity");
      this.sensitivity = Objects.requireNonNull(sensitivity, "sensitivity");
      optBits |= OPT_BIT_SENSITIVITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Roc#sensitivity() sensitivity} to sensitivity.
     * @param sensitivity The value for sensitivity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sensitivity")
    public final Builder sensitivity(Optional<? extends List<Decimal>> sensitivity) {
      checkNotIsSet(sensitivityIsSet(), "sensitivity");
      this.sensitivity = sensitivity.orElse(null);
      optBits |= OPT_BIT_SENSITIVITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Roc#score() score} to score.
     * @param score The value for score
     * @return {@code this} builder for chained invocation
     */
    public final Builder score(List<Integer> score) {
      checkNotIsSet(scoreIsSet(), "score");
      this.score = Objects.requireNonNull(score, "score");
      optBits |= OPT_BIT_SCORE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Roc#score() score} to score.
     * @param score The value for score
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("score")
    public final Builder score(Optional<? extends List<Integer>> score) {
      checkNotIsSet(scoreIsSet(), "score");
      this.score = score.orElse(null);
      optBits |= OPT_BIT_SCORE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Roc#precision() precision} to precision.
     * @param precision The value for precision
     * @return {@code this} builder for chained invocation
     */
    public final Builder precision(List<Decimal> precision) {
      checkNotIsSet(precisionIsSet(), "precision");
      this.precision = Objects.requireNonNull(precision, "precision");
      optBits |= OPT_BIT_PRECISION;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Roc#precision() precision} to precision.
     * @param precision The value for precision
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("precision")
    public final Builder precision(Optional<? extends List<Decimal>> precision) {
      checkNotIsSet(precisionIsSet(), "precision");
      this.precision = precision.orElse(null);
      optBits |= OPT_BIT_PRECISION;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Roc#fMeasure() fMeasure} to fMeasure.
     * @param fMeasure The value for fMeasure
     * @return {@code this} builder for chained invocation
     */
    public final Builder fMeasure(List<Decimal> fMeasure) {
      checkNotIsSet(fMeasureIsSet(), "fMeasure");
      this.fMeasure = Objects.requireNonNull(fMeasure, "fMeasure");
      optBits |= OPT_BIT_F_MEASURE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Roc#fMeasure() fMeasure} to fMeasure.
     * @param fMeasure The value for fMeasure
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("fMeasure")
    public final Builder fMeasure(Optional<? extends List<Decimal>> fMeasure) {
      checkNotIsSet(fMeasureIsSet(), "fMeasure");
      this.fMeasure = fMeasure.orElse(null);
      optBits |= OPT_BIT_F_MEASURE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Roc#extension() extension} to extension.
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
     * Initializes the optional value {@link MolecularSequence_Roc#extension() extension} to extension.
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
     * Initializes the optional value {@link MolecularSequence_Roc#id() id} to id.
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
     * Initializes the optional value {@link MolecularSequence_Roc#id() id} to id.
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
     * Initializes the optional value {@link MolecularSequence_Roc#numTP() numTP} to numTP.
     * @param numTP The value for numTP
     * @return {@code this} builder for chained invocation
     */
    public final Builder numTP(List<Integer> numTP) {
      checkNotIsSet(numTPIsSet(), "numTP");
      this.numTP = Objects.requireNonNull(numTP, "numTP");
      optBits |= OPT_BIT_NUM_T_P;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Roc#numTP() numTP} to numTP.
     * @param numTP The value for numTP
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("numTP")
    public final Builder numTP(Optional<? extends List<Integer>> numTP) {
      checkNotIsSet(numTPIsSet(), "numTP");
      this.numTP = numTP.orElse(null);
      optBits |= OPT_BIT_NUM_T_P;
      return this;
    }

    /**
     * Builds a new {@link MolecularSequence_Roc MolecularSequence_Roc}.
     * @return An immutable instance of MolecularSequence_Roc
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MolecularSequence_Roc build() {
      return new ImmutableMolecularSequence_Roc(
          modifierExtension,
          numFP,
          numFN,
          sensitivity,
          score,
          precision,
          fMeasure,
          extension,
          id,
          numTP);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean numFPIsSet() {
      return (optBits & OPT_BIT_NUM_F_P) != 0;
    }

    private boolean numFNIsSet() {
      return (optBits & OPT_BIT_NUM_F_N) != 0;
    }

    private boolean sensitivityIsSet() {
      return (optBits & OPT_BIT_SENSITIVITY) != 0;
    }

    private boolean scoreIsSet() {
      return (optBits & OPT_BIT_SCORE) != 0;
    }

    private boolean precisionIsSet() {
      return (optBits & OPT_BIT_PRECISION) != 0;
    }

    private boolean fMeasureIsSet() {
      return (optBits & OPT_BIT_F_MEASURE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean numTPIsSet() {
      return (optBits & OPT_BIT_NUM_T_P) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MolecularSequence_Roc is strict, attribute is already set: ".concat(name));
    }
  }
}

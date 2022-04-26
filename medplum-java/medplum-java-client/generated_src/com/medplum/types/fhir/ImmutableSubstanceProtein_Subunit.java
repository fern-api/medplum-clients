package com.medplum.types.fhir;

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
 * Immutable implementation of {@link SubstanceProtein_Subunit}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceProtein_Subunit.builder()}.
 */
@Generated(from = "SubstanceProtein_Subunit", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceProtein_Subunit
    implements SubstanceProtein_Subunit {
  private final @Nullable String nTerminalModification;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Identifier nTerminalModificationId;
  private final @Nullable Integer subunit;
  private final @Nullable String sequence;
  private final @Nullable String id;
  private final @Nullable Attachment sequenceAttachment;
  private final @Nullable Integer length;
  private final @Nullable String cTerminalModification;
  private final @Nullable List<Extension> extension;
  private final @Nullable Identifier cTerminalModificationId;

  private ImmutableSubstanceProtein_Subunit(
      @Nullable String nTerminalModification,
      @Nullable List<Extension> modifierExtension,
      @Nullable Identifier nTerminalModificationId,
      @Nullable Integer subunit,
      @Nullable String sequence,
      @Nullable String id,
      @Nullable Attachment sequenceAttachment,
      @Nullable Integer length,
      @Nullable String cTerminalModification,
      @Nullable List<Extension> extension,
      @Nullable Identifier cTerminalModificationId) {
    this.nTerminalModification = nTerminalModification;
    this.modifierExtension = modifierExtension;
    this.nTerminalModificationId = nTerminalModificationId;
    this.subunit = subunit;
    this.sequence = sequence;
    this.id = id;
    this.sequenceAttachment = sequenceAttachment;
    this.length = length;
    this.cTerminalModification = cTerminalModification;
    this.extension = extension;
    this.cTerminalModificationId = cTerminalModificationId;
  }

  /**
   * @return The value of the {@code nTerminalModification} attribute
   */
  @JsonProperty("nTerminalModification")
  @Override
  public Optional<String> nTerminalModification() {
    return Optional.ofNullable(nTerminalModification);
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
   * @return The value of the {@code nTerminalModificationId} attribute
   */
  @JsonProperty("nTerminalModificationId")
  @Override
  public Optional<Identifier> nTerminalModificationId() {
    return Optional.ofNullable(nTerminalModificationId);
  }

  /**
   * @return The value of the {@code subunit} attribute
   */
  @JsonProperty("subunit")
  @Override
  public Optional<Integer> subunit() {
    return Optional.ofNullable(subunit);
  }

  /**
   * @return The value of the {@code sequence} attribute
   */
  @JsonProperty("sequence")
  @Override
  public Optional<String> sequence() {
    return Optional.ofNullable(sequence);
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
   * @return The value of the {@code sequenceAttachment} attribute
   */
  @JsonProperty("sequenceAttachment")
  @Override
  public Optional<Attachment> sequenceAttachment() {
    return Optional.ofNullable(sequenceAttachment);
  }

  /**
   * @return The value of the {@code length} attribute
   */
  @JsonProperty("length")
  @Override
  public Optional<Integer> length() {
    return Optional.ofNullable(length);
  }

  /**
   * @return The value of the {@code cTerminalModification} attribute
   */
  @JsonProperty("cTerminalModification")
  @Override
  public Optional<String> cTerminalModification() {
    return Optional.ofNullable(cTerminalModification);
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
   * @return The value of the {@code cTerminalModificationId} attribute
   */
  @JsonProperty("cTerminalModificationId")
  @Override
  public Optional<Identifier> cTerminalModificationId() {
    return Optional.ofNullable(cTerminalModificationId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceProtein_Subunit#nTerminalModification() nTerminalModification} attribute.
   * @param value The value for nTerminalModification
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein_Subunit withNTerminalModification(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "nTerminalModification");
    if (Objects.equals(this.nTerminalModification, newValue)) return this;
    return new ImmutableSubstanceProtein_Subunit(
        newValue,
        this.modifierExtension,
        this.nTerminalModificationId,
        this.subunit,
        this.sequence,
        this.id,
        this.sequenceAttachment,
        this.length,
        this.cTerminalModification,
        this.extension,
        this.cTerminalModificationId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceProtein_Subunit#nTerminalModification() nTerminalModification} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for nTerminalModification
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein_Subunit withNTerminalModification(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.nTerminalModification, value)) return this;
    return new ImmutableSubstanceProtein_Subunit(
        value,
        this.modifierExtension,
        this.nTerminalModificationId,
        this.subunit,
        this.sequence,
        this.id,
        this.sequenceAttachment,
        this.length,
        this.cTerminalModification,
        this.extension,
        this.cTerminalModificationId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceProtein_Subunit#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein_Subunit withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceProtein_Subunit(
        this.nTerminalModification,
        newValue,
        this.nTerminalModificationId,
        this.subunit,
        this.sequence,
        this.id,
        this.sequenceAttachment,
        this.length,
        this.cTerminalModification,
        this.extension,
        this.cTerminalModificationId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceProtein_Subunit#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceProtein_Subunit withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceProtein_Subunit(
        this.nTerminalModification,
        value,
        this.nTerminalModificationId,
        this.subunit,
        this.sequence,
        this.id,
        this.sequenceAttachment,
        this.length,
        this.cTerminalModification,
        this.extension,
        this.cTerminalModificationId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceProtein_Subunit#nTerminalModificationId() nTerminalModificationId} attribute.
   * @param value The value for nTerminalModificationId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein_Subunit withNTerminalModificationId(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "nTerminalModificationId");
    if (this.nTerminalModificationId == newValue) return this;
    return new ImmutableSubstanceProtein_Subunit(
        this.nTerminalModification,
        this.modifierExtension,
        newValue,
        this.subunit,
        this.sequence,
        this.id,
        this.sequenceAttachment,
        this.length,
        this.cTerminalModification,
        this.extension,
        this.cTerminalModificationId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceProtein_Subunit#nTerminalModificationId() nTerminalModificationId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for nTerminalModificationId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceProtein_Subunit withNTerminalModificationId(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.nTerminalModificationId == value) return this;
    return new ImmutableSubstanceProtein_Subunit(
        this.nTerminalModification,
        this.modifierExtension,
        value,
        this.subunit,
        this.sequence,
        this.id,
        this.sequenceAttachment,
        this.length,
        this.cTerminalModification,
        this.extension,
        this.cTerminalModificationId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceProtein_Subunit#subunit() subunit} attribute.
   * @param value The value for subunit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein_Subunit withSubunit(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.subunit, newValue)) return this;
    return new ImmutableSubstanceProtein_Subunit(
        this.nTerminalModification,
        this.modifierExtension,
        this.nTerminalModificationId,
        newValue,
        this.sequence,
        this.id,
        this.sequenceAttachment,
        this.length,
        this.cTerminalModification,
        this.extension,
        this.cTerminalModificationId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceProtein_Subunit#subunit() subunit} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subunit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein_Subunit withSubunit(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.subunit, value)) return this;
    return new ImmutableSubstanceProtein_Subunit(
        this.nTerminalModification,
        this.modifierExtension,
        this.nTerminalModificationId,
        value,
        this.sequence,
        this.id,
        this.sequenceAttachment,
        this.length,
        this.cTerminalModification,
        this.extension,
        this.cTerminalModificationId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceProtein_Subunit#sequence() sequence} attribute.
   * @param value The value for sequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein_Subunit withSequence(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "sequence");
    if (Objects.equals(this.sequence, newValue)) return this;
    return new ImmutableSubstanceProtein_Subunit(
        this.nTerminalModification,
        this.modifierExtension,
        this.nTerminalModificationId,
        this.subunit,
        newValue,
        this.id,
        this.sequenceAttachment,
        this.length,
        this.cTerminalModification,
        this.extension,
        this.cTerminalModificationId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceProtein_Subunit#sequence() sequence} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein_Subunit withSequence(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.sequence, value)) return this;
    return new ImmutableSubstanceProtein_Subunit(
        this.nTerminalModification,
        this.modifierExtension,
        this.nTerminalModificationId,
        this.subunit,
        value,
        this.id,
        this.sequenceAttachment,
        this.length,
        this.cTerminalModification,
        this.extension,
        this.cTerminalModificationId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceProtein_Subunit#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein_Subunit withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstanceProtein_Subunit(
        this.nTerminalModification,
        this.modifierExtension,
        this.nTerminalModificationId,
        this.subunit,
        this.sequence,
        newValue,
        this.sequenceAttachment,
        this.length,
        this.cTerminalModification,
        this.extension,
        this.cTerminalModificationId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceProtein_Subunit#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein_Subunit withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstanceProtein_Subunit(
        this.nTerminalModification,
        this.modifierExtension,
        this.nTerminalModificationId,
        this.subunit,
        this.sequence,
        value,
        this.sequenceAttachment,
        this.length,
        this.cTerminalModification,
        this.extension,
        this.cTerminalModificationId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceProtein_Subunit#sequenceAttachment() sequenceAttachment} attribute.
   * @param value The value for sequenceAttachment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein_Subunit withSequenceAttachment(Attachment value) {
    @Nullable Attachment newValue = Objects.requireNonNull(value, "sequenceAttachment");
    if (this.sequenceAttachment == newValue) return this;
    return new ImmutableSubstanceProtein_Subunit(
        this.nTerminalModification,
        this.modifierExtension,
        this.nTerminalModificationId,
        this.subunit,
        this.sequence,
        this.id,
        newValue,
        this.length,
        this.cTerminalModification,
        this.extension,
        this.cTerminalModificationId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceProtein_Subunit#sequenceAttachment() sequenceAttachment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequenceAttachment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceProtein_Subunit withSequenceAttachment(Optional<? extends Attachment> optional) {
    @Nullable Attachment value = optional.orElse(null);
    if (this.sequenceAttachment == value) return this;
    return new ImmutableSubstanceProtein_Subunit(
        this.nTerminalModification,
        this.modifierExtension,
        this.nTerminalModificationId,
        this.subunit,
        this.sequence,
        this.id,
        value,
        this.length,
        this.cTerminalModification,
        this.extension,
        this.cTerminalModificationId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceProtein_Subunit#length() length} attribute.
   * @param value The value for length
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein_Subunit withLength(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.length, newValue)) return this;
    return new ImmutableSubstanceProtein_Subunit(
        this.nTerminalModification,
        this.modifierExtension,
        this.nTerminalModificationId,
        this.subunit,
        this.sequence,
        this.id,
        this.sequenceAttachment,
        newValue,
        this.cTerminalModification,
        this.extension,
        this.cTerminalModificationId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceProtein_Subunit#length() length} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for length
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein_Subunit withLength(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.length, value)) return this;
    return new ImmutableSubstanceProtein_Subunit(
        this.nTerminalModification,
        this.modifierExtension,
        this.nTerminalModificationId,
        this.subunit,
        this.sequence,
        this.id,
        this.sequenceAttachment,
        value,
        this.cTerminalModification,
        this.extension,
        this.cTerminalModificationId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceProtein_Subunit#cTerminalModification() cTerminalModification} attribute.
   * @param value The value for cTerminalModification
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein_Subunit withCTerminalModification(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "cTerminalModification");
    if (Objects.equals(this.cTerminalModification, newValue)) return this;
    return new ImmutableSubstanceProtein_Subunit(
        this.nTerminalModification,
        this.modifierExtension,
        this.nTerminalModificationId,
        this.subunit,
        this.sequence,
        this.id,
        this.sequenceAttachment,
        this.length,
        newValue,
        this.extension,
        this.cTerminalModificationId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceProtein_Subunit#cTerminalModification() cTerminalModification} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for cTerminalModification
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein_Subunit withCTerminalModification(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.cTerminalModification, value)) return this;
    return new ImmutableSubstanceProtein_Subunit(
        this.nTerminalModification,
        this.modifierExtension,
        this.nTerminalModificationId,
        this.subunit,
        this.sequence,
        this.id,
        this.sequenceAttachment,
        this.length,
        value,
        this.extension,
        this.cTerminalModificationId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceProtein_Subunit#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein_Subunit withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceProtein_Subunit(
        this.nTerminalModification,
        this.modifierExtension,
        this.nTerminalModificationId,
        this.subunit,
        this.sequence,
        this.id,
        this.sequenceAttachment,
        this.length,
        this.cTerminalModification,
        newValue,
        this.cTerminalModificationId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceProtein_Subunit#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceProtein_Subunit withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceProtein_Subunit(
        this.nTerminalModification,
        this.modifierExtension,
        this.nTerminalModificationId,
        this.subunit,
        this.sequence,
        this.id,
        this.sequenceAttachment,
        this.length,
        this.cTerminalModification,
        value,
        this.cTerminalModificationId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceProtein_Subunit#cTerminalModificationId() cTerminalModificationId} attribute.
   * @param value The value for cTerminalModificationId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceProtein_Subunit withCTerminalModificationId(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "cTerminalModificationId");
    if (this.cTerminalModificationId == newValue) return this;
    return new ImmutableSubstanceProtein_Subunit(
        this.nTerminalModification,
        this.modifierExtension,
        this.nTerminalModificationId,
        this.subunit,
        this.sequence,
        this.id,
        this.sequenceAttachment,
        this.length,
        this.cTerminalModification,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceProtein_Subunit#cTerminalModificationId() cTerminalModificationId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for cTerminalModificationId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceProtein_Subunit withCTerminalModificationId(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.cTerminalModificationId == value) return this;
    return new ImmutableSubstanceProtein_Subunit(
        this.nTerminalModification,
        this.modifierExtension,
        this.nTerminalModificationId,
        this.subunit,
        this.sequence,
        this.id,
        this.sequenceAttachment,
        this.length,
        this.cTerminalModification,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceProtein_Subunit} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceProtein_Subunit
        && equalTo((ImmutableSubstanceProtein_Subunit) another);
  }

  private boolean equalTo(ImmutableSubstanceProtein_Subunit another) {
    return Objects.equals(nTerminalModification, another.nTerminalModification)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(nTerminalModificationId, another.nTerminalModificationId)
        && Objects.equals(subunit, another.subunit)
        && Objects.equals(sequence, another.sequence)
        && Objects.equals(id, another.id)
        && Objects.equals(sequenceAttachment, another.sequenceAttachment)
        && Objects.equals(length, another.length)
        && Objects.equals(cTerminalModification, another.cTerminalModification)
        && Objects.equals(extension, another.extension)
        && Objects.equals(cTerminalModificationId, another.cTerminalModificationId);
  }

  /**
   * Computes a hash code from attributes: {@code nTerminalModification}, {@code modifierExtension}, {@code nTerminalModificationId}, {@code subunit}, {@code sequence}, {@code id}, {@code sequenceAttachment}, {@code length}, {@code cTerminalModification}, {@code extension}, {@code cTerminalModificationId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(nTerminalModification);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(nTerminalModificationId);
    h += (h << 5) + Objects.hashCode(subunit);
    h += (h << 5) + Objects.hashCode(sequence);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(sequenceAttachment);
    h += (h << 5) + Objects.hashCode(length);
    h += (h << 5) + Objects.hashCode(cTerminalModification);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(cTerminalModificationId);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceProtein_Subunit} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceProtein_Subunit{");
    if (nTerminalModification != null) {
      builder.append("nTerminalModification=").append(nTerminalModification);
    }
    if (modifierExtension != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (nTerminalModificationId != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("nTerminalModificationId=").append(nTerminalModificationId);
    }
    if (subunit != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("subunit=").append(subunit);
    }
    if (sequence != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("sequence=").append(sequence);
    }
    if (id != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (sequenceAttachment != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("sequenceAttachment=").append(sequenceAttachment);
    }
    if (length != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("length=").append(length);
    }
    if (cTerminalModification != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("cTerminalModification=").append(cTerminalModification);
    }
    if (extension != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (cTerminalModificationId != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("cTerminalModificationId=").append(cTerminalModificationId);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstanceProtein_Subunit", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceProtein_Subunit {
    @Nullable Optional<String> nTerminalModification = Optional.empty();
    boolean nTerminalModificationIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Identifier> nTerminalModificationId = Optional.empty();
    boolean nTerminalModificationIdIsSet;
    @Nullable Optional<Integer> subunit = Optional.empty();
    boolean subunitIsSet;
    @Nullable Optional<String> sequence = Optional.empty();
    boolean sequenceIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Attachment> sequenceAttachment = Optional.empty();
    boolean sequenceAttachmentIsSet;
    @Nullable Optional<Integer> length = Optional.empty();
    boolean lengthIsSet;
    @Nullable Optional<String> cTerminalModification = Optional.empty();
    boolean cTerminalModificationIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Identifier> cTerminalModificationId = Optional.empty();
    boolean cTerminalModificationIdIsSet;
    @JsonProperty("nTerminalModification")
    public void setNTerminalModification(Optional<String> nTerminalModification) {
      this.nTerminalModification = nTerminalModification;
      this.nTerminalModificationIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("nTerminalModificationId")
    public void setNTerminalModificationId(Optional<Identifier> nTerminalModificationId) {
      this.nTerminalModificationId = nTerminalModificationId;
      this.nTerminalModificationIdIsSet = true;
    }
    @JsonProperty("subunit")
    public void setSubunit(Optional<Integer> subunit) {
      this.subunit = subunit;
      this.subunitIsSet = true;
    }
    @JsonProperty("sequence")
    public void setSequence(Optional<String> sequence) {
      this.sequence = sequence;
      this.sequenceIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("sequenceAttachment")
    public void setSequenceAttachment(Optional<Attachment> sequenceAttachment) {
      this.sequenceAttachment = sequenceAttachment;
      this.sequenceAttachmentIsSet = true;
    }
    @JsonProperty("length")
    public void setLength(Optional<Integer> length) {
      this.length = length;
      this.lengthIsSet = true;
    }
    @JsonProperty("cTerminalModification")
    public void setCTerminalModification(Optional<String> cTerminalModification) {
      this.cTerminalModification = cTerminalModification;
      this.cTerminalModificationIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("cTerminalModificationId")
    public void setCTerminalModificationId(Optional<Identifier> cTerminalModificationId) {
      this.cTerminalModificationId = cTerminalModificationId;
      this.cTerminalModificationIdIsSet = true;
    }
    @Override
    public Optional<String> nTerminalModification() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> nTerminalModificationId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> subunit() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> sequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Attachment> sequenceAttachment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> length() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> cTerminalModification() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> cTerminalModificationId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubstanceProtein_Subunit fromJson(Json json) {
    ImmutableSubstanceProtein_Subunit.Builder builder = ImmutableSubstanceProtein_Subunit.builder();
    if (json.nTerminalModificationIsSet) {
      builder.nTerminalModification(json.nTerminalModification);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.nTerminalModificationIdIsSet) {
      builder.nTerminalModificationId(json.nTerminalModificationId);
    }
    if (json.subunitIsSet) {
      builder.subunit(json.subunit);
    }
    if (json.sequenceIsSet) {
      builder.sequence(json.sequence);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.sequenceAttachmentIsSet) {
      builder.sequenceAttachment(json.sequenceAttachment);
    }
    if (json.lengthIsSet) {
      builder.length(json.length);
    }
    if (json.cTerminalModificationIsSet) {
      builder.cTerminalModification(json.cTerminalModification);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.cTerminalModificationIdIsSet) {
      builder.cTerminalModificationId(json.cTerminalModificationId);
    }
    return (ImmutableSubstanceProtein_Subunit) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceProtein_Subunit} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceProtein_Subunit instance
   */
  public static SubstanceProtein_Subunit copyOf(SubstanceProtein_Subunit instance) {
    if (instance instanceof ImmutableSubstanceProtein_Subunit) {
      return (ImmutableSubstanceProtein_Subunit) instance;
    }
    return ImmutableSubstanceProtein_Subunit.builder()
        .nTerminalModification(instance.nTerminalModification())
        .modifierExtension(instance.modifierExtension())
        .nTerminalModificationId(instance.nTerminalModificationId())
        .subunit(instance.subunit())
        .sequence(instance.sequence())
        .id(instance.id())
        .sequenceAttachment(instance.sequenceAttachment())
        .length(instance.length())
        .cTerminalModification(instance.cTerminalModification())
        .extension(instance.extension())
        .cTerminalModificationId(instance.cTerminalModificationId())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceProtein_Subunit SubstanceProtein_Subunit}.
   * <pre>
   * ImmutableSubstanceProtein_Subunit.builder()
   *    .nTerminalModification(String) // optional {@link SubstanceProtein_Subunit#nTerminalModification() nTerminalModification}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SubstanceProtein_Subunit#modifierExtension() modifierExtension}
   *    .nTerminalModificationId(com.medplum.types.fhir.Identifier) // optional {@link SubstanceProtein_Subunit#nTerminalModificationId() nTerminalModificationId}
   *    .subunit(Integer) // optional {@link SubstanceProtein_Subunit#subunit() subunit}
   *    .sequence(String) // optional {@link SubstanceProtein_Subunit#sequence() sequence}
   *    .id(String) // optional {@link SubstanceProtein_Subunit#id() id}
   *    .sequenceAttachment(com.medplum.types.fhir.Attachment) // optional {@link SubstanceProtein_Subunit#sequenceAttachment() sequenceAttachment}
   *    .length(Integer) // optional {@link SubstanceProtein_Subunit#length() length}
   *    .cTerminalModification(String) // optional {@link SubstanceProtein_Subunit#cTerminalModification() cTerminalModification}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SubstanceProtein_Subunit#extension() extension}
   *    .cTerminalModificationId(com.medplum.types.fhir.Identifier) // optional {@link SubstanceProtein_Subunit#cTerminalModificationId() cTerminalModificationId}
   *    .build();
   * </pre>
   * @return A new SubstanceProtein_Subunit builder
   */
  public static ImmutableSubstanceProtein_Subunit.Builder builder() {
    return new ImmutableSubstanceProtein_Subunit.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceProtein_Subunit SubstanceProtein_Subunit}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstanceProtein_Subunit", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_N_TERMINAL_MODIFICATION = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_N_TERMINAL_MODIFICATION_ID = 0x4L;
    private static final long OPT_BIT_SUBUNIT = 0x8L;
    private static final long OPT_BIT_SEQUENCE = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_SEQUENCE_ATTACHMENT = 0x40L;
    private static final long OPT_BIT_LENGTH = 0x80L;
    private static final long OPT_BIT_C_TERMINAL_MODIFICATION = 0x100L;
    private static final long OPT_BIT_EXTENSION = 0x200L;
    private static final long OPT_BIT_C_TERMINAL_MODIFICATION_ID = 0x400L;
    private long optBits;

    private @Nullable String nTerminalModification;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Identifier nTerminalModificationId;
    private @Nullable Integer subunit;
    private @Nullable String sequence;
    private @Nullable String id;
    private @Nullable Attachment sequenceAttachment;
    private @Nullable Integer length;
    private @Nullable String cTerminalModification;
    private @Nullable List<Extension> extension;
    private @Nullable Identifier cTerminalModificationId;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceProtein_Subunit#nTerminalModification() nTerminalModification} to nTerminalModification.
     * @param nTerminalModification The value for nTerminalModification
     * @return {@code this} builder for chained invocation
     */
    public final Builder nTerminalModification(String nTerminalModification) {
      checkNotIsSet(nTerminalModificationIsSet(), "nTerminalModification");
      this.nTerminalModification = Objects.requireNonNull(nTerminalModification, "nTerminalModification");
      optBits |= OPT_BIT_N_TERMINAL_MODIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceProtein_Subunit#nTerminalModification() nTerminalModification} to nTerminalModification.
     * @param nTerminalModification The value for nTerminalModification
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("nTerminalModification")
    public final Builder nTerminalModification(Optional<String> nTerminalModification) {
      checkNotIsSet(nTerminalModificationIsSet(), "nTerminalModification");
      this.nTerminalModification = nTerminalModification.orElse(null);
      optBits |= OPT_BIT_N_TERMINAL_MODIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceProtein_Subunit#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceProtein_Subunit#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceProtein_Subunit#nTerminalModificationId() nTerminalModificationId} to nTerminalModificationId.
     * @param nTerminalModificationId The value for nTerminalModificationId
     * @return {@code this} builder for chained invocation
     */
    public final Builder nTerminalModificationId(Identifier nTerminalModificationId) {
      checkNotIsSet(nTerminalModificationIdIsSet(), "nTerminalModificationId");
      this.nTerminalModificationId = Objects.requireNonNull(nTerminalModificationId, "nTerminalModificationId");
      optBits |= OPT_BIT_N_TERMINAL_MODIFICATION_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceProtein_Subunit#nTerminalModificationId() nTerminalModificationId} to nTerminalModificationId.
     * @param nTerminalModificationId The value for nTerminalModificationId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("nTerminalModificationId")
    public final Builder nTerminalModificationId(Optional<? extends Identifier> nTerminalModificationId) {
      checkNotIsSet(nTerminalModificationIdIsSet(), "nTerminalModificationId");
      this.nTerminalModificationId = nTerminalModificationId.orElse(null);
      optBits |= OPT_BIT_N_TERMINAL_MODIFICATION_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceProtein_Subunit#subunit() subunit} to subunit.
     * @param subunit The value for subunit
     * @return {@code this} builder for chained invocation
     */
    public final Builder subunit(int subunit) {
      checkNotIsSet(subunitIsSet(), "subunit");
      this.subunit = subunit;
      optBits |= OPT_BIT_SUBUNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceProtein_Subunit#subunit() subunit} to subunit.
     * @param subunit The value for subunit
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subunit")
    public final Builder subunit(Optional<Integer> subunit) {
      checkNotIsSet(subunitIsSet(), "subunit");
      this.subunit = subunit.orElse(null);
      optBits |= OPT_BIT_SUBUNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceProtein_Subunit#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder sequence(String sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = Objects.requireNonNull(sequence, "sequence");
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceProtein_Subunit#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sequence")
    public final Builder sequence(Optional<String> sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = sequence.orElse(null);
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceProtein_Subunit#id() id} to id.
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
     * Initializes the optional value {@link SubstanceProtein_Subunit#id() id} to id.
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
     * Initializes the optional value {@link SubstanceProtein_Subunit#sequenceAttachment() sequenceAttachment} to sequenceAttachment.
     * @param sequenceAttachment The value for sequenceAttachment
     * @return {@code this} builder for chained invocation
     */
    public final Builder sequenceAttachment(Attachment sequenceAttachment) {
      checkNotIsSet(sequenceAttachmentIsSet(), "sequenceAttachment");
      this.sequenceAttachment = Objects.requireNonNull(sequenceAttachment, "sequenceAttachment");
      optBits |= OPT_BIT_SEQUENCE_ATTACHMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceProtein_Subunit#sequenceAttachment() sequenceAttachment} to sequenceAttachment.
     * @param sequenceAttachment The value for sequenceAttachment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sequenceAttachment")
    public final Builder sequenceAttachment(Optional<? extends Attachment> sequenceAttachment) {
      checkNotIsSet(sequenceAttachmentIsSet(), "sequenceAttachment");
      this.sequenceAttachment = sequenceAttachment.orElse(null);
      optBits |= OPT_BIT_SEQUENCE_ATTACHMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceProtein_Subunit#length() length} to length.
     * @param length The value for length
     * @return {@code this} builder for chained invocation
     */
    public final Builder length(int length) {
      checkNotIsSet(lengthIsSet(), "length");
      this.length = length;
      optBits |= OPT_BIT_LENGTH;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceProtein_Subunit#length() length} to length.
     * @param length The value for length
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("length")
    public final Builder length(Optional<Integer> length) {
      checkNotIsSet(lengthIsSet(), "length");
      this.length = length.orElse(null);
      optBits |= OPT_BIT_LENGTH;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceProtein_Subunit#cTerminalModification() cTerminalModification} to cTerminalModification.
     * @param cTerminalModification The value for cTerminalModification
     * @return {@code this} builder for chained invocation
     */
    public final Builder cTerminalModification(String cTerminalModification) {
      checkNotIsSet(cTerminalModificationIsSet(), "cTerminalModification");
      this.cTerminalModification = Objects.requireNonNull(cTerminalModification, "cTerminalModification");
      optBits |= OPT_BIT_C_TERMINAL_MODIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceProtein_Subunit#cTerminalModification() cTerminalModification} to cTerminalModification.
     * @param cTerminalModification The value for cTerminalModification
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("cTerminalModification")
    public final Builder cTerminalModification(Optional<String> cTerminalModification) {
      checkNotIsSet(cTerminalModificationIsSet(), "cTerminalModification");
      this.cTerminalModification = cTerminalModification.orElse(null);
      optBits |= OPT_BIT_C_TERMINAL_MODIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceProtein_Subunit#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceProtein_Subunit#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceProtein_Subunit#cTerminalModificationId() cTerminalModificationId} to cTerminalModificationId.
     * @param cTerminalModificationId The value for cTerminalModificationId
     * @return {@code this} builder for chained invocation
     */
    public final Builder cTerminalModificationId(Identifier cTerminalModificationId) {
      checkNotIsSet(cTerminalModificationIdIsSet(), "cTerminalModificationId");
      this.cTerminalModificationId = Objects.requireNonNull(cTerminalModificationId, "cTerminalModificationId");
      optBits |= OPT_BIT_C_TERMINAL_MODIFICATION_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceProtein_Subunit#cTerminalModificationId() cTerminalModificationId} to cTerminalModificationId.
     * @param cTerminalModificationId The value for cTerminalModificationId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("cTerminalModificationId")
    public final Builder cTerminalModificationId(Optional<? extends Identifier> cTerminalModificationId) {
      checkNotIsSet(cTerminalModificationIdIsSet(), "cTerminalModificationId");
      this.cTerminalModificationId = cTerminalModificationId.orElse(null);
      optBits |= OPT_BIT_C_TERMINAL_MODIFICATION_ID;
      return this;
    }

    /**
     * Builds a new {@link SubstanceProtein_Subunit SubstanceProtein_Subunit}.
     * @return An immutable instance of SubstanceProtein_Subunit
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceProtein_Subunit build() {
      return new ImmutableSubstanceProtein_Subunit(
          nTerminalModification,
          modifierExtension,
          nTerminalModificationId,
          subunit,
          sequence,
          id,
          sequenceAttachment,
          length,
          cTerminalModification,
          extension,
          cTerminalModificationId);
    }

    private boolean nTerminalModificationIsSet() {
      return (optBits & OPT_BIT_N_TERMINAL_MODIFICATION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean nTerminalModificationIdIsSet() {
      return (optBits & OPT_BIT_N_TERMINAL_MODIFICATION_ID) != 0;
    }

    private boolean subunitIsSet() {
      return (optBits & OPT_BIT_SUBUNIT) != 0;
    }

    private boolean sequenceIsSet() {
      return (optBits & OPT_BIT_SEQUENCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean sequenceAttachmentIsSet() {
      return (optBits & OPT_BIT_SEQUENCE_ATTACHMENT) != 0;
    }

    private boolean lengthIsSet() {
      return (optBits & OPT_BIT_LENGTH) != 0;
    }

    private boolean cTerminalModificationIsSet() {
      return (optBits & OPT_BIT_C_TERMINAL_MODIFICATION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean cTerminalModificationIdIsSet() {
      return (optBits & OPT_BIT_C_TERMINAL_MODIFICATION_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceProtein_Subunit is strict, attribute is already set: ".concat(name));
    }
  }
}

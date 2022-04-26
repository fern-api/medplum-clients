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
 * Immutable implementation of {@link MolecularSequence_Variant}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMolecularSequence_Variant.builder()}.
 */
@Generated(from = "MolecularSequence_Variant", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMolecularSequence_Variant
    implements MolecularSequence_Variant {
  private final @Nullable Integer end;
  private final @Nullable String id;
  private final @Nullable Reference variantPointer;
  private final @Nullable Integer start;
  private final @Nullable String cigar;
  private final @Nullable String referenceAllele;
  private final @Nullable List<Extension> extension;
  private final @Nullable String observedAllele;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableMolecularSequence_Variant(
      @Nullable Integer end,
      @Nullable String id,
      @Nullable Reference variantPointer,
      @Nullable Integer start,
      @Nullable String cigar,
      @Nullable String referenceAllele,
      @Nullable List<Extension> extension,
      @Nullable String observedAllele,
      @Nullable List<Extension> modifierExtension) {
    this.end = end;
    this.id = id;
    this.variantPointer = variantPointer;
    this.start = start;
    this.cigar = cigar;
    this.referenceAllele = referenceAllele;
    this.extension = extension;
    this.observedAllele = observedAllele;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code end} attribute
   */
  @JsonProperty("end")
  @Override
  public Optional<Integer> end() {
    return Optional.ofNullable(end);
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
   * @return The value of the {@code variantPointer} attribute
   */
  @JsonProperty("variantPointer")
  @Override
  public Optional<Reference> variantPointer() {
    return Optional.ofNullable(variantPointer);
  }

  /**
   * @return The value of the {@code start} attribute
   */
  @JsonProperty("start")
  @Override
  public Optional<Integer> start() {
    return Optional.ofNullable(start);
  }

  /**
   * @return The value of the {@code cigar} attribute
   */
  @JsonProperty("cigar")
  @Override
  public Optional<String> cigar() {
    return Optional.ofNullable(cigar);
  }

  /**
   * @return The value of the {@code referenceAllele} attribute
   */
  @JsonProperty("referenceAllele")
  @Override
  public Optional<String> referenceAllele() {
    return Optional.ofNullable(referenceAllele);
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
   * @return The value of the {@code observedAllele} attribute
   */
  @JsonProperty("observedAllele")
  @Override
  public Optional<String> observedAllele() {
    return Optional.ofNullable(observedAllele);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Variant#end() end} attribute.
   * @param value The value for end
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Variant withEnd(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.end, newValue)) return this;
    return new ImmutableMolecularSequence_Variant(
        newValue,
        this.id,
        this.variantPointer,
        this.start,
        this.cigar,
        this.referenceAllele,
        this.extension,
        this.observedAllele,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Variant#end() end} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for end
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Variant withEnd(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.end, value)) return this;
    return new ImmutableMolecularSequence_Variant(
        value,
        this.id,
        this.variantPointer,
        this.start,
        this.cigar,
        this.referenceAllele,
        this.extension,
        this.observedAllele,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Variant#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Variant withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMolecularSequence_Variant(
        this.end,
        newValue,
        this.variantPointer,
        this.start,
        this.cigar,
        this.referenceAllele,
        this.extension,
        this.observedAllele,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Variant#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Variant withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMolecularSequence_Variant(
        this.end,
        value,
        this.variantPointer,
        this.start,
        this.cigar,
        this.referenceAllele,
        this.extension,
        this.observedAllele,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Variant#variantPointer() variantPointer} attribute.
   * @param value The value for variantPointer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Variant withVariantPointer(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "variantPointer");
    if (this.variantPointer == newValue) return this;
    return new ImmutableMolecularSequence_Variant(
        this.end,
        this.id,
        newValue,
        this.start,
        this.cigar,
        this.referenceAllele,
        this.extension,
        this.observedAllele,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Variant#variantPointer() variantPointer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for variantPointer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Variant withVariantPointer(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.variantPointer == value) return this;
    return new ImmutableMolecularSequence_Variant(
        this.end,
        this.id,
        value,
        this.start,
        this.cigar,
        this.referenceAllele,
        this.extension,
        this.observedAllele,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Variant#start() start} attribute.
   * @param value The value for start
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Variant withStart(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.start, newValue)) return this;
    return new ImmutableMolecularSequence_Variant(
        this.end,
        this.id,
        this.variantPointer,
        newValue,
        this.cigar,
        this.referenceAllele,
        this.extension,
        this.observedAllele,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Variant#start() start} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for start
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Variant withStart(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.start, value)) return this;
    return new ImmutableMolecularSequence_Variant(
        this.end,
        this.id,
        this.variantPointer,
        value,
        this.cigar,
        this.referenceAllele,
        this.extension,
        this.observedAllele,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Variant#cigar() cigar} attribute.
   * @param value The value for cigar
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Variant withCigar(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "cigar");
    if (Objects.equals(this.cigar, newValue)) return this;
    return new ImmutableMolecularSequence_Variant(
        this.end,
        this.id,
        this.variantPointer,
        this.start,
        newValue,
        this.referenceAllele,
        this.extension,
        this.observedAllele,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Variant#cigar() cigar} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for cigar
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Variant withCigar(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.cigar, value)) return this;
    return new ImmutableMolecularSequence_Variant(
        this.end,
        this.id,
        this.variantPointer,
        this.start,
        value,
        this.referenceAllele,
        this.extension,
        this.observedAllele,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Variant#referenceAllele() referenceAllele} attribute.
   * @param value The value for referenceAllele
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Variant withReferenceAllele(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "referenceAllele");
    if (Objects.equals(this.referenceAllele, newValue)) return this;
    return new ImmutableMolecularSequence_Variant(
        this.end,
        this.id,
        this.variantPointer,
        this.start,
        this.cigar,
        newValue,
        this.extension,
        this.observedAllele,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Variant#referenceAllele() referenceAllele} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for referenceAllele
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Variant withReferenceAllele(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.referenceAllele, value)) return this;
    return new ImmutableMolecularSequence_Variant(
        this.end,
        this.id,
        this.variantPointer,
        this.start,
        this.cigar,
        value,
        this.extension,
        this.observedAllele,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Variant#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Variant withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMolecularSequence_Variant(
        this.end,
        this.id,
        this.variantPointer,
        this.start,
        this.cigar,
        this.referenceAllele,
        newValue,
        this.observedAllele,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Variant#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Variant withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMolecularSequence_Variant(
        this.end,
        this.id,
        this.variantPointer,
        this.start,
        this.cigar,
        this.referenceAllele,
        value,
        this.observedAllele,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Variant#observedAllele() observedAllele} attribute.
   * @param value The value for observedAllele
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Variant withObservedAllele(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "observedAllele");
    if (Objects.equals(this.observedAllele, newValue)) return this;
    return new ImmutableMolecularSequence_Variant(
        this.end,
        this.id,
        this.variantPointer,
        this.start,
        this.cigar,
        this.referenceAllele,
        this.extension,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Variant#observedAllele() observedAllele} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for observedAllele
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Variant withObservedAllele(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.observedAllele, value)) return this;
    return new ImmutableMolecularSequence_Variant(
        this.end,
        this.id,
        this.variantPointer,
        this.start,
        this.cigar,
        this.referenceAllele,
        this.extension,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Variant#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Variant withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMolecularSequence_Variant(
        this.end,
        this.id,
        this.variantPointer,
        this.start,
        this.cigar,
        this.referenceAllele,
        this.extension,
        this.observedAllele,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Variant#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Variant withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMolecularSequence_Variant(
        this.end,
        this.id,
        this.variantPointer,
        this.start,
        this.cigar,
        this.referenceAllele,
        this.extension,
        this.observedAllele,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMolecularSequence_Variant} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMolecularSequence_Variant
        && equalTo((ImmutableMolecularSequence_Variant) another);
  }

  private boolean equalTo(ImmutableMolecularSequence_Variant another) {
    return Objects.equals(end, another.end)
        && Objects.equals(id, another.id)
        && Objects.equals(variantPointer, another.variantPointer)
        && Objects.equals(start, another.start)
        && Objects.equals(cigar, another.cigar)
        && Objects.equals(referenceAllele, another.referenceAllele)
        && Objects.equals(extension, another.extension)
        && Objects.equals(observedAllele, another.observedAllele)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code end}, {@code id}, {@code variantPointer}, {@code start}, {@code cigar}, {@code referenceAllele}, {@code extension}, {@code observedAllele}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(end);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(variantPointer);
    h += (h << 5) + Objects.hashCode(start);
    h += (h << 5) + Objects.hashCode(cigar);
    h += (h << 5) + Objects.hashCode(referenceAllele);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(observedAllele);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code MolecularSequence_Variant} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MolecularSequence_Variant{");
    if (end != null) {
      builder.append("end=").append(end);
    }
    if (id != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (variantPointer != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("variantPointer=").append(variantPointer);
    }
    if (start != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("start=").append(start);
    }
    if (cigar != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("cigar=").append(cigar);
    }
    if (referenceAllele != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("referenceAllele=").append(referenceAllele);
    }
    if (extension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (observedAllele != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("observedAllele=").append(observedAllele);
    }
    if (modifierExtension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MolecularSequence_Variant", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MolecularSequence_Variant {
    @Nullable Optional<Integer> end = Optional.empty();
    boolean endIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Reference> variantPointer = Optional.empty();
    boolean variantPointerIsSet;
    @Nullable Optional<Integer> start = Optional.empty();
    boolean startIsSet;
    @Nullable Optional<String> cigar = Optional.empty();
    boolean cigarIsSet;
    @Nullable Optional<String> referenceAllele = Optional.empty();
    boolean referenceAlleleIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> observedAllele = Optional.empty();
    boolean observedAlleleIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("end")
    public void setEnd(Optional<Integer> end) {
      this.end = end;
      this.endIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("variantPointer")
    public void setVariantPointer(Optional<Reference> variantPointer) {
      this.variantPointer = variantPointer;
      this.variantPointerIsSet = true;
    }
    @JsonProperty("start")
    public void setStart(Optional<Integer> start) {
      this.start = start;
      this.startIsSet = true;
    }
    @JsonProperty("cigar")
    public void setCigar(Optional<String> cigar) {
      this.cigar = cigar;
      this.cigarIsSet = true;
    }
    @JsonProperty("referenceAllele")
    public void setReferenceAllele(Optional<String> referenceAllele) {
      this.referenceAllele = referenceAllele;
      this.referenceAlleleIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("observedAllele")
    public void setObservedAllele(Optional<String> observedAllele) {
      this.observedAllele = observedAllele;
      this.observedAlleleIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<Integer> end() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> variantPointer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> start() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> cigar() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> referenceAllele() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> observedAllele() { throw new UnsupportedOperationException(); }
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
  static ImmutableMolecularSequence_Variant fromJson(Json json) {
    ImmutableMolecularSequence_Variant.Builder builder = ImmutableMolecularSequence_Variant.builder();
    if (json.endIsSet) {
      builder.end(json.end);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.variantPointerIsSet) {
      builder.variantPointer(json.variantPointer);
    }
    if (json.startIsSet) {
      builder.start(json.start);
    }
    if (json.cigarIsSet) {
      builder.cigar(json.cigar);
    }
    if (json.referenceAlleleIsSet) {
      builder.referenceAllele(json.referenceAllele);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.observedAlleleIsSet) {
      builder.observedAllele(json.observedAllele);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableMolecularSequence_Variant) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MolecularSequence_Variant} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MolecularSequence_Variant instance
   */
  public static MolecularSequence_Variant copyOf(MolecularSequence_Variant instance) {
    if (instance instanceof ImmutableMolecularSequence_Variant) {
      return (ImmutableMolecularSequence_Variant) instance;
    }
    return ImmutableMolecularSequence_Variant.builder()
        .end(instance.end())
        .id(instance.id())
        .variantPointer(instance.variantPointer())
        .start(instance.start())
        .cigar(instance.cigar())
        .referenceAllele(instance.referenceAllele())
        .extension(instance.extension())
        .observedAllele(instance.observedAllele())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link MolecularSequence_Variant MolecularSequence_Variant}.
   * <pre>
   * ImmutableMolecularSequence_Variant.builder()
   *    .end(Integer) // optional {@link MolecularSequence_Variant#end() end}
   *    .id(String) // optional {@link MolecularSequence_Variant#id() id}
   *    .variantPointer(com.medplum.types.fhir.Reference) // optional {@link MolecularSequence_Variant#variantPointer() variantPointer}
   *    .start(Integer) // optional {@link MolecularSequence_Variant#start() start}
   *    .cigar(String) // optional {@link MolecularSequence_Variant#cigar() cigar}
   *    .referenceAllele(String) // optional {@link MolecularSequence_Variant#referenceAllele() referenceAllele}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MolecularSequence_Variant#extension() extension}
   *    .observedAllele(String) // optional {@link MolecularSequence_Variant#observedAllele() observedAllele}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MolecularSequence_Variant#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new MolecularSequence_Variant builder
   */
  public static ImmutableMolecularSequence_Variant.Builder builder() {
    return new ImmutableMolecularSequence_Variant.Builder();
  }

  /**
   * Builds instances of type {@link MolecularSequence_Variant MolecularSequence_Variant}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MolecularSequence_Variant", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_END = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_VARIANT_POINTER = 0x4L;
    private static final long OPT_BIT_START = 0x8L;
    private static final long OPT_BIT_CIGAR = 0x10L;
    private static final long OPT_BIT_REFERENCE_ALLELE = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_OBSERVED_ALLELE = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private long optBits;

    private @Nullable Integer end;
    private @Nullable String id;
    private @Nullable Reference variantPointer;
    private @Nullable Integer start;
    private @Nullable String cigar;
    private @Nullable String referenceAllele;
    private @Nullable List<Extension> extension;
    private @Nullable String observedAllele;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Variant#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for chained invocation
     */
    public final Builder end(int end) {
      checkNotIsSet(endIsSet(), "end");
      this.end = end;
      optBits |= OPT_BIT_END;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Variant#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("end")
    public final Builder end(Optional<Integer> end) {
      checkNotIsSet(endIsSet(), "end");
      this.end = end.orElse(null);
      optBits |= OPT_BIT_END;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Variant#id() id} to id.
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
     * Initializes the optional value {@link MolecularSequence_Variant#id() id} to id.
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
     * Initializes the optional value {@link MolecularSequence_Variant#variantPointer() variantPointer} to variantPointer.
     * @param variantPointer The value for variantPointer
     * @return {@code this} builder for chained invocation
     */
    public final Builder variantPointer(Reference variantPointer) {
      checkNotIsSet(variantPointerIsSet(), "variantPointer");
      this.variantPointer = Objects.requireNonNull(variantPointer, "variantPointer");
      optBits |= OPT_BIT_VARIANT_POINTER;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Variant#variantPointer() variantPointer} to variantPointer.
     * @param variantPointer The value for variantPointer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("variantPointer")
    public final Builder variantPointer(Optional<? extends Reference> variantPointer) {
      checkNotIsSet(variantPointerIsSet(), "variantPointer");
      this.variantPointer = variantPointer.orElse(null);
      optBits |= OPT_BIT_VARIANT_POINTER;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Variant#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for chained invocation
     */
    public final Builder start(int start) {
      checkNotIsSet(startIsSet(), "start");
      this.start = start;
      optBits |= OPT_BIT_START;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Variant#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("start")
    public final Builder start(Optional<Integer> start) {
      checkNotIsSet(startIsSet(), "start");
      this.start = start.orElse(null);
      optBits |= OPT_BIT_START;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Variant#cigar() cigar} to cigar.
     * @param cigar The value for cigar
     * @return {@code this} builder for chained invocation
     */
    public final Builder cigar(String cigar) {
      checkNotIsSet(cigarIsSet(), "cigar");
      this.cigar = Objects.requireNonNull(cigar, "cigar");
      optBits |= OPT_BIT_CIGAR;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Variant#cigar() cigar} to cigar.
     * @param cigar The value for cigar
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("cigar")
    public final Builder cigar(Optional<String> cigar) {
      checkNotIsSet(cigarIsSet(), "cigar");
      this.cigar = cigar.orElse(null);
      optBits |= OPT_BIT_CIGAR;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Variant#referenceAllele() referenceAllele} to referenceAllele.
     * @param referenceAllele The value for referenceAllele
     * @return {@code this} builder for chained invocation
     */
    public final Builder referenceAllele(String referenceAllele) {
      checkNotIsSet(referenceAlleleIsSet(), "referenceAllele");
      this.referenceAllele = Objects.requireNonNull(referenceAllele, "referenceAllele");
      optBits |= OPT_BIT_REFERENCE_ALLELE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Variant#referenceAllele() referenceAllele} to referenceAllele.
     * @param referenceAllele The value for referenceAllele
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("referenceAllele")
    public final Builder referenceAllele(Optional<String> referenceAllele) {
      checkNotIsSet(referenceAlleleIsSet(), "referenceAllele");
      this.referenceAllele = referenceAllele.orElse(null);
      optBits |= OPT_BIT_REFERENCE_ALLELE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Variant#extension() extension} to extension.
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
     * Initializes the optional value {@link MolecularSequence_Variant#extension() extension} to extension.
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
     * Initializes the optional value {@link MolecularSequence_Variant#observedAllele() observedAllele} to observedAllele.
     * @param observedAllele The value for observedAllele
     * @return {@code this} builder for chained invocation
     */
    public final Builder observedAllele(String observedAllele) {
      checkNotIsSet(observedAlleleIsSet(), "observedAllele");
      this.observedAllele = Objects.requireNonNull(observedAllele, "observedAllele");
      optBits |= OPT_BIT_OBSERVED_ALLELE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Variant#observedAllele() observedAllele} to observedAllele.
     * @param observedAllele The value for observedAllele
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("observedAllele")
    public final Builder observedAllele(Optional<String> observedAllele) {
      checkNotIsSet(observedAlleleIsSet(), "observedAllele");
      this.observedAllele = observedAllele.orElse(null);
      optBits |= OPT_BIT_OBSERVED_ALLELE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Variant#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MolecularSequence_Variant#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link MolecularSequence_Variant MolecularSequence_Variant}.
     * @return An immutable instance of MolecularSequence_Variant
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MolecularSequence_Variant build() {
      return new ImmutableMolecularSequence_Variant(
          end,
          id,
          variantPointer,
          start,
          cigar,
          referenceAllele,
          extension,
          observedAllele,
          modifierExtension);
    }

    private boolean endIsSet() {
      return (optBits & OPT_BIT_END) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean variantPointerIsSet() {
      return (optBits & OPT_BIT_VARIANT_POINTER) != 0;
    }

    private boolean startIsSet() {
      return (optBits & OPT_BIT_START) != 0;
    }

    private boolean cigarIsSet() {
      return (optBits & OPT_BIT_CIGAR) != 0;
    }

    private boolean referenceAlleleIsSet() {
      return (optBits & OPT_BIT_REFERENCE_ALLELE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean observedAlleleIsSet() {
      return (optBits & OPT_BIT_OBSERVED_ALLELE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MolecularSequence_Variant is strict, attribute is already set: ".concat(name));
    }
  }
}

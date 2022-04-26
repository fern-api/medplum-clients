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
final class ImmutableMolecularSequence_Variant implements MolecularSequence_Variant {
  private final @Nullable Integer start;
  private final @Nullable String id;
  private final @Nullable String cigar;
  private final @Nullable List<Extension> extension;
  private final @Nullable Reference variantPointer;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Integer end;
  private final @Nullable String observedAllele;
  private final @Nullable String referenceAllele;

  private ImmutableMolecularSequence_Variant(
      @Nullable Integer start,
      @Nullable String id,
      @Nullable String cigar,
      @Nullable List<Extension> extension,
      @Nullable Reference variantPointer,
      @Nullable List<Extension> modifierExtension,
      @Nullable Integer end,
      @Nullable String observedAllele,
      @Nullable String referenceAllele) {
    this.start = start;
    this.id = id;
    this.cigar = cigar;
    this.extension = extension;
    this.variantPointer = variantPointer;
    this.modifierExtension = modifierExtension;
    this.end = end;
    this.observedAllele = observedAllele;
    this.referenceAllele = referenceAllele;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code observedAllele} attribute
   */
  @JsonProperty("observedAllele")
  @Override
  public Optional<String> observedAllele() {
    return Optional.ofNullable(observedAllele);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Variant#start() start} attribute.
   * @param value The value for start
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Variant withStart(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.start, newValue)) return this;
    return new ImmutableMolecularSequence_Variant(
        newValue,
        this.id,
        this.cigar,
        this.extension,
        this.variantPointer,
        this.modifierExtension,
        this.end,
        this.observedAllele,
        this.referenceAllele);
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
        value,
        this.id,
        this.cigar,
        this.extension,
        this.variantPointer,
        this.modifierExtension,
        this.end,
        this.observedAllele,
        this.referenceAllele);
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
        this.start,
        newValue,
        this.cigar,
        this.extension,
        this.variantPointer,
        this.modifierExtension,
        this.end,
        this.observedAllele,
        this.referenceAllele);
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
        this.start,
        value,
        this.cigar,
        this.extension,
        this.variantPointer,
        this.modifierExtension,
        this.end,
        this.observedAllele,
        this.referenceAllele);
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
        this.start,
        this.id,
        newValue,
        this.extension,
        this.variantPointer,
        this.modifierExtension,
        this.end,
        this.observedAllele,
        this.referenceAllele);
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
        this.start,
        this.id,
        value,
        this.extension,
        this.variantPointer,
        this.modifierExtension,
        this.end,
        this.observedAllele,
        this.referenceAllele);
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
        this.start,
        this.id,
        this.cigar,
        newValue,
        this.variantPointer,
        this.modifierExtension,
        this.end,
        this.observedAllele,
        this.referenceAllele);
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
        this.start,
        this.id,
        this.cigar,
        value,
        this.variantPointer,
        this.modifierExtension,
        this.end,
        this.observedAllele,
        this.referenceAllele);
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
        this.start,
        this.id,
        this.cigar,
        this.extension,
        newValue,
        this.modifierExtension,
        this.end,
        this.observedAllele,
        this.referenceAllele);
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
        this.start,
        this.id,
        this.cigar,
        this.extension,
        value,
        this.modifierExtension,
        this.end,
        this.observedAllele,
        this.referenceAllele);
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
        this.start,
        this.id,
        this.cigar,
        this.extension,
        this.variantPointer,
        newValue,
        this.end,
        this.observedAllele,
        this.referenceAllele);
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
        this.start,
        this.id,
        this.cigar,
        this.extension,
        this.variantPointer,
        value,
        this.end,
        this.observedAllele,
        this.referenceAllele);
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
        this.start,
        this.id,
        this.cigar,
        this.extension,
        this.variantPointer,
        this.modifierExtension,
        newValue,
        this.observedAllele,
        this.referenceAllele);
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
        this.start,
        this.id,
        this.cigar,
        this.extension,
        this.variantPointer,
        this.modifierExtension,
        value,
        this.observedAllele,
        this.referenceAllele);
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
        this.start,
        this.id,
        this.cigar,
        this.extension,
        this.variantPointer,
        this.modifierExtension,
        this.end,
        newValue,
        this.referenceAllele);
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
        this.start,
        this.id,
        this.cigar,
        this.extension,
        this.variantPointer,
        this.modifierExtension,
        this.end,
        value,
        this.referenceAllele);
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
        this.start,
        this.id,
        this.cigar,
        this.extension,
        this.variantPointer,
        this.modifierExtension,
        this.end,
        this.observedAllele,
        newValue);
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
        this.start,
        this.id,
        this.cigar,
        this.extension,
        this.variantPointer,
        this.modifierExtension,
        this.end,
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
    return Objects.equals(start, another.start)
        && Objects.equals(id, another.id)
        && Objects.equals(cigar, another.cigar)
        && Objects.equals(extension, another.extension)
        && Objects.equals(variantPointer, another.variantPointer)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(end, another.end)
        && Objects.equals(observedAllele, another.observedAllele)
        && Objects.equals(referenceAllele, another.referenceAllele);
  }

  /**
   * Computes a hash code from attributes: {@code start}, {@code id}, {@code cigar}, {@code extension}, {@code variantPointer}, {@code modifierExtension}, {@code end}, {@code observedAllele}, {@code referenceAllele}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(start);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(cigar);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(variantPointer);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(end);
    h += (h << 5) + Objects.hashCode(observedAllele);
    h += (h << 5) + Objects.hashCode(referenceAllele);
    return h;
  }

  /**
   * Prints the immutable value {@code MolecularSequence_Variant} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MolecularSequence_Variant{");
    if (start != null) {
      builder.append("start=").append(start);
    }
    if (id != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (cigar != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("cigar=").append(cigar);
    }
    if (extension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (variantPointer != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("variantPointer=").append(variantPointer);
    }
    if (modifierExtension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (end != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("end=").append(end);
    }
    if (observedAllele != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("observedAllele=").append(observedAllele);
    }
    if (referenceAllele != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("referenceAllele=").append(referenceAllele);
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
    @Nullable Optional<Integer> start = Optional.empty();
    boolean startIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> cigar = Optional.empty();
    boolean cigarIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Reference> variantPointer = Optional.empty();
    boolean variantPointerIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Integer> end = Optional.empty();
    boolean endIsSet;
    @Nullable Optional<String> observedAllele = Optional.empty();
    boolean observedAlleleIsSet;
    @Nullable Optional<String> referenceAllele = Optional.empty();
    boolean referenceAlleleIsSet;
    @JsonProperty("start")
    public void setStart(Optional<Integer> start) {
      this.start = start;
      this.startIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("cigar")
    public void setCigar(Optional<String> cigar) {
      this.cigar = cigar;
      this.cigarIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("variantPointer")
    public void setVariantPointer(Optional<Reference> variantPointer) {
      this.variantPointer = variantPointer;
      this.variantPointerIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("end")
    public void setEnd(Optional<Integer> end) {
      this.end = end;
      this.endIsSet = true;
    }
    @JsonProperty("observedAllele")
    public void setObservedAllele(Optional<String> observedAllele) {
      this.observedAllele = observedAllele;
      this.observedAlleleIsSet = true;
    }
    @JsonProperty("referenceAllele")
    public void setReferenceAllele(Optional<String> referenceAllele) {
      this.referenceAllele = referenceAllele;
      this.referenceAlleleIsSet = true;
    }
    @Override
    public Optional<Integer> start() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> cigar() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> variantPointer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> end() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> observedAllele() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> referenceAllele() { throw new UnsupportedOperationException(); }
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
    if (json.startIsSet) {
      builder.start(json.start);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.cigarIsSet) {
      builder.cigar(json.cigar);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.variantPointerIsSet) {
      builder.variantPointer(json.variantPointer);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.endIsSet) {
      builder.end(json.end);
    }
    if (json.observedAlleleIsSet) {
      builder.observedAllele(json.observedAllele);
    }
    if (json.referenceAlleleIsSet) {
      builder.referenceAllele(json.referenceAllele);
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
        .start(instance.start())
        .id(instance.id())
        .cigar(instance.cigar())
        .extension(instance.extension())
        .variantPointer(instance.variantPointer())
        .modifierExtension(instance.modifierExtension())
        .end(instance.end())
        .observedAllele(instance.observedAllele())
        .referenceAllele(instance.referenceAllele())
        .build();
  }

  /**
   * Creates a builder for {@link MolecularSequence_Variant MolecularSequence_Variant}.
   * <pre>
   * ImmutableMolecularSequence_Variant.builder()
   *    .start(Integer) // optional {@link MolecularSequence_Variant#start() start}
   *    .id(String) // optional {@link MolecularSequence_Variant#id() id}
   *    .cigar(String) // optional {@link MolecularSequence_Variant#cigar() cigar}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MolecularSequence_Variant#extension() extension}
   *    .variantPointer(com.fhir.types.fhir.Reference) // optional {@link MolecularSequence_Variant#variantPointer() variantPointer}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MolecularSequence_Variant#modifierExtension() modifierExtension}
   *    .end(Integer) // optional {@link MolecularSequence_Variant#end() end}
   *    .observedAllele(String) // optional {@link MolecularSequence_Variant#observedAllele() observedAllele}
   *    .referenceAllele(String) // optional {@link MolecularSequence_Variant#referenceAllele() referenceAllele}
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
    private static final long OPT_BIT_START = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_CIGAR = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_VARIANT_POINTER = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_END = 0x40L;
    private static final long OPT_BIT_OBSERVED_ALLELE = 0x80L;
    private static final long OPT_BIT_REFERENCE_ALLELE = 0x100L;
    private long optBits;

    private @Nullable Integer start;
    private @Nullable String id;
    private @Nullable String cigar;
    private @Nullable List<Extension> extension;
    private @Nullable Reference variantPointer;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Integer end;
    private @Nullable String observedAllele;
    private @Nullable String referenceAllele;

    private Builder() {
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
     * Builds a new {@link MolecularSequence_Variant MolecularSequence_Variant}.
     * @return An immutable instance of MolecularSequence_Variant
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MolecularSequence_Variant build() {
      return new ImmutableMolecularSequence_Variant(
          start,
          id,
          cigar,
          extension,
          variantPointer,
          modifierExtension,
          end,
          observedAllele,
          referenceAllele);
    }

    private boolean startIsSet() {
      return (optBits & OPT_BIT_START) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean cigarIsSet() {
      return (optBits & OPT_BIT_CIGAR) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean variantPointerIsSet() {
      return (optBits & OPT_BIT_VARIANT_POINTER) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean endIsSet() {
      return (optBits & OPT_BIT_END) != 0;
    }

    private boolean observedAlleleIsSet() {
      return (optBits & OPT_BIT_OBSERVED_ALLELE) != 0;
    }

    private boolean referenceAlleleIsSet() {
      return (optBits & OPT_BIT_REFERENCE_ALLELE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MolecularSequence_Variant is strict, attribute is already set: ".concat(name));
    }
  }
}

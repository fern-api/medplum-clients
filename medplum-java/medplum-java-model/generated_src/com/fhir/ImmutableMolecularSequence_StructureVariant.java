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
 * Immutable implementation of {@link MolecularSequence_StructureVariant}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMolecularSequence_StructureVariant.builder()}.
 */
@Generated(from = "MolecularSequence_StructureVariant", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMolecularSequence_StructureVariant
    implements MolecularSequence_StructureVariant {
  private final @Nullable Boolean exact;
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept variantType;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable MolecularSequence_Outer outer;
  private final @Nullable MolecularSequence_Inner inner;
  private final @Nullable String id;
  private final @Nullable Integer length;

  private ImmutableMolecularSequence_StructureVariant(
      @Nullable Boolean exact,
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept variantType,
      @Nullable List<Extension> modifierExtension,
      @Nullable MolecularSequence_Outer outer,
      @Nullable MolecularSequence_Inner inner,
      @Nullable String id,
      @Nullable Integer length) {
    this.exact = exact;
    this.extension = extension;
    this.variantType = variantType;
    this.modifierExtension = modifierExtension;
    this.outer = outer;
    this.inner = inner;
    this.id = id;
    this.length = length;
  }

  /**
   * @return The value of the {@code exact} attribute
   */
  @JsonProperty("exact")
  @Override
  public Optional<Boolean> exact() {
    return Optional.ofNullable(exact);
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
   * @return The value of the {@code variantType} attribute
   */
  @JsonProperty("variantType")
  @Override
  public Optional<CodeableConcept> variantType() {
    return Optional.ofNullable(variantType);
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
   * @return The value of the {@code outer} attribute
   */
  @JsonProperty("outer")
  @Override
  public Optional<MolecularSequence_Outer> outer() {
    return Optional.ofNullable(outer);
  }

  /**
   * @return The value of the {@code inner} attribute
   */
  @JsonProperty("inner")
  @Override
  public Optional<MolecularSequence_Inner> inner() {
    return Optional.ofNullable(inner);
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
   * @return The value of the {@code length} attribute
   */
  @JsonProperty("length")
  @Override
  public Optional<Integer> length() {
    return Optional.ofNullable(length);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_StructureVariant#exact() exact} attribute.
   * @param value The value for exact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_StructureVariant withExact(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.exact, newValue)) return this;
    return new ImmutableMolecularSequence_StructureVariant(
        newValue,
        this.extension,
        this.variantType,
        this.modifierExtension,
        this.outer,
        this.inner,
        this.id,
        this.length);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_StructureVariant#exact() exact} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for exact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_StructureVariant withExact(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.exact, value)) return this;
    return new ImmutableMolecularSequence_StructureVariant(
        value,
        this.extension,
        this.variantType,
        this.modifierExtension,
        this.outer,
        this.inner,
        this.id,
        this.length);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_StructureVariant#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_StructureVariant withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMolecularSequence_StructureVariant(
        this.exact,
        newValue,
        this.variantType,
        this.modifierExtension,
        this.outer,
        this.inner,
        this.id,
        this.length);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_StructureVariant#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_StructureVariant withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMolecularSequence_StructureVariant(
        this.exact,
        value,
        this.variantType,
        this.modifierExtension,
        this.outer,
        this.inner,
        this.id,
        this.length);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_StructureVariant#variantType() variantType} attribute.
   * @param value The value for variantType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_StructureVariant withVariantType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "variantType");
    if (this.variantType == newValue) return this;
    return new ImmutableMolecularSequence_StructureVariant(
        this.exact,
        this.extension,
        newValue,
        this.modifierExtension,
        this.outer,
        this.inner,
        this.id,
        this.length);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_StructureVariant#variantType() variantType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for variantType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_StructureVariant withVariantType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.variantType == value) return this;
    return new ImmutableMolecularSequence_StructureVariant(
        this.exact,
        this.extension,
        value,
        this.modifierExtension,
        this.outer,
        this.inner,
        this.id,
        this.length);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_StructureVariant#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_StructureVariant withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMolecularSequence_StructureVariant(
        this.exact,
        this.extension,
        this.variantType,
        newValue,
        this.outer,
        this.inner,
        this.id,
        this.length);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_StructureVariant#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_StructureVariant withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMolecularSequence_StructureVariant(
        this.exact,
        this.extension,
        this.variantType,
        value,
        this.outer,
        this.inner,
        this.id,
        this.length);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_StructureVariant#outer() outer} attribute.
   * @param value The value for outer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_StructureVariant withOuter(MolecularSequence_Outer value) {
    @Nullable MolecularSequence_Outer newValue = Objects.requireNonNull(value, "outer");
    if (this.outer == newValue) return this;
    return new ImmutableMolecularSequence_StructureVariant(
        this.exact,
        this.extension,
        this.variantType,
        this.modifierExtension,
        newValue,
        this.inner,
        this.id,
        this.length);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_StructureVariant#outer() outer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_StructureVariant withOuter(Optional<? extends MolecularSequence_Outer> optional) {
    @Nullable MolecularSequence_Outer value = optional.orElse(null);
    if (this.outer == value) return this;
    return new ImmutableMolecularSequence_StructureVariant(
        this.exact,
        this.extension,
        this.variantType,
        this.modifierExtension,
        value,
        this.inner,
        this.id,
        this.length);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_StructureVariant#inner() inner} attribute.
   * @param value The value for inner
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_StructureVariant withInner(MolecularSequence_Inner value) {
    @Nullable MolecularSequence_Inner newValue = Objects.requireNonNull(value, "inner");
    if (this.inner == newValue) return this;
    return new ImmutableMolecularSequence_StructureVariant(
        this.exact,
        this.extension,
        this.variantType,
        this.modifierExtension,
        this.outer,
        newValue,
        this.id,
        this.length);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_StructureVariant#inner() inner} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for inner
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_StructureVariant withInner(Optional<? extends MolecularSequence_Inner> optional) {
    @Nullable MolecularSequence_Inner value = optional.orElse(null);
    if (this.inner == value) return this;
    return new ImmutableMolecularSequence_StructureVariant(
        this.exact,
        this.extension,
        this.variantType,
        this.modifierExtension,
        this.outer,
        value,
        this.id,
        this.length);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_StructureVariant#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_StructureVariant withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMolecularSequence_StructureVariant(
        this.exact,
        this.extension,
        this.variantType,
        this.modifierExtension,
        this.outer,
        this.inner,
        newValue,
        this.length);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_StructureVariant#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_StructureVariant withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMolecularSequence_StructureVariant(
        this.exact,
        this.extension,
        this.variantType,
        this.modifierExtension,
        this.outer,
        this.inner,
        value,
        this.length);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_StructureVariant#length() length} attribute.
   * @param value The value for length
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_StructureVariant withLength(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.length, newValue)) return this;
    return new ImmutableMolecularSequence_StructureVariant(
        this.exact,
        this.extension,
        this.variantType,
        this.modifierExtension,
        this.outer,
        this.inner,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_StructureVariant#length() length} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for length
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_StructureVariant withLength(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.length, value)) return this;
    return new ImmutableMolecularSequence_StructureVariant(
        this.exact,
        this.extension,
        this.variantType,
        this.modifierExtension,
        this.outer,
        this.inner,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMolecularSequence_StructureVariant} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMolecularSequence_StructureVariant
        && equalTo((ImmutableMolecularSequence_StructureVariant) another);
  }

  private boolean equalTo(ImmutableMolecularSequence_StructureVariant another) {
    return Objects.equals(exact, another.exact)
        && Objects.equals(extension, another.extension)
        && Objects.equals(variantType, another.variantType)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(outer, another.outer)
        && Objects.equals(inner, another.inner)
        && Objects.equals(id, another.id)
        && Objects.equals(length, another.length);
  }

  /**
   * Computes a hash code from attributes: {@code exact}, {@code extension}, {@code variantType}, {@code modifierExtension}, {@code outer}, {@code inner}, {@code id}, {@code length}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(exact);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(variantType);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(outer);
    h += (h << 5) + Objects.hashCode(inner);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(length);
    return h;
  }

  /**
   * Prints the immutable value {@code MolecularSequence_StructureVariant} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MolecularSequence_StructureVariant{");
    if (exact != null) {
      builder.append("exact=").append(exact);
    }
    if (extension != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (variantType != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("variantType=").append(variantType);
    }
    if (modifierExtension != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (outer != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("outer=").append(outer);
    }
    if (inner != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("inner=").append(inner);
    }
    if (id != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (length != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("length=").append(length);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MolecularSequence_StructureVariant", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MolecularSequence_StructureVariant {
    @Nullable Optional<Boolean> exact = Optional.empty();
    boolean exactIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> variantType = Optional.empty();
    boolean variantTypeIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<MolecularSequence_Outer> outer = Optional.empty();
    boolean outerIsSet;
    @Nullable Optional<MolecularSequence_Inner> inner = Optional.empty();
    boolean innerIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Integer> length = Optional.empty();
    boolean lengthIsSet;
    @JsonProperty("exact")
    public void setExact(Optional<Boolean> exact) {
      this.exact = exact;
      this.exactIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("variantType")
    public void setVariantType(Optional<CodeableConcept> variantType) {
      this.variantType = variantType;
      this.variantTypeIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("outer")
    public void setOuter(Optional<MolecularSequence_Outer> outer) {
      this.outer = outer;
      this.outerIsSet = true;
    }
    @JsonProperty("inner")
    public void setInner(Optional<MolecularSequence_Inner> inner) {
      this.inner = inner;
      this.innerIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("length")
    public void setLength(Optional<Integer> length) {
      this.length = length;
      this.lengthIsSet = true;
    }
    @Override
    public Optional<Boolean> exact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> variantType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<MolecularSequence_Outer> outer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<MolecularSequence_Inner> inner() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> length() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMolecularSequence_StructureVariant fromJson(Json json) {
    ImmutableMolecularSequence_StructureVariant.Builder builder = ImmutableMolecularSequence_StructureVariant.builder();
    if (json.exactIsSet) {
      builder.exact(json.exact);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.variantTypeIsSet) {
      builder.variantType(json.variantType);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.outerIsSet) {
      builder.outer(json.outer);
    }
    if (json.innerIsSet) {
      builder.inner(json.inner);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.lengthIsSet) {
      builder.length(json.length);
    }
    return (ImmutableMolecularSequence_StructureVariant) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MolecularSequence_StructureVariant} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MolecularSequence_StructureVariant instance
   */
  public static MolecularSequence_StructureVariant copyOf(MolecularSequence_StructureVariant instance) {
    if (instance instanceof ImmutableMolecularSequence_StructureVariant) {
      return (ImmutableMolecularSequence_StructureVariant) instance;
    }
    return ImmutableMolecularSequence_StructureVariant.builder()
        .exact(instance.exact())
        .extension(instance.extension())
        .variantType(instance.variantType())
        .modifierExtension(instance.modifierExtension())
        .outer(instance.outer())
        .inner(instance.inner())
        .id(instance.id())
        .length(instance.length())
        .build();
  }

  /**
   * Creates a builder for {@link MolecularSequence_StructureVariant MolecularSequence_StructureVariant}.
   * <pre>
   * ImmutableMolecularSequence_StructureVariant.builder()
   *    .exact(Boolean) // optional {@link MolecularSequence_StructureVariant#exact() exact}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MolecularSequence_StructureVariant#extension() extension}
   *    .variantType(com.fhir.CodeableConcept) // optional {@link MolecularSequence_StructureVariant#variantType() variantType}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MolecularSequence_StructureVariant#modifierExtension() modifierExtension}
   *    .outer(com.fhir.MolecularSequence_Outer) // optional {@link MolecularSequence_StructureVariant#outer() outer}
   *    .inner(com.fhir.MolecularSequence_Inner) // optional {@link MolecularSequence_StructureVariant#inner() inner}
   *    .id(String) // optional {@link MolecularSequence_StructureVariant#id() id}
   *    .length(Integer) // optional {@link MolecularSequence_StructureVariant#length() length}
   *    .build();
   * </pre>
   * @return A new MolecularSequence_StructureVariant builder
   */
  public static ImmutableMolecularSequence_StructureVariant.Builder builder() {
    return new ImmutableMolecularSequence_StructureVariant.Builder();
  }

  /**
   * Builds instances of type {@link MolecularSequence_StructureVariant MolecularSequence_StructureVariant}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MolecularSequence_StructureVariant", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXACT = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_VARIANT_TYPE = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_OUTER = 0x10L;
    private static final long OPT_BIT_INNER = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_LENGTH = 0x80L;
    private long optBits;

    private @Nullable Boolean exact;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept variantType;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable MolecularSequence_Outer outer;
    private @Nullable MolecularSequence_Inner inner;
    private @Nullable String id;
    private @Nullable Integer length;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MolecularSequence_StructureVariant#exact() exact} to exact.
     * @param exact The value for exact
     * @return {@code this} builder for chained invocation
     */
    public final Builder exact(boolean exact) {
      checkNotIsSet(exactIsSet(), "exact");
      this.exact = exact;
      optBits |= OPT_BIT_EXACT;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_StructureVariant#exact() exact} to exact.
     * @param exact The value for exact
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("exact")
    public final Builder exact(Optional<Boolean> exact) {
      checkNotIsSet(exactIsSet(), "exact");
      this.exact = exact.orElse(null);
      optBits |= OPT_BIT_EXACT;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_StructureVariant#extension() extension} to extension.
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
     * Initializes the optional value {@link MolecularSequence_StructureVariant#extension() extension} to extension.
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
     * Initializes the optional value {@link MolecularSequence_StructureVariant#variantType() variantType} to variantType.
     * @param variantType The value for variantType
     * @return {@code this} builder for chained invocation
     */
    public final Builder variantType(CodeableConcept variantType) {
      checkNotIsSet(variantTypeIsSet(), "variantType");
      this.variantType = Objects.requireNonNull(variantType, "variantType");
      optBits |= OPT_BIT_VARIANT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_StructureVariant#variantType() variantType} to variantType.
     * @param variantType The value for variantType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("variantType")
    public final Builder variantType(Optional<? extends CodeableConcept> variantType) {
      checkNotIsSet(variantTypeIsSet(), "variantType");
      this.variantType = variantType.orElse(null);
      optBits |= OPT_BIT_VARIANT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_StructureVariant#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MolecularSequence_StructureVariant#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MolecularSequence_StructureVariant#outer() outer} to outer.
     * @param outer The value for outer
     * @return {@code this} builder for chained invocation
     */
    public final Builder outer(MolecularSequence_Outer outer) {
      checkNotIsSet(outerIsSet(), "outer");
      this.outer = Objects.requireNonNull(outer, "outer");
      optBits |= OPT_BIT_OUTER;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_StructureVariant#outer() outer} to outer.
     * @param outer The value for outer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("outer")
    public final Builder outer(Optional<? extends MolecularSequence_Outer> outer) {
      checkNotIsSet(outerIsSet(), "outer");
      this.outer = outer.orElse(null);
      optBits |= OPT_BIT_OUTER;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_StructureVariant#inner() inner} to inner.
     * @param inner The value for inner
     * @return {@code this} builder for chained invocation
     */
    public final Builder inner(MolecularSequence_Inner inner) {
      checkNotIsSet(innerIsSet(), "inner");
      this.inner = Objects.requireNonNull(inner, "inner");
      optBits |= OPT_BIT_INNER;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_StructureVariant#inner() inner} to inner.
     * @param inner The value for inner
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("inner")
    public final Builder inner(Optional<? extends MolecularSequence_Inner> inner) {
      checkNotIsSet(innerIsSet(), "inner");
      this.inner = inner.orElse(null);
      optBits |= OPT_BIT_INNER;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_StructureVariant#id() id} to id.
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
     * Initializes the optional value {@link MolecularSequence_StructureVariant#id() id} to id.
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
     * Initializes the optional value {@link MolecularSequence_StructureVariant#length() length} to length.
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
     * Initializes the optional value {@link MolecularSequence_StructureVariant#length() length} to length.
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
     * Builds a new {@link MolecularSequence_StructureVariant MolecularSequence_StructureVariant}.
     * @return An immutable instance of MolecularSequence_StructureVariant
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MolecularSequence_StructureVariant build() {
      return new ImmutableMolecularSequence_StructureVariant(exact, extension, variantType, modifierExtension, outer, inner, id, length);
    }

    private boolean exactIsSet() {
      return (optBits & OPT_BIT_EXACT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean variantTypeIsSet() {
      return (optBits & OPT_BIT_VARIANT_TYPE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean outerIsSet() {
      return (optBits & OPT_BIT_OUTER) != 0;
    }

    private boolean innerIsSet() {
      return (optBits & OPT_BIT_INNER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean lengthIsSet() {
      return (optBits & OPT_BIT_LENGTH) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MolecularSequence_StructureVariant is strict, attribute is already set: ".concat(name));
    }
  }
}

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
 * Immutable implementation of {@link SubstancePolymer_MonomerSet}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstancePolymer_MonomerSet.builder()}.
 */
@Generated(from = "SubstancePolymer_MonomerSet", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstancePolymer_MonomerSet implements SubstancePolymer_MonomerSet {
  private final @Nullable CodeableConcept ratioType;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<SubstancePolymer_StartingMaterial> startingMaterial;

  private ImmutableSubstancePolymer_MonomerSet(
      @Nullable CodeableConcept ratioType,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable List<SubstancePolymer_StartingMaterial> startingMaterial) {
    this.ratioType = ratioType;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.startingMaterial = startingMaterial;
  }

  /**
   * @return The value of the {@code ratioType} attribute
   */
  @JsonProperty("ratioType")
  @Override
  public Optional<CodeableConcept> ratioType() {
    return Optional.ofNullable(ratioType);
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
   * @return The value of the {@code startingMaterial} attribute
   */
  @JsonProperty("startingMaterial")
  @Override
  public Optional<List<SubstancePolymer_StartingMaterial>> startingMaterial() {
    return Optional.ofNullable(startingMaterial);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_MonomerSet#ratioType() ratioType} attribute.
   * @param value The value for ratioType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_MonomerSet withRatioType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "ratioType");
    if (this.ratioType == newValue) return this;
    return new ImmutableSubstancePolymer_MonomerSet(newValue, this.id, this.modifierExtension, this.extension, this.startingMaterial);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_MonomerSet#ratioType() ratioType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for ratioType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer_MonomerSet withRatioType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.ratioType == value) return this;
    return new ImmutableSubstancePolymer_MonomerSet(value, this.id, this.modifierExtension, this.extension, this.startingMaterial);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_MonomerSet#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_MonomerSet withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstancePolymer_MonomerSet(this.ratioType, newValue, this.modifierExtension, this.extension, this.startingMaterial);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_MonomerSet#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_MonomerSet withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstancePolymer_MonomerSet(this.ratioType, value, this.modifierExtension, this.extension, this.startingMaterial);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_MonomerSet#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_MonomerSet withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstancePolymer_MonomerSet(this.ratioType, this.id, newValue, this.extension, this.startingMaterial);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_MonomerSet#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer_MonomerSet withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstancePolymer_MonomerSet(this.ratioType, this.id, value, this.extension, this.startingMaterial);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_MonomerSet#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_MonomerSet withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstancePolymer_MonomerSet(this.ratioType, this.id, this.modifierExtension, newValue, this.startingMaterial);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_MonomerSet#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer_MonomerSet withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstancePolymer_MonomerSet(this.ratioType, this.id, this.modifierExtension, value, this.startingMaterial);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_MonomerSet#startingMaterial() startingMaterial} attribute.
   * @param value The value for startingMaterial
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_MonomerSet withStartingMaterial(List<SubstancePolymer_StartingMaterial> value) {
    @Nullable List<SubstancePolymer_StartingMaterial> newValue = Objects.requireNonNull(value, "startingMaterial");
    if (this.startingMaterial == newValue) return this;
    return new ImmutableSubstancePolymer_MonomerSet(this.ratioType, this.id, this.modifierExtension, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_MonomerSet#startingMaterial() startingMaterial} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for startingMaterial
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer_MonomerSet withStartingMaterial(Optional<? extends List<SubstancePolymer_StartingMaterial>> optional) {
    @Nullable List<SubstancePolymer_StartingMaterial> value = optional.orElse(null);
    if (this.startingMaterial == value) return this;
    return new ImmutableSubstancePolymer_MonomerSet(this.ratioType, this.id, this.modifierExtension, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstancePolymer_MonomerSet} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstancePolymer_MonomerSet
        && equalTo((ImmutableSubstancePolymer_MonomerSet) another);
  }

  private boolean equalTo(ImmutableSubstancePolymer_MonomerSet another) {
    return Objects.equals(ratioType, another.ratioType)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(startingMaterial, another.startingMaterial);
  }

  /**
   * Computes a hash code from attributes: {@code ratioType}, {@code id}, {@code modifierExtension}, {@code extension}, {@code startingMaterial}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(ratioType);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(startingMaterial);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstancePolymer_MonomerSet} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstancePolymer_MonomerSet{");
    if (ratioType != null) {
      builder.append("ratioType=").append(ratioType);
    }
    if (id != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (startingMaterial != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("startingMaterial=").append(startingMaterial);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstancePolymer_MonomerSet", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstancePolymer_MonomerSet {
    @Nullable Optional<CodeableConcept> ratioType = Optional.empty();
    boolean ratioTypeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<SubstancePolymer_StartingMaterial>> startingMaterial = Optional.empty();
    boolean startingMaterialIsSet;
    @JsonProperty("ratioType")
    public void setRatioType(Optional<CodeableConcept> ratioType) {
      this.ratioType = ratioType;
      this.ratioTypeIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
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
    @JsonProperty("startingMaterial")
    public void setStartingMaterial(Optional<List<SubstancePolymer_StartingMaterial>> startingMaterial) {
      this.startingMaterial = startingMaterial;
      this.startingMaterialIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> ratioType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SubstancePolymer_StartingMaterial>> startingMaterial() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubstancePolymer_MonomerSet fromJson(Json json) {
    ImmutableSubstancePolymer_MonomerSet.Builder builder = ImmutableSubstancePolymer_MonomerSet.builder();
    if (json.ratioTypeIsSet) {
      builder.ratioType(json.ratioType);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.startingMaterialIsSet) {
      builder.startingMaterial(json.startingMaterial);
    }
    return (ImmutableSubstancePolymer_MonomerSet) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstancePolymer_MonomerSet} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstancePolymer_MonomerSet instance
   */
  public static SubstancePolymer_MonomerSet copyOf(SubstancePolymer_MonomerSet instance) {
    if (instance instanceof ImmutableSubstancePolymer_MonomerSet) {
      return (ImmutableSubstancePolymer_MonomerSet) instance;
    }
    return ImmutableSubstancePolymer_MonomerSet.builder()
        .ratioType(instance.ratioType())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .startingMaterial(instance.startingMaterial())
        .build();
  }

  /**
   * Creates a builder for {@link SubstancePolymer_MonomerSet SubstancePolymer_MonomerSet}.
   * <pre>
   * ImmutableSubstancePolymer_MonomerSet.builder()
   *    .ratioType(com.fhir.CodeableConcept) // optional {@link SubstancePolymer_MonomerSet#ratioType() ratioType}
   *    .id(String) // optional {@link SubstancePolymer_MonomerSet#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstancePolymer_MonomerSet#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstancePolymer_MonomerSet#extension() extension}
   *    .startingMaterial(List&amp;lt;com.fhir.SubstancePolymer_StartingMaterial&amp;gt;) // optional {@link SubstancePolymer_MonomerSet#startingMaterial() startingMaterial}
   *    .build();
   * </pre>
   * @return A new SubstancePolymer_MonomerSet builder
   */
  public static ImmutableSubstancePolymer_MonomerSet.Builder builder() {
    return new ImmutableSubstancePolymer_MonomerSet.Builder();
  }

  /**
   * Builds instances of type {@link SubstancePolymer_MonomerSet SubstancePolymer_MonomerSet}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstancePolymer_MonomerSet", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_RATIO_TYPE = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_STARTING_MATERIAL = 0x10L;
    private long optBits;

    private @Nullable CodeableConcept ratioType;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable List<SubstancePolymer_StartingMaterial> startingMaterial;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_MonomerSet#ratioType() ratioType} to ratioType.
     * @param ratioType The value for ratioType
     * @return {@code this} builder for chained invocation
     */
    public final Builder ratioType(CodeableConcept ratioType) {
      checkNotIsSet(ratioTypeIsSet(), "ratioType");
      this.ratioType = Objects.requireNonNull(ratioType, "ratioType");
      optBits |= OPT_BIT_RATIO_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_MonomerSet#ratioType() ratioType} to ratioType.
     * @param ratioType The value for ratioType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ratioType")
    public final Builder ratioType(Optional<? extends CodeableConcept> ratioType) {
      checkNotIsSet(ratioTypeIsSet(), "ratioType");
      this.ratioType = ratioType.orElse(null);
      optBits |= OPT_BIT_RATIO_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_MonomerSet#id() id} to id.
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
     * Initializes the optional value {@link SubstancePolymer_MonomerSet#id() id} to id.
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
     * Initializes the optional value {@link SubstancePolymer_MonomerSet#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstancePolymer_MonomerSet#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstancePolymer_MonomerSet#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstancePolymer_MonomerSet#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstancePolymer_MonomerSet#startingMaterial() startingMaterial} to startingMaterial.
     * @param startingMaterial The value for startingMaterial
     * @return {@code this} builder for chained invocation
     */
    public final Builder startingMaterial(List<SubstancePolymer_StartingMaterial> startingMaterial) {
      checkNotIsSet(startingMaterialIsSet(), "startingMaterial");
      this.startingMaterial = Objects.requireNonNull(startingMaterial, "startingMaterial");
      optBits |= OPT_BIT_STARTING_MATERIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_MonomerSet#startingMaterial() startingMaterial} to startingMaterial.
     * @param startingMaterial The value for startingMaterial
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("startingMaterial")
    public final Builder startingMaterial(Optional<? extends List<SubstancePolymer_StartingMaterial>> startingMaterial) {
      checkNotIsSet(startingMaterialIsSet(), "startingMaterial");
      this.startingMaterial = startingMaterial.orElse(null);
      optBits |= OPT_BIT_STARTING_MATERIAL;
      return this;
    }

    /**
     * Builds a new {@link SubstancePolymer_MonomerSet SubstancePolymer_MonomerSet}.
     * @return An immutable instance of SubstancePolymer_MonomerSet
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstancePolymer_MonomerSet build() {
      return new ImmutableSubstancePolymer_MonomerSet(ratioType, id, modifierExtension, extension, startingMaterial);
    }

    private boolean ratioTypeIsSet() {
      return (optBits & OPT_BIT_RATIO_TYPE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean startingMaterialIsSet() {
      return (optBits & OPT_BIT_STARTING_MATERIAL) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstancePolymer_MonomerSet is strict, attribute is already set: ".concat(name));
    }
  }
}

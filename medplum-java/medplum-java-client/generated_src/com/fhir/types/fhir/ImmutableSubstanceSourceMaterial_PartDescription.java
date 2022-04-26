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
 * Immutable implementation of {@link SubstanceSourceMaterial_PartDescription}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceSourceMaterial_PartDescription.builder()}.
 */
@Generated(from = "SubstanceSourceMaterial_PartDescription", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceSourceMaterial_PartDescription
    implements SubstanceSourceMaterial_PartDescription {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept part;
  private final @Nullable CodeableConcept partLocation;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;

  private ImmutableSubstanceSourceMaterial_PartDescription(
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept part,
      @Nullable CodeableConcept partLocation,
      @Nullable List<Extension> extension,
      @Nullable String id) {
    this.modifierExtension = modifierExtension;
    this.part = part;
    this.partLocation = partLocation;
    this.extension = extension;
    this.id = id;
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
   * @return The value of the {@code part} attribute
   */
  @JsonProperty("part")
  @Override
  public Optional<CodeableConcept> part() {
    return Optional.ofNullable(part);
  }

  /**
   * @return The value of the {@code partLocation} attribute
   */
  @JsonProperty("partLocation")
  @Override
  public Optional<CodeableConcept> partLocation() {
    return Optional.ofNullable(partLocation);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_PartDescription#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_PartDescription withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_PartDescription(newValue, this.part, this.partLocation, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_PartDescription#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial_PartDescription withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceSourceMaterial_PartDescription(value, this.part, this.partLocation, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_PartDescription#part() part} attribute.
   * @param value The value for part
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_PartDescription withPart(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "part");
    if (this.part == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_PartDescription(this.modifierExtension, newValue, this.partLocation, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_PartDescription#part() part} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for part
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial_PartDescription withPart(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.part == value) return this;
    return new ImmutableSubstanceSourceMaterial_PartDescription(this.modifierExtension, value, this.partLocation, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_PartDescription#partLocation() partLocation} attribute.
   * @param value The value for partLocation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_PartDescription withPartLocation(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "partLocation");
    if (this.partLocation == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_PartDescription(this.modifierExtension, this.part, newValue, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_PartDescription#partLocation() partLocation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partLocation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial_PartDescription withPartLocation(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.partLocation == value) return this;
    return new ImmutableSubstanceSourceMaterial_PartDescription(this.modifierExtension, this.part, value, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_PartDescription#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_PartDescription withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_PartDescription(this.modifierExtension, this.part, this.partLocation, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_PartDescription#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial_PartDescription withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceSourceMaterial_PartDescription(this.modifierExtension, this.part, this.partLocation, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_PartDescription#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_PartDescription withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstanceSourceMaterial_PartDescription(this.modifierExtension, this.part, this.partLocation, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_PartDescription#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_PartDescription withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstanceSourceMaterial_PartDescription(this.modifierExtension, this.part, this.partLocation, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceSourceMaterial_PartDescription} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceSourceMaterial_PartDescription
        && equalTo((ImmutableSubstanceSourceMaterial_PartDescription) another);
  }

  private boolean equalTo(ImmutableSubstanceSourceMaterial_PartDescription another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(part, another.part)
        && Objects.equals(partLocation, another.partLocation)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code part}, {@code partLocation}, {@code extension}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(part);
    h += (h << 5) + Objects.hashCode(partLocation);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceSourceMaterial_PartDescription} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceSourceMaterial_PartDescription{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (part != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("part=").append(part);
    }
    if (partLocation != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("partLocation=").append(partLocation);
    }
    if (extension != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstanceSourceMaterial_PartDescription", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceSourceMaterial_PartDescription {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> part = Optional.empty();
    boolean partIsSet;
    @Nullable Optional<CodeableConcept> partLocation = Optional.empty();
    boolean partLocationIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("part")
    public void setPart(Optional<CodeableConcept> part) {
      this.part = part;
      this.partIsSet = true;
    }
    @JsonProperty("partLocation")
    public void setPartLocation(Optional<CodeableConcept> partLocation) {
      this.partLocation = partLocation;
      this.partLocationIsSet = true;
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
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> part() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> partLocation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubstanceSourceMaterial_PartDescription fromJson(Json json) {
    ImmutableSubstanceSourceMaterial_PartDescription.Builder builder = ImmutableSubstanceSourceMaterial_PartDescription.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.partIsSet) {
      builder.part(json.part);
    }
    if (json.partLocationIsSet) {
      builder.partLocation(json.partLocation);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableSubstanceSourceMaterial_PartDescription) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceSourceMaterial_PartDescription} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceSourceMaterial_PartDescription instance
   */
  public static SubstanceSourceMaterial_PartDescription copyOf(SubstanceSourceMaterial_PartDescription instance) {
    if (instance instanceof ImmutableSubstanceSourceMaterial_PartDescription) {
      return (ImmutableSubstanceSourceMaterial_PartDescription) instance;
    }
    return ImmutableSubstanceSourceMaterial_PartDescription.builder()
        .modifierExtension(instance.modifierExtension())
        .part(instance.part())
        .partLocation(instance.partLocation())
        .extension(instance.extension())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceSourceMaterial_PartDescription SubstanceSourceMaterial_PartDescription}.
   * <pre>
   * ImmutableSubstanceSourceMaterial_PartDescription.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSourceMaterial_PartDescription#modifierExtension() modifierExtension}
   *    .part(com.fhir.types.fhir.CodeableConcept) // optional {@link SubstanceSourceMaterial_PartDescription#part() part}
   *    .partLocation(com.fhir.types.fhir.CodeableConcept) // optional {@link SubstanceSourceMaterial_PartDescription#partLocation() partLocation}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSourceMaterial_PartDescription#extension() extension}
   *    .id(String) // optional {@link SubstanceSourceMaterial_PartDescription#id() id}
   *    .build();
   * </pre>
   * @return A new SubstanceSourceMaterial_PartDescription builder
   */
  public static ImmutableSubstanceSourceMaterial_PartDescription.Builder builder() {
    return new ImmutableSubstanceSourceMaterial_PartDescription.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceSourceMaterial_PartDescription SubstanceSourceMaterial_PartDescription}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstanceSourceMaterial_PartDescription", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_PART = 0x2L;
    private static final long OPT_BIT_PART_LOCATION = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept part;
    private @Nullable CodeableConcept partLocation;
    private @Nullable List<Extension> extension;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_PartDescription#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_PartDescription#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_PartDescription#part() part} to part.
     * @param part The value for part
     * @return {@code this} builder for chained invocation
     */
    public final Builder part(CodeableConcept part) {
      checkNotIsSet(partIsSet(), "part");
      this.part = Objects.requireNonNull(part, "part");
      optBits |= OPT_BIT_PART;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_PartDescription#part() part} to part.
     * @param part The value for part
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("part")
    public final Builder part(Optional<? extends CodeableConcept> part) {
      checkNotIsSet(partIsSet(), "part");
      this.part = part.orElse(null);
      optBits |= OPT_BIT_PART;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_PartDescription#partLocation() partLocation} to partLocation.
     * @param partLocation The value for partLocation
     * @return {@code this} builder for chained invocation
     */
    public final Builder partLocation(CodeableConcept partLocation) {
      checkNotIsSet(partLocationIsSet(), "partLocation");
      this.partLocation = Objects.requireNonNull(partLocation, "partLocation");
      optBits |= OPT_BIT_PART_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_PartDescription#partLocation() partLocation} to partLocation.
     * @param partLocation The value for partLocation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("partLocation")
    public final Builder partLocation(Optional<? extends CodeableConcept> partLocation) {
      checkNotIsSet(partLocationIsSet(), "partLocation");
      this.partLocation = partLocation.orElse(null);
      optBits |= OPT_BIT_PART_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_PartDescription#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_PartDescription#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_PartDescription#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_PartDescription#id() id} to id.
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
     * Builds a new {@link SubstanceSourceMaterial_PartDescription SubstanceSourceMaterial_PartDescription}.
     * @return An immutable instance of SubstanceSourceMaterial_PartDescription
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceSourceMaterial_PartDescription build() {
      return new ImmutableSubstanceSourceMaterial_PartDescription(modifierExtension, part, partLocation, extension, id);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean partIsSet() {
      return (optBits & OPT_BIT_PART) != 0;
    }

    private boolean partLocationIsSet() {
      return (optBits & OPT_BIT_PART_LOCATION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceSourceMaterial_PartDescription is strict, attribute is already set: ".concat(name));
    }
  }
}

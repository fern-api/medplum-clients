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
 * Immutable implementation of {@link MedicationKnowledge_Monograph}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicationKnowledge_Monograph.builder()}.
 */
@Generated(from = "MedicationKnowledge_Monograph", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicationKnowledge_Monograph
    implements MedicationKnowledge_Monograph {
  private final @Nullable CodeableConcept type;
  private final @Nullable Reference source;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;

  private ImmutableMedicationKnowledge_Monograph(
      @Nullable CodeableConcept type,
      @Nullable Reference source,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension) {
    this.type = type;
    this.source = source;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code source} attribute
   */
  @JsonProperty("source")
  @Override
  public Optional<Reference> source() {
    return Optional.ofNullable(source);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Monograph#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Monograph withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableMedicationKnowledge_Monograph(newValue, this.source, this.id, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Monograph#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_Monograph withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableMedicationKnowledge_Monograph(value, this.source, this.id, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Monograph#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Monograph withSource(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "source");
    if (this.source == newValue) return this;
    return new ImmutableMedicationKnowledge_Monograph(this.type, newValue, this.id, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Monograph#source() source} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_Monograph withSource(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.source == value) return this;
    return new ImmutableMedicationKnowledge_Monograph(this.type, value, this.id, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Monograph#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Monograph withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicationKnowledge_Monograph(this.type, this.source, newValue, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Monograph#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Monograph withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicationKnowledge_Monograph(this.type, this.source, value, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Monograph#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Monograph withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicationKnowledge_Monograph(this.type, this.source, this.id, newValue, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Monograph#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_Monograph withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicationKnowledge_Monograph(this.type, this.source, this.id, value, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Monograph#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Monograph withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicationKnowledge_Monograph(this.type, this.source, this.id, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Monograph#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_Monograph withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicationKnowledge_Monograph(this.type, this.source, this.id, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicationKnowledge_Monograph} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicationKnowledge_Monograph
        && equalTo((ImmutableMedicationKnowledge_Monograph) another);
  }

  private boolean equalTo(ImmutableMedicationKnowledge_Monograph another) {
    return Objects.equals(type, another.type)
        && Objects.equals(source, another.source)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code source}, {@code id}, {@code modifierExtension}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(source);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicationKnowledge_Monograph} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicationKnowledge_Monograph{");
    if (type != null) {
      builder.append("type=").append(type);
    }
    if (source != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("source=").append(source);
    }
    if (id != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicationKnowledge_Monograph", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicationKnowledge_Monograph {
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Reference> source = Optional.empty();
    boolean sourceIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("source")
    public void setSource(Optional<Reference> source) {
      this.source = source;
      this.sourceIsSet = true;
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
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> source() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
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
  static ImmutableMedicationKnowledge_Monograph fromJson(Json json) {
    ImmutableMedicationKnowledge_Monograph.Builder builder = ImmutableMedicationKnowledge_Monograph.builder();
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.sourceIsSet) {
      builder.source(json.source);
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
    return (ImmutableMedicationKnowledge_Monograph) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicationKnowledge_Monograph} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicationKnowledge_Monograph instance
   */
  public static MedicationKnowledge_Monograph copyOf(MedicationKnowledge_Monograph instance) {
    if (instance instanceof ImmutableMedicationKnowledge_Monograph) {
      return (ImmutableMedicationKnowledge_Monograph) instance;
    }
    return ImmutableMedicationKnowledge_Monograph.builder()
        .type(instance.type())
        .source(instance.source())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link MedicationKnowledge_Monograph MedicationKnowledge_Monograph}.
   * <pre>
   * ImmutableMedicationKnowledge_Monograph.builder()
   *    .type(com.fhir.types.fhir.CodeableConcept) // optional {@link MedicationKnowledge_Monograph#type() type}
   *    .source(com.fhir.types.fhir.Reference) // optional {@link MedicationKnowledge_Monograph#source() source}
   *    .id(String) // optional {@link MedicationKnowledge_Monograph#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicationKnowledge_Monograph#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicationKnowledge_Monograph#extension() extension}
   *    .build();
   * </pre>
   * @return A new MedicationKnowledge_Monograph builder
   */
  public static ImmutableMedicationKnowledge_Monograph.Builder builder() {
    return new ImmutableMedicationKnowledge_Monograph.Builder();
  }

  /**
   * Builds instances of type {@link MedicationKnowledge_Monograph MedicationKnowledge_Monograph}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicationKnowledge_Monograph", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_SOURCE = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private long optBits;

    private @Nullable CodeableConcept type;
    private @Nullable Reference source;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Monograph#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Monograph#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Monograph#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    public final Builder source(Reference source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = Objects.requireNonNull(source, "source");
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Monograph#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("source")
    public final Builder source(Optional<? extends Reference> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = source.orElse(null);
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Monograph#id() id} to id.
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
     * Initializes the optional value {@link MedicationKnowledge_Monograph#id() id} to id.
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
     * Initializes the optional value {@link MedicationKnowledge_Monograph#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationKnowledge_Monograph#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationKnowledge_Monograph#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationKnowledge_Monograph#extension() extension} to extension.
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
     * Builds a new {@link MedicationKnowledge_Monograph MedicationKnowledge_Monograph}.
     * @return An immutable instance of MedicationKnowledge_Monograph
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicationKnowledge_Monograph build() {
      return new ImmutableMedicationKnowledge_Monograph(type, source, id, modifierExtension, extension);
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
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

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicationKnowledge_Monograph is strict, attribute is already set: ".concat(name));
    }
  }
}

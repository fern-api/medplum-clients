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
 * Immutable implementation of {@link SubstanceReferenceInformation_GeneElement}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceReferenceInformation_GeneElement.builder()}.
 */
@Generated(from = "SubstanceReferenceInformation_GeneElement", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceReferenceInformation_GeneElement
    implements SubstanceReferenceInformation_GeneElement {
  private final @Nullable CodeableConcept type;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Reference> source;
  private final @Nullable List<Extension> extension;
  private final @Nullable Identifier element;

  private ImmutableSubstanceReferenceInformation_GeneElement(
      @Nullable CodeableConcept type,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Reference> source,
      @Nullable List<Extension> extension,
      @Nullable Identifier element) {
    this.type = type;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.source = source;
    this.extension = extension;
    this.element = element;
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
   * @return The value of the {@code source} attribute
   */
  @JsonProperty("source")
  @Override
  public Optional<List<Reference>> source() {
    return Optional.ofNullable(source);
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
   * @return The value of the {@code element} attribute
   */
  @JsonProperty("element")
  @Override
  public Optional<Identifier> element() {
    return Optional.ofNullable(element);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_GeneElement#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_GeneElement withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableSubstanceReferenceInformation_GeneElement(newValue, this.id, this.modifierExtension, this.source, this.extension, this.element);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_GeneElement#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation_GeneElement withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableSubstanceReferenceInformation_GeneElement(value, this.id, this.modifierExtension, this.source, this.extension, this.element);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_GeneElement#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_GeneElement withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstanceReferenceInformation_GeneElement(this.type, newValue, this.modifierExtension, this.source, this.extension, this.element);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_GeneElement#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_GeneElement withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstanceReferenceInformation_GeneElement(this.type, value, this.modifierExtension, this.source, this.extension, this.element);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_GeneElement#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_GeneElement withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceReferenceInformation_GeneElement(this.type, this.id, newValue, this.source, this.extension, this.element);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_GeneElement#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation_GeneElement withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceReferenceInformation_GeneElement(this.type, this.id, value, this.source, this.extension, this.element);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_GeneElement#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_GeneElement withSource(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "source");
    if (this.source == newValue) return this;
    return new ImmutableSubstanceReferenceInformation_GeneElement(this.type, this.id, this.modifierExtension, newValue, this.extension, this.element);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_GeneElement#source() source} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation_GeneElement withSource(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.source == value) return this;
    return new ImmutableSubstanceReferenceInformation_GeneElement(this.type, this.id, this.modifierExtension, value, this.extension, this.element);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_GeneElement#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_GeneElement withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceReferenceInformation_GeneElement(this.type, this.id, this.modifierExtension, this.source, newValue, this.element);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_GeneElement#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation_GeneElement withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceReferenceInformation_GeneElement(this.type, this.id, this.modifierExtension, this.source, value, this.element);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_GeneElement#element() element} attribute.
   * @param value The value for element
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_GeneElement withElement(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "element");
    if (this.element == newValue) return this;
    return new ImmutableSubstanceReferenceInformation_GeneElement(this.type, this.id, this.modifierExtension, this.source, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_GeneElement#element() element} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for element
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation_GeneElement withElement(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.element == value) return this;
    return new ImmutableSubstanceReferenceInformation_GeneElement(this.type, this.id, this.modifierExtension, this.source, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceReferenceInformation_GeneElement} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceReferenceInformation_GeneElement
        && equalTo((ImmutableSubstanceReferenceInformation_GeneElement) another);
  }

  private boolean equalTo(ImmutableSubstanceReferenceInformation_GeneElement another) {
    return Objects.equals(type, another.type)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(source, another.source)
        && Objects.equals(extension, another.extension)
        && Objects.equals(element, another.element);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code id}, {@code modifierExtension}, {@code source}, {@code extension}, {@code element}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(source);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(element);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceReferenceInformation_GeneElement} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceReferenceInformation_GeneElement{");
    if (type != null) {
      builder.append("type=").append(type);
    }
    if (id != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (source != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("source=").append(source);
    }
    if (extension != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (element != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("element=").append(element);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstanceReferenceInformation_GeneElement", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceReferenceInformation_GeneElement {
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Reference>> source = Optional.empty();
    boolean sourceIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Identifier> element = Optional.empty();
    boolean elementIsSet;
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
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
    @JsonProperty("source")
    public void setSource(Optional<List<Reference>> source) {
      this.source = source;
      this.sourceIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("element")
    public void setElement(Optional<Identifier> element) {
      this.element = element;
      this.elementIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> source() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> element() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubstanceReferenceInformation_GeneElement fromJson(Json json) {
    ImmutableSubstanceReferenceInformation_GeneElement.Builder builder = ImmutableSubstanceReferenceInformation_GeneElement.builder();
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.sourceIsSet) {
      builder.source(json.source);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.elementIsSet) {
      builder.element(json.element);
    }
    return (ImmutableSubstanceReferenceInformation_GeneElement) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceReferenceInformation_GeneElement} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceReferenceInformation_GeneElement instance
   */
  public static SubstanceReferenceInformation_GeneElement copyOf(SubstanceReferenceInformation_GeneElement instance) {
    if (instance instanceof ImmutableSubstanceReferenceInformation_GeneElement) {
      return (ImmutableSubstanceReferenceInformation_GeneElement) instance;
    }
    return ImmutableSubstanceReferenceInformation_GeneElement.builder()
        .type(instance.type())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .source(instance.source())
        .extension(instance.extension())
        .element(instance.element())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceReferenceInformation_GeneElement SubstanceReferenceInformation_GeneElement}.
   * <pre>
   * ImmutableSubstanceReferenceInformation_GeneElement.builder()
   *    .type(com.fhir.types.fhir.CodeableConcept) // optional {@link SubstanceReferenceInformation_GeneElement#type() type}
   *    .id(String) // optional {@link SubstanceReferenceInformation_GeneElement#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SubstanceReferenceInformation_GeneElement#modifierExtension() modifierExtension}
   *    .source(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link SubstanceReferenceInformation_GeneElement#source() source}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SubstanceReferenceInformation_GeneElement#extension() extension}
   *    .element(com.fhir.types.fhir.Identifier) // optional {@link SubstanceReferenceInformation_GeneElement#element() element}
   *    .build();
   * </pre>
   * @return A new SubstanceReferenceInformation_GeneElement builder
   */
  public static ImmutableSubstanceReferenceInformation_GeneElement.Builder builder() {
    return new ImmutableSubstanceReferenceInformation_GeneElement.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceReferenceInformation_GeneElement SubstanceReferenceInformation_GeneElement}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstanceReferenceInformation_GeneElement", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_SOURCE = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_ELEMENT = 0x20L;
    private long optBits;

    private @Nullable CodeableConcept type;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Reference> source;
    private @Nullable List<Extension> extension;
    private @Nullable Identifier element;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation_GeneElement#type() type} to type.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_GeneElement#type() type} to type.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_GeneElement#id() id} to id.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_GeneElement#id() id} to id.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_GeneElement#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_GeneElement#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_GeneElement#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    public final Builder source(List<Reference> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = Objects.requireNonNull(source, "source");
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation_GeneElement#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("source")
    public final Builder source(Optional<? extends List<Reference>> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = source.orElse(null);
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation_GeneElement#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_GeneElement#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_GeneElement#element() element} to element.
     * @param element The value for element
     * @return {@code this} builder for chained invocation
     */
    public final Builder element(Identifier element) {
      checkNotIsSet(elementIsSet(), "element");
      this.element = Objects.requireNonNull(element, "element");
      optBits |= OPT_BIT_ELEMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation_GeneElement#element() element} to element.
     * @param element The value for element
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("element")
    public final Builder element(Optional<? extends Identifier> element) {
      checkNotIsSet(elementIsSet(), "element");
      this.element = element.orElse(null);
      optBits |= OPT_BIT_ELEMENT;
      return this;
    }

    /**
     * Builds a new {@link SubstanceReferenceInformation_GeneElement SubstanceReferenceInformation_GeneElement}.
     * @return An immutable instance of SubstanceReferenceInformation_GeneElement
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceReferenceInformation_GeneElement build() {
      return new ImmutableSubstanceReferenceInformation_GeneElement(type, id, modifierExtension, source, extension, element);
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean elementIsSet() {
      return (optBits & OPT_BIT_ELEMENT) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceReferenceInformation_GeneElement is strict, attribute is already set: ".concat(name));
    }
  }
}

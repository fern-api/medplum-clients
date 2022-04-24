package com.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Contract_SecurityLabel}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableContract_SecurityLabel.builder()}.
 */
@Generated(from = "Contract_SecurityLabel", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableContract_SecurityLabel implements Contract_SecurityLabel {
  private final Coding classification;
  private final @Nullable List<Coding> category;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Coding> control;
  private final @Nullable List<com.fhir.unsignedInt> number;
  private final @Nullable String id;

  private ImmutableContract_SecurityLabel(
      Coding classification,
      @Nullable List<Coding> category,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable List<Coding> control,
      @Nullable List<com.fhir.unsignedInt> number,
      @Nullable String id) {
    this.classification = classification;
    this.category = category;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.control = control;
    this.number = number;
    this.id = id;
  }

  /**
   * @return The value of the {@code classification} attribute
   */
  @JsonProperty("classification")
  @Override
  public Coding classification() {
    return classification;
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public Optional<List<Coding>> category() {
    return Optional.ofNullable(category);
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
   * @return The value of the {@code control} attribute
   */
  @JsonProperty("control")
  @Override
  public Optional<List<Coding>> control() {
    return Optional.ofNullable(control);
  }

  /**
   * @return The value of the {@code number} attribute
   */
  @JsonProperty("number")
  @Override
  public Optional<List<com.fhir.unsignedInt>> number() {
    return Optional.ofNullable(number);
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
   * Copy the current immutable object by setting a value for the {@link Contract_SecurityLabel#classification() classification} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for classification
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableContract_SecurityLabel withClassification(Coding value) {
    if (this.classification == value) return this;
    Coding newValue = Objects.requireNonNull(value, "classification");
    return new ImmutableContract_SecurityLabel(
        newValue,
        this.category,
        this.modifierExtension,
        this.extension,
        this.control,
        this.number,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_SecurityLabel#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_SecurityLabel withCategory(List<Coding> value) {
    @Nullable List<Coding> newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableContract_SecurityLabel(
        this.classification,
        newValue,
        this.modifierExtension,
        this.extension,
        this.control,
        this.number,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_SecurityLabel#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_SecurityLabel withCategory(Optional<? extends List<Coding>> optional) {
    @Nullable List<Coding> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableContract_SecurityLabel(
        this.classification,
        value,
        this.modifierExtension,
        this.extension,
        this.control,
        this.number,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_SecurityLabel#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_SecurityLabel withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableContract_SecurityLabel(
        this.classification,
        this.category,
        newValue,
        this.extension,
        this.control,
        this.number,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_SecurityLabel#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_SecurityLabel withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableContract_SecurityLabel(this.classification, this.category, value, this.extension, this.control, this.number, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_SecurityLabel#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_SecurityLabel withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableContract_SecurityLabel(
        this.classification,
        this.category,
        this.modifierExtension,
        newValue,
        this.control,
        this.number,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_SecurityLabel#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_SecurityLabel withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableContract_SecurityLabel(
        this.classification,
        this.category,
        this.modifierExtension,
        value,
        this.control,
        this.number,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_SecurityLabel#control() control} attribute.
   * @param value The value for control
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_SecurityLabel withControl(List<Coding> value) {
    @Nullable List<Coding> newValue = Objects.requireNonNull(value, "control");
    if (this.control == newValue) return this;
    return new ImmutableContract_SecurityLabel(
        this.classification,
        this.category,
        this.modifierExtension,
        this.extension,
        newValue,
        this.number,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_SecurityLabel#control() control} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for control
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_SecurityLabel withControl(Optional<? extends List<Coding>> optional) {
    @Nullable List<Coding> value = optional.orElse(null);
    if (this.control == value) return this;
    return new ImmutableContract_SecurityLabel(
        this.classification,
        this.category,
        this.modifierExtension,
        this.extension,
        value,
        this.number,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_SecurityLabel#number() number} attribute.
   * @param value The value for number
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_SecurityLabel withNumber(List<com.fhir.unsignedInt> value) {
    @Nullable List<com.fhir.unsignedInt> newValue = Objects.requireNonNull(value, "number");
    if (this.number == newValue) return this;
    return new ImmutableContract_SecurityLabel(
        this.classification,
        this.category,
        this.modifierExtension,
        this.extension,
        this.control,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_SecurityLabel#number() number} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for number
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_SecurityLabel withNumber(Optional<? extends List<com.fhir.unsignedInt>> optional) {
    @Nullable List<com.fhir.unsignedInt> value = optional.orElse(null);
    if (this.number == value) return this;
    return new ImmutableContract_SecurityLabel(
        this.classification,
        this.category,
        this.modifierExtension,
        this.extension,
        this.control,
        value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_SecurityLabel#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_SecurityLabel withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableContract_SecurityLabel(
        this.classification,
        this.category,
        this.modifierExtension,
        this.extension,
        this.control,
        this.number,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_SecurityLabel#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_SecurityLabel withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableContract_SecurityLabel(
        this.classification,
        this.category,
        this.modifierExtension,
        this.extension,
        this.control,
        this.number,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableContract_SecurityLabel} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableContract_SecurityLabel
        && equalTo((ImmutableContract_SecurityLabel) another);
  }

  private boolean equalTo(ImmutableContract_SecurityLabel another) {
    return classification.equals(another.classification)
        && Objects.equals(category, another.category)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(control, another.control)
        && Objects.equals(number, another.number)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code classification}, {@code category}, {@code modifierExtension}, {@code extension}, {@code control}, {@code number}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + classification.hashCode();
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(control);
    h += (h << 5) + Objects.hashCode(number);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code Contract_SecurityLabel} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Contract_SecurityLabel{");
    builder.append("classification=").append(classification);
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (control != null) {
      builder.append(", ");
      builder.append("control=").append(control);
    }
    if (number != null) {
      builder.append(", ");
      builder.append("number=").append(number);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Contract_SecurityLabel", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Contract_SecurityLabel {
    @Nullable Coding classification;
    @Nullable Optional<List<Coding>> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Coding>> control = Optional.empty();
    boolean controlIsSet;
    @Nullable Optional<List<com.fhir.unsignedInt>> number = Optional.empty();
    boolean numberIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("classification")
    public void setClassification(Coding classification) {
      this.classification = classification;
    }
    @JsonProperty("category")
    public void setCategory(Optional<List<Coding>> category) {
      this.category = category;
      this.categoryIsSet = true;
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
    @JsonProperty("control")
    public void setControl(Optional<List<Coding>> control) {
      this.control = control;
      this.controlIsSet = true;
    }
    @JsonProperty("number")
    public void setNumber(Optional<List<com.fhir.unsignedInt>> number) {
      this.number = number;
      this.numberIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Coding classification() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Coding>> category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Coding>> control() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<com.fhir.unsignedInt>> number() { throw new UnsupportedOperationException(); }
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
  static ImmutableContract_SecurityLabel fromJson(Json json) {
    ImmutableContract_SecurityLabel.Builder builder = ((ImmutableContract_SecurityLabel.Builder) ImmutableContract_SecurityLabel.builder());
    if (json.classification != null) {
      builder.classification(json.classification);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.controlIsSet) {
      builder.control(json.control);
    }
    if (json.numberIsSet) {
      builder.number(json.number);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableContract_SecurityLabel) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Contract_SecurityLabel} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Contract_SecurityLabel instance
   */
  public static Contract_SecurityLabel copyOf(Contract_SecurityLabel instance) {
    if (instance instanceof ImmutableContract_SecurityLabel) {
      return (ImmutableContract_SecurityLabel) instance;
    }
    return ((ImmutableContract_SecurityLabel.Builder) ImmutableContract_SecurityLabel.builder())
        .classification(instance.classification())
        .category(instance.category())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .control(instance.control())
        .number(instance.number())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link Contract_SecurityLabel Contract_SecurityLabel}.
   * <pre>
   * ImmutableContract_SecurityLabel.builder()
   *    .classification(com.fhir.Coding) // required {@link Contract_SecurityLabel#classification() classification}
   *    .category(List&amp;lt;com.fhir.Coding&amp;gt;) // optional {@link Contract_SecurityLabel#category() category}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Contract_SecurityLabel#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Contract_SecurityLabel#extension() extension}
   *    .control(List&amp;lt;com.fhir.Coding&amp;gt;) // optional {@link Contract_SecurityLabel#control() control}
   *    .number(List&amp;lt;com.fhir.unsignedInt&amp;gt;) // optional {@link Contract_SecurityLabel#number() number}
   *    .id(String) // optional {@link Contract_SecurityLabel#id() id}
   *    .build();
   * </pre>
   * @return A new Contract_SecurityLabel builder
   */
  public static ClassificationBuildStage builder() {
    return new ImmutableContract_SecurityLabel.Builder();
  }

  /**
   * Builds instances of type {@link Contract_SecurityLabel Contract_SecurityLabel}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Contract_SecurityLabel", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ClassificationBuildStage, BuildFinal {
    private static final long INIT_BIT_CLASSIFICATION = 0x1L;
    private static final long OPT_BIT_CATEGORY = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_CONTROL = 0x8L;
    private static final long OPT_BIT_NUMBER = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Coding classification;
    private @Nullable List<Coding> category;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable List<Coding> control;
    private @Nullable List<com.fhir.unsignedInt> number;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link Contract_SecurityLabel#classification() classification} attribute.
     * @param classification The value for classification 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("classification")
    public final Builder classification(Coding classification) {
      checkNotIsSet(classificationIsSet(), "classification");
      this.classification = Objects.requireNonNull(classification, "classification");
      initBits &= ~INIT_BIT_CLASSIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_SecurityLabel#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(List<Coding> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_SecurityLabel#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(Optional<? extends List<Coding>> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_SecurityLabel#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Contract_SecurityLabel#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Contract_SecurityLabel#extension() extension} to extension.
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
     * Initializes the optional value {@link Contract_SecurityLabel#extension() extension} to extension.
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
     * Initializes the optional value {@link Contract_SecurityLabel#control() control} to control.
     * @param control The value for control
     * @return {@code this} builder for chained invocation
     */
    public final Builder control(List<Coding> control) {
      checkNotIsSet(controlIsSet(), "control");
      this.control = Objects.requireNonNull(control, "control");
      optBits |= OPT_BIT_CONTROL;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_SecurityLabel#control() control} to control.
     * @param control The value for control
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("control")
    public final Builder control(Optional<? extends List<Coding>> control) {
      checkNotIsSet(controlIsSet(), "control");
      this.control = control.orElse(null);
      optBits |= OPT_BIT_CONTROL;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_SecurityLabel#number() number} to number.
     * @param number The value for number
     * @return {@code this} builder for chained invocation
     */
    public final Builder number(List<com.fhir.unsignedInt> number) {
      checkNotIsSet(numberIsSet(), "number");
      this.number = Objects.requireNonNull(number, "number");
      optBits |= OPT_BIT_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_SecurityLabel#number() number} to number.
     * @param number The value for number
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("number")
    public final Builder number(Optional<? extends List<com.fhir.unsignedInt>> number) {
      checkNotIsSet(numberIsSet(), "number");
      this.number = number.orElse(null);
      optBits |= OPT_BIT_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_SecurityLabel#id() id} to id.
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
     * Initializes the optional value {@link Contract_SecurityLabel#id() id} to id.
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
     * Builds a new {@link Contract_SecurityLabel Contract_SecurityLabel}.
     * @return An immutable instance of Contract_SecurityLabel
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Contract_SecurityLabel build() {
      checkRequiredAttributes();
      return new ImmutableContract_SecurityLabel(classification, category, modifierExtension, extension, control, number, id);
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean controlIsSet() {
      return (optBits & OPT_BIT_CONTROL) != 0;
    }

    private boolean numberIsSet() {
      return (optBits & OPT_BIT_NUMBER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean classificationIsSet() {
      return (initBits & INIT_BIT_CLASSIFICATION) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Contract_SecurityLabel is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!classificationIsSet()) attributes.add("classification");
      return "Cannot build Contract_SecurityLabel, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Contract_SecurityLabel", generator = "Immutables")
  public interface ClassificationBuildStage {
    /**
     * Initializes the value for the {@link Contract_SecurityLabel#classification() classification} attribute.
     * @param classification The value for classification 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal classification(Coding classification);
  }

  @Generated(from = "Contract_SecurityLabel", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Contract_SecurityLabel#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(List<Coding> category);

    /**
     * Initializes the optional value {@link Contract_SecurityLabel#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends List<Coding>> category);

    /**
     * Initializes the optional value {@link Contract_SecurityLabel#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Contract_SecurityLabel#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Contract_SecurityLabel#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Contract_SecurityLabel#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Contract_SecurityLabel#control() control} to control.
     * @param control The value for control
     * @return {@code this} builder for chained invocation
     */
    BuildFinal control(List<Coding> control);

    /**
     * Initializes the optional value {@link Contract_SecurityLabel#control() control} to control.
     * @param control The value for control
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal control(Optional<? extends List<Coding>> control);

    /**
     * Initializes the optional value {@link Contract_SecurityLabel#number() number} to number.
     * @param number The value for number
     * @return {@code this} builder for chained invocation
     */
    BuildFinal number(List<com.fhir.unsignedInt> number);

    /**
     * Initializes the optional value {@link Contract_SecurityLabel#number() number} to number.
     * @param number The value for number
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal number(Optional<? extends List<com.fhir.unsignedInt>> number);

    /**
     * Initializes the optional value {@link Contract_SecurityLabel#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Contract_SecurityLabel#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Builds a new {@link Contract_SecurityLabel Contract_SecurityLabel}.
     * @return An immutable instance of Contract_SecurityLabel
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Contract_SecurityLabel build();
  }
}

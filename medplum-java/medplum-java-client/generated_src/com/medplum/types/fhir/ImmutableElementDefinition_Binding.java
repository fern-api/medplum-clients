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
 * Immutable implementation of {@link ElementDefinition_Binding}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableElementDefinition_Binding.builder()}.
 */
@Generated(from = "ElementDefinition_Binding", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableElementDefinition_Binding
    implements ElementDefinition_Binding {
  private final @Nullable String id;
  private final @Nullable Elementdefinition_bindingStrength strength;
  private final @Nullable Canonical valueSet;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String description;
  private final @Nullable List<Extension> extension;

  private ImmutableElementDefinition_Binding(
      @Nullable String id,
      @Nullable Elementdefinition_bindingStrength strength,
      @Nullable Canonical valueSet,
      @Nullable List<Extension> modifierExtension,
      @Nullable String description,
      @Nullable List<Extension> extension) {
    this.id = id;
    this.strength = strength;
    this.valueSet = valueSet;
    this.modifierExtension = modifierExtension;
    this.description = description;
    this.extension = extension;
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
   * @return The value of the {@code strength} attribute
   */
  @JsonProperty("strength")
  @Override
  public Optional<Elementdefinition_bindingStrength> strength() {
    return Optional.ofNullable(strength);
  }

  /**
   * @return The value of the {@code valueSet} attribute
   */
  @JsonProperty("valueSet")
  @Override
  public Optional<Canonical> valueSet() {
    return Optional.ofNullable(valueSet);
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Binding#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Binding withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableElementDefinition_Binding(
        newValue,
        this.strength,
        this.valueSet,
        this.modifierExtension,
        this.description,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Binding#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Binding withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableElementDefinition_Binding(value, this.strength, this.valueSet, this.modifierExtension, this.description, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Binding#strength() strength} attribute.
   * @param value The value for strength
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Binding withStrength(Elementdefinition_bindingStrength value) {
    @Nullable Elementdefinition_bindingStrength newValue = Objects.requireNonNull(value, "strength");
    if (this.strength == newValue) return this;
    return new ImmutableElementDefinition_Binding(this.id, newValue, this.valueSet, this.modifierExtension, this.description, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Binding#strength() strength} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for strength
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Binding withStrength(Optional<? extends Elementdefinition_bindingStrength> optional) {
    @Nullable Elementdefinition_bindingStrength value = optional.orElse(null);
    if (this.strength == value) return this;
    return new ImmutableElementDefinition_Binding(this.id, value, this.valueSet, this.modifierExtension, this.description, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Binding#valueSet() valueSet} attribute.
   * @param value The value for valueSet
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Binding withValueSet(Canonical value) {
    @Nullable Canonical newValue = Objects.requireNonNull(value, "valueSet");
    if (this.valueSet == newValue) return this;
    return new ImmutableElementDefinition_Binding(this.id, this.strength, newValue, this.modifierExtension, this.description, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Binding#valueSet() valueSet} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueSet
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Binding withValueSet(Optional<? extends Canonical> optional) {
    @Nullable Canonical value = optional.orElse(null);
    if (this.valueSet == value) return this;
    return new ImmutableElementDefinition_Binding(this.id, this.strength, value, this.modifierExtension, this.description, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Binding#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Binding withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableElementDefinition_Binding(this.id, this.strength, this.valueSet, newValue, this.description, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Binding#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Binding withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableElementDefinition_Binding(this.id, this.strength, this.valueSet, value, this.description, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Binding#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Binding withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableElementDefinition_Binding(this.id, this.strength, this.valueSet, this.modifierExtension, newValue, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Binding#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Binding withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableElementDefinition_Binding(this.id, this.strength, this.valueSet, this.modifierExtension, value, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Binding#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Binding withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableElementDefinition_Binding(this.id, this.strength, this.valueSet, this.modifierExtension, this.description, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Binding#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Binding withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableElementDefinition_Binding(this.id, this.strength, this.valueSet, this.modifierExtension, this.description, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableElementDefinition_Binding} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableElementDefinition_Binding
        && equalTo((ImmutableElementDefinition_Binding) another);
  }

  private boolean equalTo(ImmutableElementDefinition_Binding another) {
    return Objects.equals(id, another.id)
        && Objects.equals(strength, another.strength)
        && Objects.equals(valueSet, another.valueSet)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(description, another.description)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code strength}, {@code valueSet}, {@code modifierExtension}, {@code description}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(strength);
    h += (h << 5) + Objects.hashCode(valueSet);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code ElementDefinition_Binding} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ElementDefinition_Binding{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (strength != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("strength=").append(strength);
    }
    if (valueSet != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("valueSet=").append(valueSet);
    }
    if (modifierExtension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (description != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (extension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ElementDefinition_Binding", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ElementDefinition_Binding {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Elementdefinition_bindingStrength> strength = Optional.empty();
    boolean strengthIsSet;
    @Nullable Optional<Canonical> valueSet = Optional.empty();
    boolean valueSetIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("strength")
    public void setStrength(Optional<Elementdefinition_bindingStrength> strength) {
      this.strength = strength;
      this.strengthIsSet = true;
    }
    @JsonProperty("valueSet")
    public void setValueSet(Optional<Canonical> valueSet) {
      this.valueSet = valueSet;
      this.valueSetIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Elementdefinition_bindingStrength> strength() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Canonical> valueSet() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
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
  static ImmutableElementDefinition_Binding fromJson(Json json) {
    ImmutableElementDefinition_Binding.Builder builder = ImmutableElementDefinition_Binding.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.strengthIsSet) {
      builder.strength(json.strength);
    }
    if (json.valueSetIsSet) {
      builder.valueSet(json.valueSet);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableElementDefinition_Binding) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ElementDefinition_Binding} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ElementDefinition_Binding instance
   */
  public static ElementDefinition_Binding copyOf(ElementDefinition_Binding instance) {
    if (instance instanceof ImmutableElementDefinition_Binding) {
      return (ImmutableElementDefinition_Binding) instance;
    }
    return ImmutableElementDefinition_Binding.builder()
        .id(instance.id())
        .strength(instance.strength())
        .valueSet(instance.valueSet())
        .modifierExtension(instance.modifierExtension())
        .description(instance.description())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link ElementDefinition_Binding ElementDefinition_Binding}.
   * <pre>
   * ImmutableElementDefinition_Binding.builder()
   *    .id(String) // optional {@link ElementDefinition_Binding#id() id}
   *    .strength(com.medplum.types.fhir.Elementdefinition_bindingStrength) // optional {@link ElementDefinition_Binding#strength() strength}
   *    .valueSet(com.medplum.types.fhir.Canonical) // optional {@link ElementDefinition_Binding#valueSet() valueSet}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ElementDefinition_Binding#modifierExtension() modifierExtension}
   *    .description(String) // optional {@link ElementDefinition_Binding#description() description}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ElementDefinition_Binding#extension() extension}
   *    .build();
   * </pre>
   * @return A new ElementDefinition_Binding builder
   */
  public static ImmutableElementDefinition_Binding.Builder builder() {
    return new ImmutableElementDefinition_Binding.Builder();
  }

  /**
   * Builds instances of type {@link ElementDefinition_Binding ElementDefinition_Binding}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ElementDefinition_Binding", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_STRENGTH = 0x2L;
    private static final long OPT_BIT_VALUE_SET = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_DESCRIPTION = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private long optBits;

    private @Nullable String id;
    private @Nullable Elementdefinition_bindingStrength strength;
    private @Nullable Canonical valueSet;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String description;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Binding#id() id} to id.
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
     * Initializes the optional value {@link ElementDefinition_Binding#id() id} to id.
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
     * Initializes the optional value {@link ElementDefinition_Binding#strength() strength} to strength.
     * @param strength The value for strength
     * @return {@code this} builder for chained invocation
     */
    public final Builder strength(Elementdefinition_bindingStrength strength) {
      checkNotIsSet(strengthIsSet(), "strength");
      this.strength = Objects.requireNonNull(strength, "strength");
      optBits |= OPT_BIT_STRENGTH;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Binding#strength() strength} to strength.
     * @param strength The value for strength
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("strength")
    public final Builder strength(Optional<? extends Elementdefinition_bindingStrength> strength) {
      checkNotIsSet(strengthIsSet(), "strength");
      this.strength = strength.orElse(null);
      optBits |= OPT_BIT_STRENGTH;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Binding#valueSet() valueSet} to valueSet.
     * @param valueSet The value for valueSet
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueSet(Canonical valueSet) {
      checkNotIsSet(valueSetIsSet(), "valueSet");
      this.valueSet = Objects.requireNonNull(valueSet, "valueSet");
      optBits |= OPT_BIT_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Binding#valueSet() valueSet} to valueSet.
     * @param valueSet The value for valueSet
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueSet")
    public final Builder valueSet(Optional<? extends Canonical> valueSet) {
      checkNotIsSet(valueSetIsSet(), "valueSet");
      this.valueSet = valueSet.orElse(null);
      optBits |= OPT_BIT_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Binding#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ElementDefinition_Binding#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ElementDefinition_Binding#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Binding#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Binding#extension() extension} to extension.
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
     * Initializes the optional value {@link ElementDefinition_Binding#extension() extension} to extension.
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
     * Builds a new {@link ElementDefinition_Binding ElementDefinition_Binding}.
     * @return An immutable instance of ElementDefinition_Binding
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ElementDefinition_Binding build() {
      return new ImmutableElementDefinition_Binding(id, strength, valueSet, modifierExtension, description, extension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean strengthIsSet() {
      return (optBits & OPT_BIT_STRENGTH) != 0;
    }

    private boolean valueSetIsSet() {
      return (optBits & OPT_BIT_VALUE_SET) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ElementDefinition_Binding is strict, attribute is already set: ".concat(name));
    }
  }
}
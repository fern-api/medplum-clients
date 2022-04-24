//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ElementDefinition_Binding}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableElementDefinition_Binding.builder()}.
 */
@org.immutables.value.Generated(from = "ElementDefinition_Binding", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableElementDefinition_Binding implements com.fhir.ElementDefinition_Binding {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.Elementdefinition_bindingStrength strength;
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.canonical valueSet;

  private ImmutableElementDefinition_Binding(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.Elementdefinition_bindingStrength strength,
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.canonical valueSet) {
    this.modifierExtension = modifierExtension;
    this.strength = strength;
    this.description = description;
    this.id = id;
    this.extension = extension;
    this.valueSet = valueSet;
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code strength} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("strength")
  @Override
  public java.util.Optional<com.fhir.Elementdefinition_bindingStrength> strength() {
    return java.util.Optional.ofNullable(strength);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<java.lang.String> description() {
    return java.util.Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code valueSet} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueSet")
  @Override
  public java.util.Optional<com.fhir.canonical> valueSet() {
    return java.util.Optional.ofNullable(valueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Binding#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Binding withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableElementDefinition_Binding(newValue, this.strength, this.description, this.id, this.extension, this.valueSet);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Binding#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Binding withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableElementDefinition_Binding(value, this.strength, this.description, this.id, this.extension, this.valueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Binding#strength() strength} attribute.
   * @param value The value for strength
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Binding withStrength(com.fhir.Elementdefinition_bindingStrength value) {
    @javax.annotation.Nullable com.fhir.Elementdefinition_bindingStrength newValue = java.util.Objects.requireNonNull(value, "strength");
    if (this.strength == newValue) return this;
    return new ImmutableElementDefinition_Binding(this.modifierExtension, newValue, this.description, this.id, this.extension, this.valueSet);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Binding#strength() strength} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for strength
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Binding withStrength(java.util.Optional<? extends com.fhir.Elementdefinition_bindingStrength> optional) {
    @javax.annotation.Nullable com.fhir.Elementdefinition_bindingStrength value = optional.orElse(null);
    if (this.strength == value) return this;
    return new ImmutableElementDefinition_Binding(this.modifierExtension, value, this.description, this.id, this.extension, this.valueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Binding#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Binding withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableElementDefinition_Binding(this.modifierExtension, this.strength, newValue, this.id, this.extension, this.valueSet);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Binding#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Binding withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableElementDefinition_Binding(this.modifierExtension, this.strength, value, this.id, this.extension, this.valueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Binding#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Binding withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableElementDefinition_Binding(
        this.modifierExtension,
        this.strength,
        this.description,
        newValue,
        this.extension,
        this.valueSet);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Binding#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Binding withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableElementDefinition_Binding(this.modifierExtension, this.strength, this.description, value, this.extension, this.valueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Binding#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Binding withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableElementDefinition_Binding(this.modifierExtension, this.strength, this.description, this.id, newValue, this.valueSet);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Binding#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Binding withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableElementDefinition_Binding(this.modifierExtension, this.strength, this.description, this.id, value, this.valueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Binding#valueSet() valueSet} attribute.
   * @param value The value for valueSet
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Binding withValueSet(com.fhir.canonical value) {
    @javax.annotation.Nullable com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "valueSet");
    if (this.valueSet == newValue) return this;
    return new ImmutableElementDefinition_Binding(this.modifierExtension, this.strength, this.description, this.id, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Binding#valueSet() valueSet} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueSet
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Binding withValueSet(java.util.Optional<? extends com.fhir.canonical> optional) {
    @javax.annotation.Nullable com.fhir.canonical value = optional.orElse(null);
    if (this.valueSet == value) return this;
    return new ImmutableElementDefinition_Binding(this.modifierExtension, this.strength, this.description, this.id, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableElementDefinition_Binding} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableElementDefinition_Binding
        && equalTo((ImmutableElementDefinition_Binding) another);
  }

  private boolean equalTo(ImmutableElementDefinition_Binding another) {
    return java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(strength, another.strength)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(valueSet, another.valueSet);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code strength}, {@code description}, {@code id}, {@code extension}, {@code valueSet}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(strength);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(valueSet);
    return h;
  }

  /**
   * Prints the immutable value {@code ElementDefinition_Binding} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ElementDefinition_Binding{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (strength != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("strength=").append(strength);
    }
    if (description != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (id != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (valueSet != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("valueSet=").append(valueSet);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ElementDefinition_Binding", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ElementDefinition_Binding {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Elementdefinition_bindingStrength> strength = java.util.Optional.empty();
    boolean strengthIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.canonical> valueSet = java.util.Optional.empty();
    boolean valueSetIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("strength")
    public void setStrength(java.util.Optional<com.fhir.Elementdefinition_bindingStrength> strength) {
      this.strength = strength;
      this.strengthIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueSet")
    public void setValueSet(java.util.Optional<com.fhir.canonical> valueSet) {
      this.valueSet = valueSet;
      this.valueSetIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Elementdefinition_bindingStrength> strength() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.canonical> valueSet() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableElementDefinition_Binding fromJson(Json json) {
    ImmutableElementDefinition_Binding.Builder builder = ImmutableElementDefinition_Binding.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.strengthIsSet) {
      builder.strength(json.strength);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.valueSetIsSet) {
      builder.valueSet(json.valueSet);
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
        .modifierExtension(instance.modifierExtension())
        .strength(instance.strength())
        .description(instance.description())
        .id(instance.id())
        .extension(instance.extension())
        .valueSet(instance.valueSet())
        .build();
  }

  /**
   * Creates a builder for {@link ElementDefinition_Binding ElementDefinition_Binding}.
   * <pre>
   * ImmutableElementDefinition_Binding.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ElementDefinition_Binding#modifierExtension() modifierExtension}
   *    .strength(com.fhir.Elementdefinition_bindingStrength) // optional {@link ElementDefinition_Binding#strength() strength}
   *    .description(String) // optional {@link ElementDefinition_Binding#description() description}
   *    .id(String) // optional {@link ElementDefinition_Binding#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ElementDefinition_Binding#extension() extension}
   *    .valueSet(com.fhir.canonical) // optional {@link ElementDefinition_Binding#valueSet() valueSet}
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
  @org.immutables.value.Generated(from = "ElementDefinition_Binding", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_STRENGTH = 0x2L;
    private static final long OPT_BIT_DESCRIPTION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_VALUE_SET = 0x20L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.Elementdefinition_bindingStrength strength;
    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.canonical valueSet;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Binding#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(java.util.List<com.fhir.Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = java.util.Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Binding#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public final Builder modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Binding#strength() strength} to strength.
     * @param strength The value for strength
     * @return {@code this} builder for chained invocation
     */
    public final Builder strength(com.fhir.Elementdefinition_bindingStrength strength) {
      checkNotIsSet(strengthIsSet(), "strength");
      this.strength = java.util.Objects.requireNonNull(strength, "strength");
      optBits |= OPT_BIT_STRENGTH;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Binding#strength() strength} to strength.
     * @param strength The value for strength
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("strength")
    public final Builder strength(java.util.Optional<? extends com.fhir.Elementdefinition_bindingStrength> strength) {
      checkNotIsSet(strengthIsSet(), "strength");
      this.strength = strength.orElse(null);
      optBits |= OPT_BIT_STRENGTH;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Binding#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(java.lang.String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = java.util.Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Binding#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public final Builder description(java.util.Optional<java.lang.String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Binding#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(java.lang.String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Binding#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<java.lang.String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Binding#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(java.util.List<com.fhir.Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = java.util.Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Binding#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public final Builder extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Binding#valueSet() valueSet} to valueSet.
     * @param valueSet The value for valueSet
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueSet(com.fhir.canonical valueSet) {
      checkNotIsSet(valueSetIsSet(), "valueSet");
      this.valueSet = java.util.Objects.requireNonNull(valueSet, "valueSet");
      optBits |= OPT_BIT_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Binding#valueSet() valueSet} to valueSet.
     * @param valueSet The value for valueSet
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueSet")
    public final Builder valueSet(java.util.Optional<? extends com.fhir.canonical> valueSet) {
      checkNotIsSet(valueSetIsSet(), "valueSet");
      this.valueSet = valueSet.orElse(null);
      optBits |= OPT_BIT_VALUE_SET;
      return this;
    }

    /**
     * Builds a new {@link ElementDefinition_Binding ElementDefinition_Binding}.
     * @return An immutable instance of ElementDefinition_Binding
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ElementDefinition_Binding build() {
      return new ImmutableElementDefinition_Binding(modifierExtension, strength, description, id, extension, valueSet);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean strengthIsSet() {
      return (optBits & OPT_BIT_STRENGTH) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean valueSetIsSet() {
      return (optBits & OPT_BIT_VALUE_SET) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ElementDefinition_Binding is strict, attribute is already set: ".concat(name));
    }
  }
}

//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link OperationDefinition_Binding}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableOperationDefinition_Binding.builder()}.
 */
@org.immutables.value.Generated(from = "OperationDefinition_Binding", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableOperationDefinition_Binding implements com.fhir.OperationDefinition_Binding {
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.Operationdefinition_bindingStrength strength;
  private final com.fhir.canonical valueSet;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;

  private ImmutableOperationDefinition_Binding(
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.Operationdefinition_bindingStrength strength,
      com.fhir.canonical valueSet,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension) {
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.strength = strength;
    this.valueSet = valueSet;
    this.extension = extension;
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
  public java.util.Optional<com.fhir.Operationdefinition_bindingStrength> strength() {
    return java.util.Optional.ofNullable(strength);
  }

  /**
   * @return The value of the {@code valueSet} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueSet")
  @Override
  public com.fhir.canonical valueSet() {
    return valueSet;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Binding#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Binding withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableOperationDefinition_Binding(newValue, this.modifierExtension, this.strength, this.valueSet, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Binding#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Binding withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableOperationDefinition_Binding(value, this.modifierExtension, this.strength, this.valueSet, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Binding#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Binding withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableOperationDefinition_Binding(this.id, newValue, this.strength, this.valueSet, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Binding#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition_Binding withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableOperationDefinition_Binding(this.id, value, this.strength, this.valueSet, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Binding#strength() strength} attribute.
   * @param value The value for strength
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Binding withStrength(com.fhir.Operationdefinition_bindingStrength value) {
    @javax.annotation.Nullable com.fhir.Operationdefinition_bindingStrength newValue = java.util.Objects.requireNonNull(value, "strength");
    if (this.strength == newValue) return this;
    return new ImmutableOperationDefinition_Binding(this.id, this.modifierExtension, newValue, this.valueSet, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Binding#strength() strength} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for strength
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition_Binding withStrength(java.util.Optional<? extends com.fhir.Operationdefinition_bindingStrength> optional) {
    @javax.annotation.Nullable com.fhir.Operationdefinition_bindingStrength value = optional.orElse(null);
    if (this.strength == value) return this;
    return new ImmutableOperationDefinition_Binding(this.id, this.modifierExtension, value, this.valueSet, this.extension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link OperationDefinition_Binding#valueSet() valueSet} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for valueSet
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOperationDefinition_Binding withValueSet(com.fhir.canonical value) {
    if (this.valueSet == value) return this;
    com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "valueSet");
    return new ImmutableOperationDefinition_Binding(this.id, this.modifierExtension, this.strength, newValue, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Binding#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Binding withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableOperationDefinition_Binding(this.id, this.modifierExtension, this.strength, this.valueSet, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Binding#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition_Binding withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableOperationDefinition_Binding(this.id, this.modifierExtension, this.strength, this.valueSet, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableOperationDefinition_Binding} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableOperationDefinition_Binding
        && equalTo((ImmutableOperationDefinition_Binding) another);
  }

  private boolean equalTo(ImmutableOperationDefinition_Binding another) {
    return java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(strength, another.strength)
        && valueSet.equals(another.valueSet)
        && java.util.Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code modifierExtension}, {@code strength}, {@code valueSet}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(strength);
    h += (h << 5) + valueSet.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code OperationDefinition_Binding} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("OperationDefinition_Binding{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (strength != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("strength=").append(strength);
    }
    if (builder.length() > 28) builder.append(", ");
    builder.append("valueSet=").append(valueSet);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "OperationDefinition_Binding", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.OperationDefinition_Binding {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Operationdefinition_bindingStrength> strength = java.util.Optional.empty();
    boolean strengthIsSet;
    @javax.annotation.Nullable com.fhir.canonical valueSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("strength")
    public void setStrength(java.util.Optional<com.fhir.Operationdefinition_bindingStrength> strength) {
      this.strength = strength;
      this.strengthIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueSet")
    public void setValueSet(com.fhir.canonical valueSet) {
      this.valueSet = valueSet;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Operationdefinition_bindingStrength> strength() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.canonical valueSet() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableOperationDefinition_Binding fromJson(Json json) {
    ImmutableOperationDefinition_Binding.Builder builder = ((ImmutableOperationDefinition_Binding.Builder) ImmutableOperationDefinition_Binding.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.strengthIsSet) {
      builder.strength(json.strength);
    }
    if (json.valueSet != null) {
      builder.valueSet(json.valueSet);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableOperationDefinition_Binding) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link OperationDefinition_Binding} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable OperationDefinition_Binding instance
   */
  public static OperationDefinition_Binding copyOf(OperationDefinition_Binding instance) {
    if (instance instanceof ImmutableOperationDefinition_Binding) {
      return (ImmutableOperationDefinition_Binding) instance;
    }
    return ((ImmutableOperationDefinition_Binding.Builder) ImmutableOperationDefinition_Binding.builder())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .strength(instance.strength())
        .valueSet(instance.valueSet())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link OperationDefinition_Binding OperationDefinition_Binding}.
   * <pre>
   * ImmutableOperationDefinition_Binding.builder()
   *    .id(String) // optional {@link OperationDefinition_Binding#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link OperationDefinition_Binding#modifierExtension() modifierExtension}
   *    .strength(com.fhir.Operationdefinition_bindingStrength) // optional {@link OperationDefinition_Binding#strength() strength}
   *    .valueSet(com.fhir.canonical) // required {@link OperationDefinition_Binding#valueSet() valueSet}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link OperationDefinition_Binding#extension() extension}
   *    .build();
   * </pre>
   * @return A new OperationDefinition_Binding builder
   */
  public static ValueSetBuildStage builder() {
    return new ImmutableOperationDefinition_Binding.Builder();
  }

  /**
   * Builds instances of type {@link OperationDefinition_Binding OperationDefinition_Binding}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "OperationDefinition_Binding", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ValueSetBuildStage, BuildFinal {
    private static final long INIT_BIT_VALUE_SET = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_STRENGTH = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.Operationdefinition_bindingStrength strength;
    private @javax.annotation.Nullable com.fhir.canonical valueSet;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Binding#id() id} to id.
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
     * Initializes the optional value {@link OperationDefinition_Binding#id() id} to id.
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
     * Initializes the optional value {@link OperationDefinition_Binding#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link OperationDefinition_Binding#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link OperationDefinition_Binding#strength() strength} to strength.
     * @param strength The value for strength
     * @return {@code this} builder for chained invocation
     */
    public final Builder strength(com.fhir.Operationdefinition_bindingStrength strength) {
      checkNotIsSet(strengthIsSet(), "strength");
      this.strength = java.util.Objects.requireNonNull(strength, "strength");
      optBits |= OPT_BIT_STRENGTH;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Binding#strength() strength} to strength.
     * @param strength The value for strength
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("strength")
    public final Builder strength(java.util.Optional<? extends com.fhir.Operationdefinition_bindingStrength> strength) {
      checkNotIsSet(strengthIsSet(), "strength");
      this.strength = strength.orElse(null);
      optBits |= OPT_BIT_STRENGTH;
      return this;
    }

    /**
     * Initializes the value for the {@link OperationDefinition_Binding#valueSet() valueSet} attribute.
     * @param valueSet The value for valueSet 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueSet")
    public final Builder valueSet(com.fhir.canonical valueSet) {
      checkNotIsSet(valueSetIsSet(), "valueSet");
      this.valueSet = java.util.Objects.requireNonNull(valueSet, "valueSet");
      initBits &= ~INIT_BIT_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Binding#extension() extension} to extension.
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
     * Initializes the optional value {@link OperationDefinition_Binding#extension() extension} to extension.
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
     * Builds a new {@link OperationDefinition_Binding OperationDefinition_Binding}.
     * @return An immutable instance of OperationDefinition_Binding
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.OperationDefinition_Binding build() {
      checkRequiredAttributes();
      return new ImmutableOperationDefinition_Binding(id, modifierExtension, strength, valueSet, extension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean strengthIsSet() {
      return (optBits & OPT_BIT_STRENGTH) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean valueSetIsSet() {
      return (initBits & INIT_BIT_VALUE_SET) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of OperationDefinition_Binding is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!valueSetIsSet()) attributes.add("valueSet");
      return "Cannot build OperationDefinition_Binding, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "OperationDefinition_Binding", generator = "Immutables")
  public interface ValueSetBuildStage {
    /**
     * Initializes the value for the {@link OperationDefinition_Binding#valueSet() valueSet} attribute.
     * @param valueSet The value for valueSet 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueSet(com.fhir.canonical valueSet);
  }

  @org.immutables.value.Generated(from = "OperationDefinition_Binding", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link OperationDefinition_Binding#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link OperationDefinition_Binding#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Initializes the optional value {@link OperationDefinition_Binding#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link OperationDefinition_Binding#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link OperationDefinition_Binding#strength() strength} to strength.
     * @param strength The value for strength
     * @return {@code this} builder for chained invocation
     */
    BuildFinal strength(com.fhir.Operationdefinition_bindingStrength strength);

    /**
     * Initializes the optional value {@link OperationDefinition_Binding#strength() strength} to strength.
     * @param strength The value for strength
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal strength(java.util.Optional<? extends com.fhir.Operationdefinition_bindingStrength> strength);

    /**
     * Initializes the optional value {@link OperationDefinition_Binding#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link OperationDefinition_Binding#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Builds a new {@link OperationDefinition_Binding OperationDefinition_Binding}.
     * @return An immutable instance of OperationDefinition_Binding
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    OperationDefinition_Binding build();
  }
}

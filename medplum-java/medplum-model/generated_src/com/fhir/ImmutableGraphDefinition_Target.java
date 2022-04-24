//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link GraphDefinition_Target}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableGraphDefinition_Target.builder()}.
 */
@org.immutables.value.Generated(from = "GraphDefinition_Target", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableGraphDefinition_Target implements com.fhir.GraphDefinition_Target {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.GraphDefinition_Compartment> compartment;
  private final @javax.annotation.Nullable java.util.List<com.fhir.GraphDefinition_Link> link;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.code type;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String params;
  private final @javax.annotation.Nullable com.fhir.canonical profile;

  private ImmutableGraphDefinition_Target(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.GraphDefinition_Compartment> compartment,
      @javax.annotation.Nullable java.util.List<com.fhir.GraphDefinition_Link> link,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.code type,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String params,
      @javax.annotation.Nullable com.fhir.canonical profile) {
    this.modifierExtension = modifierExtension;
    this.compartment = compartment;
    this.link = link;
    this.id = id;
    this.type = type;
    this.extension = extension;
    this.params = params;
    this.profile = profile;
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
   * @return The value of the {@code compartment} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("compartment")
  @Override
  public java.util.Optional<java.util.List<com.fhir.GraphDefinition_Compartment>> compartment() {
    return java.util.Optional.ofNullable(compartment);
  }

  /**
   * @return The value of the {@code link} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("link")
  @Override
  public java.util.Optional<java.util.List<com.fhir.GraphDefinition_Link>> link() {
    return java.util.Optional.ofNullable(link);
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
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.code> type() {
    return java.util.Optional.ofNullable(type);
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
   * @return The value of the {@code params} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("params")
  @Override
  public java.util.Optional<java.lang.String> params() {
    return java.util.Optional.ofNullable(params);
  }

  /**
   * @return The value of the {@code profile} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("profile")
  @Override
  public java.util.Optional<com.fhir.canonical> profile() {
    return java.util.Optional.ofNullable(profile);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Target#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Target withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableGraphDefinition_Target(
        newValue,
        this.compartment,
        this.link,
        this.id,
        this.type,
        this.extension,
        this.params,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Target#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition_Target withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableGraphDefinition_Target(
        value,
        this.compartment,
        this.link,
        this.id,
        this.type,
        this.extension,
        this.params,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Target#compartment() compartment} attribute.
   * @param value The value for compartment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Target withCompartment(java.util.List<com.fhir.GraphDefinition_Compartment> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.GraphDefinition_Compartment> newValue = java.util.Objects.requireNonNull(value, "compartment");
    if (this.compartment == newValue) return this;
    return new ImmutableGraphDefinition_Target(
        this.modifierExtension,
        newValue,
        this.link,
        this.id,
        this.type,
        this.extension,
        this.params,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Target#compartment() compartment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for compartment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition_Target withCompartment(java.util.Optional<? extends java.util.List<com.fhir.GraphDefinition_Compartment>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.GraphDefinition_Compartment> value = optional.orElse(null);
    if (this.compartment == value) return this;
    return new ImmutableGraphDefinition_Target(
        this.modifierExtension,
        value,
        this.link,
        this.id,
        this.type,
        this.extension,
        this.params,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Target#link() link} attribute.
   * @param value The value for link
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Target withLink(java.util.List<com.fhir.GraphDefinition_Link> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.GraphDefinition_Link> newValue = java.util.Objects.requireNonNull(value, "link");
    if (this.link == newValue) return this;
    return new ImmutableGraphDefinition_Target(
        this.modifierExtension,
        this.compartment,
        newValue,
        this.id,
        this.type,
        this.extension,
        this.params,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Target#link() link} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for link
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition_Target withLink(java.util.Optional<? extends java.util.List<com.fhir.GraphDefinition_Link>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.GraphDefinition_Link> value = optional.orElse(null);
    if (this.link == value) return this;
    return new ImmutableGraphDefinition_Target(
        this.modifierExtension,
        this.compartment,
        value,
        this.id,
        this.type,
        this.extension,
        this.params,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Target#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Target withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableGraphDefinition_Target(
        this.modifierExtension,
        this.compartment,
        this.link,
        newValue,
        this.type,
        this.extension,
        this.params,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Target#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Target withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableGraphDefinition_Target(
        this.modifierExtension,
        this.compartment,
        this.link,
        value,
        this.type,
        this.extension,
        this.params,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Target#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Target withType(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableGraphDefinition_Target(
        this.modifierExtension,
        this.compartment,
        this.link,
        this.id,
        newValue,
        this.extension,
        this.params,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Target#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition_Target withType(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableGraphDefinition_Target(
        this.modifierExtension,
        this.compartment,
        this.link,
        this.id,
        value,
        this.extension,
        this.params,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Target#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Target withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableGraphDefinition_Target(
        this.modifierExtension,
        this.compartment,
        this.link,
        this.id,
        this.type,
        newValue,
        this.params,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Target#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition_Target withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableGraphDefinition_Target(
        this.modifierExtension,
        this.compartment,
        this.link,
        this.id,
        this.type,
        value,
        this.params,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Target#params() params} attribute.
   * @param value The value for params
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Target withParams(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "params");
    if (java.util.Objects.equals(this.params, newValue)) return this;
    return new ImmutableGraphDefinition_Target(
        this.modifierExtension,
        this.compartment,
        this.link,
        this.id,
        this.type,
        this.extension,
        newValue,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Target#params() params} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for params
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Target withParams(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.params, value)) return this;
    return new ImmutableGraphDefinition_Target(
        this.modifierExtension,
        this.compartment,
        this.link,
        this.id,
        this.type,
        this.extension,
        value,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Target#profile() profile} attribute.
   * @param value The value for profile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Target withProfile(com.fhir.canonical value) {
    @javax.annotation.Nullable com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "profile");
    if (this.profile == newValue) return this;
    return new ImmutableGraphDefinition_Target(
        this.modifierExtension,
        this.compartment,
        this.link,
        this.id,
        this.type,
        this.extension,
        this.params,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Target#profile() profile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for profile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition_Target withProfile(java.util.Optional<? extends com.fhir.canonical> optional) {
    @javax.annotation.Nullable com.fhir.canonical value = optional.orElse(null);
    if (this.profile == value) return this;
    return new ImmutableGraphDefinition_Target(
        this.modifierExtension,
        this.compartment,
        this.link,
        this.id,
        this.type,
        this.extension,
        this.params,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableGraphDefinition_Target} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableGraphDefinition_Target
        && equalTo((ImmutableGraphDefinition_Target) another);
  }

  private boolean equalTo(ImmutableGraphDefinition_Target another) {
    return java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(compartment, another.compartment)
        && java.util.Objects.equals(link, another.link)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(params, another.params)
        && java.util.Objects.equals(profile, another.profile);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code compartment}, {@code link}, {@code id}, {@code type}, {@code extension}, {@code params}, {@code profile}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(compartment);
    h += (h << 5) + java.util.Objects.hashCode(link);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(params);
    h += (h << 5) + java.util.Objects.hashCode(profile);
    return h;
  }

  /**
   * Prints the immutable value {@code GraphDefinition_Target} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("GraphDefinition_Target{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (compartment != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("compartment=").append(compartment);
    }
    if (link != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("link=").append(link);
    }
    if (id != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (type != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (extension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (params != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("params=").append(params);
    }
    if (profile != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("profile=").append(profile);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "GraphDefinition_Target", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.GraphDefinition_Target {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.GraphDefinition_Compartment>> compartment = java.util.Optional.empty();
    boolean compartmentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.GraphDefinition_Link>> link = java.util.Optional.empty();
    boolean linkIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> params = java.util.Optional.empty();
    boolean paramsIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.canonical> profile = java.util.Optional.empty();
    boolean profileIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("compartment")
    public void setCompartment(java.util.Optional<java.util.List<com.fhir.GraphDefinition_Compartment>> compartment) {
      this.compartment = compartment;
      this.compartmentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("link")
    public void setLink(java.util.Optional<java.util.List<com.fhir.GraphDefinition_Link>> link) {
      this.link = link;
      this.linkIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.code> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("params")
    public void setParams(java.util.Optional<java.lang.String> params) {
      this.params = params;
      this.paramsIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    public void setProfile(java.util.Optional<com.fhir.canonical> profile) {
      this.profile = profile;
      this.profileIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.GraphDefinition_Compartment>> compartment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.GraphDefinition_Link>> link() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> params() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.canonical> profile() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableGraphDefinition_Target fromJson(Json json) {
    ImmutableGraphDefinition_Target.Builder builder = ImmutableGraphDefinition_Target.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.compartmentIsSet) {
      builder.compartment(json.compartment);
    }
    if (json.linkIsSet) {
      builder.link(json.link);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.paramsIsSet) {
      builder.params(json.params);
    }
    if (json.profileIsSet) {
      builder.profile(json.profile);
    }
    return (ImmutableGraphDefinition_Target) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link GraphDefinition_Target} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable GraphDefinition_Target instance
   */
  public static GraphDefinition_Target copyOf(GraphDefinition_Target instance) {
    if (instance instanceof ImmutableGraphDefinition_Target) {
      return (ImmutableGraphDefinition_Target) instance;
    }
    return ImmutableGraphDefinition_Target.builder()
        .modifierExtension(instance.modifierExtension())
        .compartment(instance.compartment())
        .link(instance.link())
        .id(instance.id())
        .type(instance.type())
        .extension(instance.extension())
        .params(instance.params())
        .profile(instance.profile())
        .build();
  }

  /**
   * Creates a builder for {@link GraphDefinition_Target GraphDefinition_Target}.
   * <pre>
   * ImmutableGraphDefinition_Target.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link GraphDefinition_Target#modifierExtension() modifierExtension}
   *    .compartment(List&amp;lt;com.fhir.GraphDefinition_Compartment&amp;gt;) // optional {@link GraphDefinition_Target#compartment() compartment}
   *    .link(List&amp;lt;com.fhir.GraphDefinition_Link&amp;gt;) // optional {@link GraphDefinition_Target#link() link}
   *    .id(String) // optional {@link GraphDefinition_Target#id() id}
   *    .type(com.fhir.code) // optional {@link GraphDefinition_Target#type() type}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link GraphDefinition_Target#extension() extension}
   *    .params(String) // optional {@link GraphDefinition_Target#params() params}
   *    .profile(com.fhir.canonical) // optional {@link GraphDefinition_Target#profile() profile}
   *    .build();
   * </pre>
   * @return A new GraphDefinition_Target builder
   */
  public static ImmutableGraphDefinition_Target.Builder builder() {
    return new ImmutableGraphDefinition_Target.Builder();
  }

  /**
   * Builds instances of type {@link GraphDefinition_Target GraphDefinition_Target}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "GraphDefinition_Target", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_COMPARTMENT = 0x2L;
    private static final long OPT_BIT_LINK = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_TYPE = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_PARAMS = 0x40L;
    private static final long OPT_BIT_PROFILE = 0x80L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.GraphDefinition_Compartment> compartment;
    private @javax.annotation.Nullable java.util.List<com.fhir.GraphDefinition_Link> link;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.code type;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String params;
    private @javax.annotation.Nullable com.fhir.canonical profile;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Target#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link GraphDefinition_Target#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link GraphDefinition_Target#compartment() compartment} to compartment.
     * @param compartment The value for compartment
     * @return {@code this} builder for chained invocation
     */
    public final Builder compartment(java.util.List<com.fhir.GraphDefinition_Compartment> compartment) {
      checkNotIsSet(compartmentIsSet(), "compartment");
      this.compartment = java.util.Objects.requireNonNull(compartment, "compartment");
      optBits |= OPT_BIT_COMPARTMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Target#compartment() compartment} to compartment.
     * @param compartment The value for compartment
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartment")
    public final Builder compartment(java.util.Optional<? extends java.util.List<com.fhir.GraphDefinition_Compartment>> compartment) {
      checkNotIsSet(compartmentIsSet(), "compartment");
      this.compartment = compartment.orElse(null);
      optBits |= OPT_BIT_COMPARTMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Target#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for chained invocation
     */
    public final Builder link(java.util.List<com.fhir.GraphDefinition_Link> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = java.util.Objects.requireNonNull(link, "link");
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Target#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("link")
    public final Builder link(java.util.Optional<? extends java.util.List<com.fhir.GraphDefinition_Link>> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = link.orElse(null);
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Target#id() id} to id.
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
     * Initializes the optional value {@link GraphDefinition_Target#id() id} to id.
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
     * Initializes the optional value {@link GraphDefinition_Target#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.code type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Target#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.code> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Target#extension() extension} to extension.
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
     * Initializes the optional value {@link GraphDefinition_Target#extension() extension} to extension.
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
     * Initializes the optional value {@link GraphDefinition_Target#params() params} to params.
     * @param params The value for params
     * @return {@code this} builder for chained invocation
     */
    public final Builder params(java.lang.String params) {
      checkNotIsSet(paramsIsSet(), "params");
      this.params = java.util.Objects.requireNonNull(params, "params");
      optBits |= OPT_BIT_PARAMS;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Target#params() params} to params.
     * @param params The value for params
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("params")
    public final Builder params(java.util.Optional<java.lang.String> params) {
      checkNotIsSet(paramsIsSet(), "params");
      this.params = params.orElse(null);
      optBits |= OPT_BIT_PARAMS;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Target#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for chained invocation
     */
    public final Builder profile(com.fhir.canonical profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = java.util.Objects.requireNonNull(profile, "profile");
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Target#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    public final Builder profile(java.util.Optional<? extends com.fhir.canonical> profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = profile.orElse(null);
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Builds a new {@link GraphDefinition_Target GraphDefinition_Target}.
     * @return An immutable instance of GraphDefinition_Target
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.GraphDefinition_Target build() {
      return new ImmutableGraphDefinition_Target(modifierExtension, compartment, link, id, type, extension, params, profile);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean compartmentIsSet() {
      return (optBits & OPT_BIT_COMPARTMENT) != 0;
    }

    private boolean linkIsSet() {
      return (optBits & OPT_BIT_LINK) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean paramsIsSet() {
      return (optBits & OPT_BIT_PARAMS) != 0;
    }

    private boolean profileIsSet() {
      return (optBits & OPT_BIT_PROFILE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of GraphDefinition_Target is strict, attribute is already set: ".concat(name));
    }
  }
}

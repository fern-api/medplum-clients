//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ParameterDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableParameterDefinition.builder()}.
 */
@org.immutables.value.Generated(from = "ParameterDefinition", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableParameterDefinition implements com.fhir.ParameterDefinition {
  private final @javax.annotation.Nullable com.fhir.code use;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.code type;
  private final @javax.annotation.Nullable com.fhir.code name;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.lang.Integer min;
  private final @javax.annotation.Nullable com.fhir.canonical profile;
  private final @javax.annotation.Nullable java.lang.String max;
  private final @javax.annotation.Nullable java.lang.String documentation;

  private ImmutableParameterDefinition(
      @javax.annotation.Nullable com.fhir.code use,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.code type,
      @javax.annotation.Nullable com.fhir.code name,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.lang.Integer min,
      @javax.annotation.Nullable com.fhir.canonical profile,
      @javax.annotation.Nullable java.lang.String max,
      @javax.annotation.Nullable java.lang.String documentation) {
    this.use = use;
    this.extension = extension;
    this.type = type;
    this.name = name;
    this.id = id;
    this.min = min;
    this.profile = profile;
    this.max = max;
    this.documentation = documentation;
  }

  /**
   * @return The value of the {@code use} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("use")
  @Override
  public java.util.Optional<com.fhir.code> use() {
    return java.util.Optional.ofNullable(use);
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
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.code> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @Override
  public java.util.Optional<com.fhir.code> name() {
    return java.util.Optional.ofNullable(name);
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
   * @return The value of the {@code min} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("min")
  @Override
  public java.util.Optional<java.lang.Integer> min() {
    return java.util.Optional.ofNullable(min);
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
   * @return The value of the {@code max} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("max")
  @Override
  public java.util.Optional<java.lang.String> max() {
    return java.util.Optional.ofNullable(max);
  }

  /**
   * @return The value of the {@code documentation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("documentation")
  @Override
  public java.util.Optional<java.lang.String> documentation() {
    return java.util.Optional.ofNullable(documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ParameterDefinition#use() use} attribute.
   * @param value The value for use
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameterDefinition withUse(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "use");
    if (this.use == newValue) return this;
    return new ImmutableParameterDefinition(
        newValue,
        this.extension,
        this.type,
        this.name,
        this.id,
        this.min,
        this.profile,
        this.max,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ParameterDefinition#use() use} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for use
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameterDefinition withUse(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.use == value) return this;
    return new ImmutableParameterDefinition(
        value,
        this.extension,
        this.type,
        this.name,
        this.id,
        this.min,
        this.profile,
        this.max,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ParameterDefinition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameterDefinition withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableParameterDefinition(
        this.use,
        newValue,
        this.type,
        this.name,
        this.id,
        this.min,
        this.profile,
        this.max,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ParameterDefinition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameterDefinition withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableParameterDefinition(
        this.use,
        value,
        this.type,
        this.name,
        this.id,
        this.min,
        this.profile,
        this.max,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ParameterDefinition#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameterDefinition withType(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableParameterDefinition(
        this.use,
        this.extension,
        newValue,
        this.name,
        this.id,
        this.min,
        this.profile,
        this.max,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ParameterDefinition#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameterDefinition withType(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableParameterDefinition(
        this.use,
        this.extension,
        value,
        this.name,
        this.id,
        this.min,
        this.profile,
        this.max,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ParameterDefinition#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameterDefinition withName(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "name");
    if (this.name == newValue) return this;
    return new ImmutableParameterDefinition(
        this.use,
        this.extension,
        this.type,
        newValue,
        this.id,
        this.min,
        this.profile,
        this.max,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ParameterDefinition#name() name} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameterDefinition withName(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.name == value) return this;
    return new ImmutableParameterDefinition(
        this.use,
        this.extension,
        this.type,
        value,
        this.id,
        this.min,
        this.profile,
        this.max,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ParameterDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameterDefinition withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableParameterDefinition(
        this.use,
        this.extension,
        this.type,
        this.name,
        newValue,
        this.min,
        this.profile,
        this.max,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ParameterDefinition#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameterDefinition withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableParameterDefinition(
        this.use,
        this.extension,
        this.type,
        this.name,
        value,
        this.min,
        this.profile,
        this.max,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ParameterDefinition#min() min} attribute.
   * @param value The value for min
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameterDefinition withMin(int value) {
    @javax.annotation.Nullable java.lang.Integer newValue = value;
    if (java.util.Objects.equals(this.min, newValue)) return this;
    return new ImmutableParameterDefinition(
        this.use,
        this.extension,
        this.type,
        this.name,
        this.id,
        newValue,
        this.profile,
        this.max,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ParameterDefinition#min() min} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for min
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameterDefinition withMin(java.util.Optional<java.lang.Integer> optional) {
    @javax.annotation.Nullable java.lang.Integer value = optional.orElse(null);
    if (java.util.Objects.equals(this.min, value)) return this;
    return new ImmutableParameterDefinition(
        this.use,
        this.extension,
        this.type,
        this.name,
        this.id,
        value,
        this.profile,
        this.max,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ParameterDefinition#profile() profile} attribute.
   * @param value The value for profile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameterDefinition withProfile(com.fhir.canonical value) {
    @javax.annotation.Nullable com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "profile");
    if (this.profile == newValue) return this;
    return new ImmutableParameterDefinition(
        this.use,
        this.extension,
        this.type,
        this.name,
        this.id,
        this.min,
        newValue,
        this.max,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ParameterDefinition#profile() profile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for profile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameterDefinition withProfile(java.util.Optional<? extends com.fhir.canonical> optional) {
    @javax.annotation.Nullable com.fhir.canonical value = optional.orElse(null);
    if (this.profile == value) return this;
    return new ImmutableParameterDefinition(
        this.use,
        this.extension,
        this.type,
        this.name,
        this.id,
        this.min,
        value,
        this.max,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ParameterDefinition#max() max} attribute.
   * @param value The value for max
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameterDefinition withMax(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "max");
    if (java.util.Objects.equals(this.max, newValue)) return this;
    return new ImmutableParameterDefinition(
        this.use,
        this.extension,
        this.type,
        this.name,
        this.id,
        this.min,
        this.profile,
        newValue,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ParameterDefinition#max() max} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for max
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameterDefinition withMax(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.max, value)) return this;
    return new ImmutableParameterDefinition(
        this.use,
        this.extension,
        this.type,
        this.name,
        this.id,
        this.min,
        this.profile,
        value,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ParameterDefinition#documentation() documentation} attribute.
   * @param value The value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameterDefinition withDocumentation(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "documentation");
    if (java.util.Objects.equals(this.documentation, newValue)) return this;
    return new ImmutableParameterDefinition(
        this.use,
        this.extension,
        this.type,
        this.name,
        this.id,
        this.min,
        this.profile,
        this.max,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ParameterDefinition#documentation() documentation} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameterDefinition withDocumentation(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.documentation, value)) return this;
    return new ImmutableParameterDefinition(
        this.use,
        this.extension,
        this.type,
        this.name,
        this.id,
        this.min,
        this.profile,
        this.max,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableParameterDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableParameterDefinition
        && equalTo((ImmutableParameterDefinition) another);
  }

  private boolean equalTo(ImmutableParameterDefinition another) {
    return java.util.Objects.equals(use, another.use)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(min, another.min)
        && java.util.Objects.equals(profile, another.profile)
        && java.util.Objects.equals(max, another.max)
        && java.util.Objects.equals(documentation, another.documentation);
  }

  /**
   * Computes a hash code from attributes: {@code use}, {@code extension}, {@code type}, {@code name}, {@code id}, {@code min}, {@code profile}, {@code max}, {@code documentation}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(use);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(min);
    h += (h << 5) + java.util.Objects.hashCode(profile);
    h += (h << 5) + java.util.Objects.hashCode(max);
    h += (h << 5) + java.util.Objects.hashCode(documentation);
    return h;
  }

  /**
   * Prints the immutable value {@code ParameterDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ParameterDefinition{");
    if (use != null) {
      builder.append("use=").append(use);
    }
    if (extension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (type != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (name != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (min != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("min=").append(min);
    }
    if (profile != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("profile=").append(profile);
    }
    if (max != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("max=").append(max);
    }
    if (documentation != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("documentation=").append(documentation);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ParameterDefinition", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ParameterDefinition {
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> use = java.util.Optional.empty();
    boolean useIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Integer> min = java.util.Optional.empty();
    boolean minIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.canonical> profile = java.util.Optional.empty();
    boolean profileIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> max = java.util.Optional.empty();
    boolean maxIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> documentation = java.util.Optional.empty();
    boolean documentationIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("use")
    public void setUse(java.util.Optional<com.fhir.code> use) {
      this.use = use;
      this.useIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.code> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<com.fhir.code> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("min")
    public void setMin(java.util.Optional<java.lang.Integer> min) {
      this.min = min;
      this.minIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    public void setProfile(java.util.Optional<com.fhir.canonical> profile) {
      this.profile = profile;
      this.profileIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("max")
    public void setMax(java.util.Optional<java.lang.String> max) {
      this.max = max;
      this.maxIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("documentation")
    public void setDocumentation(java.util.Optional<java.lang.String> documentation) {
      this.documentation = documentation;
      this.documentationIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.code> use() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Integer> min() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.canonical> profile() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> max() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> documentation() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableParameterDefinition fromJson(Json json) {
    ImmutableParameterDefinition.Builder builder = ImmutableParameterDefinition.builder();
    if (json.useIsSet) {
      builder.use(json.use);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.minIsSet) {
      builder.min(json.min);
    }
    if (json.profileIsSet) {
      builder.profile(json.profile);
    }
    if (json.maxIsSet) {
      builder.max(json.max);
    }
    if (json.documentationIsSet) {
      builder.documentation(json.documentation);
    }
    return (ImmutableParameterDefinition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ParameterDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ParameterDefinition instance
   */
  public static ParameterDefinition copyOf(ParameterDefinition instance) {
    if (instance instanceof ImmutableParameterDefinition) {
      return (ImmutableParameterDefinition) instance;
    }
    return ImmutableParameterDefinition.builder()
        .use(instance.use())
        .extension(instance.extension())
        .type(instance.type())
        .name(instance.name())
        .id(instance.id())
        .min(instance.min())
        .profile(instance.profile())
        .max(instance.max())
        .documentation(instance.documentation())
        .build();
  }

  /**
   * Creates a builder for {@link ParameterDefinition ParameterDefinition}.
   * <pre>
   * ImmutableParameterDefinition.builder()
   *    .use(com.fhir.code) // optional {@link ParameterDefinition#use() use}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ParameterDefinition#extension() extension}
   *    .type(com.fhir.code) // optional {@link ParameterDefinition#type() type}
   *    .name(com.fhir.code) // optional {@link ParameterDefinition#name() name}
   *    .id(String) // optional {@link ParameterDefinition#id() id}
   *    .min(Integer) // optional {@link ParameterDefinition#min() min}
   *    .profile(com.fhir.canonical) // optional {@link ParameterDefinition#profile() profile}
   *    .max(String) // optional {@link ParameterDefinition#max() max}
   *    .documentation(String) // optional {@link ParameterDefinition#documentation() documentation}
   *    .build();
   * </pre>
   * @return A new ParameterDefinition builder
   */
  public static ImmutableParameterDefinition.Builder builder() {
    return new ImmutableParameterDefinition.Builder();
  }

  /**
   * Builds instances of type {@link ParameterDefinition ParameterDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ParameterDefinition", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_USE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_TYPE = 0x4L;
    private static final long OPT_BIT_NAME = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_MIN = 0x20L;
    private static final long OPT_BIT_PROFILE = 0x40L;
    private static final long OPT_BIT_MAX = 0x80L;
    private static final long OPT_BIT_DOCUMENTATION = 0x100L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.code use;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.code type;
    private @javax.annotation.Nullable com.fhir.code name;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.lang.Integer min;
    private @javax.annotation.Nullable com.fhir.canonical profile;
    private @javax.annotation.Nullable java.lang.String max;
    private @javax.annotation.Nullable java.lang.String documentation;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ParameterDefinition#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for chained invocation
     */
    public final Builder use(com.fhir.code use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = java.util.Objects.requireNonNull(use, "use");
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link ParameterDefinition#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("use")
    public final Builder use(java.util.Optional<? extends com.fhir.code> use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = use.orElse(null);
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link ParameterDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link ParameterDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link ParameterDefinition#type() type} to type.
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
     * Initializes the optional value {@link ParameterDefinition#type() type} to type.
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
     * Initializes the optional value {@link ParameterDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(com.fhir.code name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = java.util.Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link ParameterDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public final Builder name(java.util.Optional<? extends com.fhir.code> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link ParameterDefinition#id() id} to id.
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
     * Initializes the optional value {@link ParameterDefinition#id() id} to id.
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
     * Initializes the optional value {@link ParameterDefinition#min() min} to min.
     * @param min The value for min
     * @return {@code this} builder for chained invocation
     */
    public final Builder min(int min) {
      checkNotIsSet(minIsSet(), "min");
      this.min = min;
      optBits |= OPT_BIT_MIN;
      return this;
    }

    /**
     * Initializes the optional value {@link ParameterDefinition#min() min} to min.
     * @param min The value for min
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("min")
    public final Builder min(java.util.Optional<java.lang.Integer> min) {
      checkNotIsSet(minIsSet(), "min");
      this.min = min.orElse(null);
      optBits |= OPT_BIT_MIN;
      return this;
    }

    /**
     * Initializes the optional value {@link ParameterDefinition#profile() profile} to profile.
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
     * Initializes the optional value {@link ParameterDefinition#profile() profile} to profile.
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
     * Initializes the optional value {@link ParameterDefinition#max() max} to max.
     * @param max The value for max
     * @return {@code this} builder for chained invocation
     */
    public final Builder max(java.lang.String max) {
      checkNotIsSet(maxIsSet(), "max");
      this.max = java.util.Objects.requireNonNull(max, "max");
      optBits |= OPT_BIT_MAX;
      return this;
    }

    /**
     * Initializes the optional value {@link ParameterDefinition#max() max} to max.
     * @param max The value for max
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max")
    public final Builder max(java.util.Optional<java.lang.String> max) {
      checkNotIsSet(maxIsSet(), "max");
      this.max = max.orElse(null);
      optBits |= OPT_BIT_MAX;
      return this;
    }

    /**
     * Initializes the optional value {@link ParameterDefinition#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for chained invocation
     */
    public final Builder documentation(java.lang.String documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = java.util.Objects.requireNonNull(documentation, "documentation");
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ParameterDefinition#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("documentation")
    public final Builder documentation(java.util.Optional<java.lang.String> documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = documentation.orElse(null);
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Builds a new {@link ParameterDefinition ParameterDefinition}.
     * @return An immutable instance of ParameterDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ParameterDefinition build() {
      return new ImmutableParameterDefinition(use, extension, type, name, id, min, profile, max, documentation);
    }

    private boolean useIsSet() {
      return (optBits & OPT_BIT_USE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean minIsSet() {
      return (optBits & OPT_BIT_MIN) != 0;
    }

    private boolean profileIsSet() {
      return (optBits & OPT_BIT_PROFILE) != 0;
    }

    private boolean maxIsSet() {
      return (optBits & OPT_BIT_MAX) != 0;
    }

    private boolean documentationIsSet() {
      return (optBits & OPT_BIT_DOCUMENTATION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ParameterDefinition is strict, attribute is already set: ".concat(name));
    }
  }
}

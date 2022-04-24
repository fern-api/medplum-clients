//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link DataRequirement_CodeFilter}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDataRequirement_CodeFilter.builder()}.
 */
@org.immutables.value.Generated(from = "DataRequirement_CodeFilter", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDataRequirement_CodeFilter implements com.fhir.DataRequirement_CodeFilter {
  private final @javax.annotation.Nullable java.lang.String searchParam;
  private final @javax.annotation.Nullable java.lang.String path;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Coding> code;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.canonical valueSet;

  private ImmutableDataRequirement_CodeFilter(
      @javax.annotation.Nullable java.lang.String searchParam,
      @javax.annotation.Nullable java.lang.String path,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Coding> code,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.canonical valueSet) {
    this.searchParam = searchParam;
    this.path = path;
    this.extension = extension;
    this.code = code;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.valueSet = valueSet;
  }

  /**
   * @return The value of the {@code searchParam} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("searchParam")
  @Override
  public java.util.Optional<java.lang.String> searchParam() {
    return java.util.Optional.ofNullable(searchParam);
  }

  /**
   * @return The value of the {@code path} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("path")
  @Override
  public java.util.Optional<java.lang.String> path() {
    return java.util.Optional.ofNullable(path);
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
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Coding>> code() {
    return java.util.Optional.ofNullable(code);
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
   * @return The value of the {@code valueSet} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueSet")
  @Override
  public java.util.Optional<com.fhir.canonical> valueSet() {
    return java.util.Optional.ofNullable(valueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement_CodeFilter#searchParam() searchParam} attribute.
   * @param value The value for searchParam
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_CodeFilter withSearchParam(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "searchParam");
    if (java.util.Objects.equals(this.searchParam, newValue)) return this;
    return new ImmutableDataRequirement_CodeFilter(newValue, this.path, this.extension, this.code, this.id, this.modifierExtension, this.valueSet);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement_CodeFilter#searchParam() searchParam} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for searchParam
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_CodeFilter withSearchParam(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.searchParam, value)) return this;
    return new ImmutableDataRequirement_CodeFilter(value, this.path, this.extension, this.code, this.id, this.modifierExtension, this.valueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement_CodeFilter#path() path} attribute.
   * @param value The value for path
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_CodeFilter withPath(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "path");
    if (java.util.Objects.equals(this.path, newValue)) return this;
    return new ImmutableDataRequirement_CodeFilter(
        this.searchParam,
        newValue,
        this.extension,
        this.code,
        this.id,
        this.modifierExtension,
        this.valueSet);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement_CodeFilter#path() path} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for path
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_CodeFilter withPath(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.path, value)) return this;
    return new ImmutableDataRequirement_CodeFilter(
        this.searchParam,
        value,
        this.extension,
        this.code,
        this.id,
        this.modifierExtension,
        this.valueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement_CodeFilter#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_CodeFilter withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDataRequirement_CodeFilter(
        this.searchParam,
        this.path,
        newValue,
        this.code,
        this.id,
        this.modifierExtension,
        this.valueSet);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement_CodeFilter#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement_CodeFilter withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDataRequirement_CodeFilter(this.searchParam, this.path, value, this.code, this.id, this.modifierExtension, this.valueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement_CodeFilter#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_CodeFilter withCode(java.util.List<com.fhir.Coding> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Coding> newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableDataRequirement_CodeFilter(
        this.searchParam,
        this.path,
        this.extension,
        newValue,
        this.id,
        this.modifierExtension,
        this.valueSet);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement_CodeFilter#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement_CodeFilter withCode(java.util.Optional<? extends java.util.List<com.fhir.Coding>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Coding> value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableDataRequirement_CodeFilter(
        this.searchParam,
        this.path,
        this.extension,
        value,
        this.id,
        this.modifierExtension,
        this.valueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement_CodeFilter#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_CodeFilter withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableDataRequirement_CodeFilter(
        this.searchParam,
        this.path,
        this.extension,
        this.code,
        newValue,
        this.modifierExtension,
        this.valueSet);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement_CodeFilter#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_CodeFilter withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableDataRequirement_CodeFilter(
        this.searchParam,
        this.path,
        this.extension,
        this.code,
        value,
        this.modifierExtension,
        this.valueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement_CodeFilter#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_CodeFilter withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDataRequirement_CodeFilter(this.searchParam, this.path, this.extension, this.code, this.id, newValue, this.valueSet);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement_CodeFilter#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement_CodeFilter withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDataRequirement_CodeFilter(this.searchParam, this.path, this.extension, this.code, this.id, value, this.valueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement_CodeFilter#valueSet() valueSet} attribute.
   * @param value The value for valueSet
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_CodeFilter withValueSet(com.fhir.canonical value) {
    @javax.annotation.Nullable com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "valueSet");
    if (this.valueSet == newValue) return this;
    return new ImmutableDataRequirement_CodeFilter(
        this.searchParam,
        this.path,
        this.extension,
        this.code,
        this.id,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement_CodeFilter#valueSet() valueSet} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueSet
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement_CodeFilter withValueSet(java.util.Optional<? extends com.fhir.canonical> optional) {
    @javax.annotation.Nullable com.fhir.canonical value = optional.orElse(null);
    if (this.valueSet == value) return this;
    return new ImmutableDataRequirement_CodeFilter(this.searchParam, this.path, this.extension, this.code, this.id, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDataRequirement_CodeFilter} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDataRequirement_CodeFilter
        && equalTo((ImmutableDataRequirement_CodeFilter) another);
  }

  private boolean equalTo(ImmutableDataRequirement_CodeFilter another) {
    return java.util.Objects.equals(searchParam, another.searchParam)
        && java.util.Objects.equals(path, another.path)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(valueSet, another.valueSet);
  }

  /**
   * Computes a hash code from attributes: {@code searchParam}, {@code path}, {@code extension}, {@code code}, {@code id}, {@code modifierExtension}, {@code valueSet}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(searchParam);
    h += (h << 5) + java.util.Objects.hashCode(path);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(valueSet);
    return h;
  }

  /**
   * Prints the immutable value {@code DataRequirement_CodeFilter} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("DataRequirement_CodeFilter{");
    if (searchParam != null) {
      builder.append("searchParam=").append(searchParam);
    }
    if (path != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("path=").append(path);
    }
    if (extension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (code != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (id != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (valueSet != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("valueSet=").append(valueSet);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "DataRequirement_CodeFilter", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.DataRequirement_CodeFilter {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> searchParam = java.util.Optional.empty();
    boolean searchParamIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> path = java.util.Optional.empty();
    boolean pathIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Coding>> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.canonical> valueSet = java.util.Optional.empty();
    boolean valueSetIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("searchParam")
    public void setSearchParam(java.util.Optional<java.lang.String> searchParam) {
      this.searchParam = searchParam;
      this.searchParamIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    public void setPath(java.util.Optional<java.lang.String> path) {
      this.path = path;
      this.pathIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<java.util.List<com.fhir.Coding>> code) {
      this.code = code;
      this.codeIsSet = true;
    }
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
    @com.fasterxml.jackson.annotation.JsonProperty("valueSet")
    public void setValueSet(java.util.Optional<com.fhir.canonical> valueSet) {
      this.valueSet = valueSet;
      this.valueSetIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> searchParam() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> path() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Coding>> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
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
  static ImmutableDataRequirement_CodeFilter fromJson(Json json) {
    ImmutableDataRequirement_CodeFilter.Builder builder = ImmutableDataRequirement_CodeFilter.builder();
    if (json.searchParamIsSet) {
      builder.searchParam(json.searchParam);
    }
    if (json.pathIsSet) {
      builder.path(json.path);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.valueSetIsSet) {
      builder.valueSet(json.valueSet);
    }
    return (ImmutableDataRequirement_CodeFilter) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DataRequirement_CodeFilter} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DataRequirement_CodeFilter instance
   */
  public static DataRequirement_CodeFilter copyOf(DataRequirement_CodeFilter instance) {
    if (instance instanceof ImmutableDataRequirement_CodeFilter) {
      return (ImmutableDataRequirement_CodeFilter) instance;
    }
    return ImmutableDataRequirement_CodeFilter.builder()
        .searchParam(instance.searchParam())
        .path(instance.path())
        .extension(instance.extension())
        .code(instance.code())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .valueSet(instance.valueSet())
        .build();
  }

  /**
   * Creates a builder for {@link DataRequirement_CodeFilter DataRequirement_CodeFilter}.
   * <pre>
   * ImmutableDataRequirement_CodeFilter.builder()
   *    .searchParam(String) // optional {@link DataRequirement_CodeFilter#searchParam() searchParam}
   *    .path(String) // optional {@link DataRequirement_CodeFilter#path() path}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DataRequirement_CodeFilter#extension() extension}
   *    .code(List&amp;lt;com.fhir.Coding&amp;gt;) // optional {@link DataRequirement_CodeFilter#code() code}
   *    .id(String) // optional {@link DataRequirement_CodeFilter#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DataRequirement_CodeFilter#modifierExtension() modifierExtension}
   *    .valueSet(com.fhir.canonical) // optional {@link DataRequirement_CodeFilter#valueSet() valueSet}
   *    .build();
   * </pre>
   * @return A new DataRequirement_CodeFilter builder
   */
  public static ImmutableDataRequirement_CodeFilter.Builder builder() {
    return new ImmutableDataRequirement_CodeFilter.Builder();
  }

  /**
   * Builds instances of type {@link DataRequirement_CodeFilter DataRequirement_CodeFilter}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "DataRequirement_CodeFilter", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_SEARCH_PARAM = 0x1L;
    private static final long OPT_BIT_PATH = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_CODE = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_VALUE_SET = 0x40L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String searchParam;
    private @javax.annotation.Nullable java.lang.String path;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Coding> code;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.canonical valueSet;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DataRequirement_CodeFilter#searchParam() searchParam} to searchParam.
     * @param searchParam The value for searchParam
     * @return {@code this} builder for chained invocation
     */
    public final Builder searchParam(java.lang.String searchParam) {
      checkNotIsSet(searchParamIsSet(), "searchParam");
      this.searchParam = java.util.Objects.requireNonNull(searchParam, "searchParam");
      optBits |= OPT_BIT_SEARCH_PARAM;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement_CodeFilter#searchParam() searchParam} to searchParam.
     * @param searchParam The value for searchParam
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("searchParam")
    public final Builder searchParam(java.util.Optional<java.lang.String> searchParam) {
      checkNotIsSet(searchParamIsSet(), "searchParam");
      this.searchParam = searchParam.orElse(null);
      optBits |= OPT_BIT_SEARCH_PARAM;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement_CodeFilter#path() path} to path.
     * @param path The value for path
     * @return {@code this} builder for chained invocation
     */
    public final Builder path(java.lang.String path) {
      checkNotIsSet(pathIsSet(), "path");
      this.path = java.util.Objects.requireNonNull(path, "path");
      optBits |= OPT_BIT_PATH;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement_CodeFilter#path() path} to path.
     * @param path The value for path
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    public final Builder path(java.util.Optional<java.lang.String> path) {
      checkNotIsSet(pathIsSet(), "path");
      this.path = path.orElse(null);
      optBits |= OPT_BIT_PATH;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement_CodeFilter#extension() extension} to extension.
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
     * Initializes the optional value {@link DataRequirement_CodeFilter#extension() extension} to extension.
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
     * Initializes the optional value {@link DataRequirement_CodeFilter#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(java.util.List<com.fhir.Coding> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement_CodeFilter#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(java.util.Optional<? extends java.util.List<com.fhir.Coding>> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement_CodeFilter#id() id} to id.
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
     * Initializes the optional value {@link DataRequirement_CodeFilter#id() id} to id.
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
     * Initializes the optional value {@link DataRequirement_CodeFilter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DataRequirement_CodeFilter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DataRequirement_CodeFilter#valueSet() valueSet} to valueSet.
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
     * Initializes the optional value {@link DataRequirement_CodeFilter#valueSet() valueSet} to valueSet.
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
     * Builds a new {@link DataRequirement_CodeFilter DataRequirement_CodeFilter}.
     * @return An immutable instance of DataRequirement_CodeFilter
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.DataRequirement_CodeFilter build() {
      return new ImmutableDataRequirement_CodeFilter(searchParam, path, extension, code, id, modifierExtension, valueSet);
    }

    private boolean searchParamIsSet() {
      return (optBits & OPT_BIT_SEARCH_PARAM) != 0;
    }

    private boolean pathIsSet() {
      return (optBits & OPT_BIT_PATH) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean valueSetIsSet() {
      return (optBits & OPT_BIT_VALUE_SET) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of DataRequirement_CodeFilter is strict, attribute is already set: ".concat(name));
    }
  }
}

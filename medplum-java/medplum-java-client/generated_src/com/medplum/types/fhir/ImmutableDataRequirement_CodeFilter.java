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
 * Immutable implementation of {@link DataRequirement_CodeFilter}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDataRequirement_CodeFilter.builder()}.
 */
@Generated(from = "DataRequirement_CodeFilter", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDataRequirement_CodeFilter
    implements DataRequirement_CodeFilter {
  private final @Nullable Canonical valueSet;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String path;
  private final @Nullable List<Coding> code;
  private final @Nullable String id;
  private final @Nullable String searchParam;

  private ImmutableDataRequirement_CodeFilter(
      @Nullable Canonical valueSet,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable String path,
      @Nullable List<Coding> code,
      @Nullable String id,
      @Nullable String searchParam) {
    this.valueSet = valueSet;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.path = path;
    this.code = code;
    this.id = id;
    this.searchParam = searchParam;
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code path} attribute
   */
  @JsonProperty("path")
  @Override
  public Optional<String> path() {
    return Optional.ofNullable(path);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<List<Coding>> code() {
    return Optional.ofNullable(code);
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
   * @return The value of the {@code searchParam} attribute
   */
  @JsonProperty("searchParam")
  @Override
  public Optional<String> searchParam() {
    return Optional.ofNullable(searchParam);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement_CodeFilter#valueSet() valueSet} attribute.
   * @param value The value for valueSet
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_CodeFilter withValueSet(Canonical value) {
    @Nullable Canonical newValue = Objects.requireNonNull(value, "valueSet");
    if (this.valueSet == newValue) return this;
    return new ImmutableDataRequirement_CodeFilter(
        newValue,
        this.extension,
        this.modifierExtension,
        this.path,
        this.code,
        this.id,
        this.searchParam);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement_CodeFilter#valueSet() valueSet} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueSet
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement_CodeFilter withValueSet(Optional<? extends Canonical> optional) {
    @Nullable Canonical value = optional.orElse(null);
    if (this.valueSet == value) return this;
    return new ImmutableDataRequirement_CodeFilter(value, this.extension, this.modifierExtension, this.path, this.code, this.id, this.searchParam);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement_CodeFilter#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_CodeFilter withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDataRequirement_CodeFilter(
        this.valueSet,
        newValue,
        this.modifierExtension,
        this.path,
        this.code,
        this.id,
        this.searchParam);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement_CodeFilter#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement_CodeFilter withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDataRequirement_CodeFilter(this.valueSet, value, this.modifierExtension, this.path, this.code, this.id, this.searchParam);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement_CodeFilter#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_CodeFilter withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDataRequirement_CodeFilter(this.valueSet, this.extension, newValue, this.path, this.code, this.id, this.searchParam);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement_CodeFilter#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement_CodeFilter withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDataRequirement_CodeFilter(this.valueSet, this.extension, value, this.path, this.code, this.id, this.searchParam);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement_CodeFilter#path() path} attribute.
   * @param value The value for path
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_CodeFilter withPath(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "path");
    if (Objects.equals(this.path, newValue)) return this;
    return new ImmutableDataRequirement_CodeFilter(
        this.valueSet,
        this.extension,
        this.modifierExtension,
        newValue,
        this.code,
        this.id,
        this.searchParam);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement_CodeFilter#path() path} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for path
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_CodeFilter withPath(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.path, value)) return this;
    return new ImmutableDataRequirement_CodeFilter(
        this.valueSet,
        this.extension,
        this.modifierExtension,
        value,
        this.code,
        this.id,
        this.searchParam);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement_CodeFilter#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_CodeFilter withCode(List<Coding> value) {
    @Nullable List<Coding> newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableDataRequirement_CodeFilter(
        this.valueSet,
        this.extension,
        this.modifierExtension,
        this.path,
        newValue,
        this.id,
        this.searchParam);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement_CodeFilter#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement_CodeFilter withCode(Optional<? extends List<Coding>> optional) {
    @Nullable List<Coding> value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableDataRequirement_CodeFilter(
        this.valueSet,
        this.extension,
        this.modifierExtension,
        this.path,
        value,
        this.id,
        this.searchParam);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement_CodeFilter#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_CodeFilter withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableDataRequirement_CodeFilter(
        this.valueSet,
        this.extension,
        this.modifierExtension,
        this.path,
        this.code,
        newValue,
        this.searchParam);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement_CodeFilter#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_CodeFilter withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableDataRequirement_CodeFilter(
        this.valueSet,
        this.extension,
        this.modifierExtension,
        this.path,
        this.code,
        value,
        this.searchParam);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement_CodeFilter#searchParam() searchParam} attribute.
   * @param value The value for searchParam
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_CodeFilter withSearchParam(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "searchParam");
    if (Objects.equals(this.searchParam, newValue)) return this;
    return new ImmutableDataRequirement_CodeFilter(this.valueSet, this.extension, this.modifierExtension, this.path, this.code, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement_CodeFilter#searchParam() searchParam} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for searchParam
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_CodeFilter withSearchParam(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.searchParam, value)) return this;
    return new ImmutableDataRequirement_CodeFilter(this.valueSet, this.extension, this.modifierExtension, this.path, this.code, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDataRequirement_CodeFilter} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDataRequirement_CodeFilter
        && equalTo((ImmutableDataRequirement_CodeFilter) another);
  }

  private boolean equalTo(ImmutableDataRequirement_CodeFilter another) {
    return Objects.equals(valueSet, another.valueSet)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(path, another.path)
        && Objects.equals(code, another.code)
        && Objects.equals(id, another.id)
        && Objects.equals(searchParam, another.searchParam);
  }

  /**
   * Computes a hash code from attributes: {@code valueSet}, {@code extension}, {@code modifierExtension}, {@code path}, {@code code}, {@code id}, {@code searchParam}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(valueSet);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(path);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(searchParam);
    return h;
  }

  /**
   * Prints the immutable value {@code DataRequirement_CodeFilter} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("DataRequirement_CodeFilter{");
    if (valueSet != null) {
      builder.append("valueSet=").append(valueSet);
    }
    if (extension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (path != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("path=").append(path);
    }
    if (code != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (id != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (searchParam != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("searchParam=").append(searchParam);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "DataRequirement_CodeFilter", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements DataRequirement_CodeFilter {
    @Nullable Optional<Canonical> valueSet = Optional.empty();
    boolean valueSetIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> path = Optional.empty();
    boolean pathIsSet;
    @Nullable Optional<List<Coding>> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> searchParam = Optional.empty();
    boolean searchParamIsSet;
    @JsonProperty("valueSet")
    public void setValueSet(Optional<Canonical> valueSet) {
      this.valueSet = valueSet;
      this.valueSetIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("path")
    public void setPath(Optional<String> path) {
      this.path = path;
      this.pathIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<List<Coding>> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("searchParam")
    public void setSearchParam(Optional<String> searchParam) {
      this.searchParam = searchParam;
      this.searchParamIsSet = true;
    }
    @Override
    public Optional<Canonical> valueSet() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> path() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Coding>> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> searchParam() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDataRequirement_CodeFilter fromJson(Json json) {
    ImmutableDataRequirement_CodeFilter.Builder builder = ImmutableDataRequirement_CodeFilter.builder();
    if (json.valueSetIsSet) {
      builder.valueSet(json.valueSet);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.pathIsSet) {
      builder.path(json.path);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.searchParamIsSet) {
      builder.searchParam(json.searchParam);
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
        .valueSet(instance.valueSet())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .path(instance.path())
        .code(instance.code())
        .id(instance.id())
        .searchParam(instance.searchParam())
        .build();
  }

  /**
   * Creates a builder for {@link DataRequirement_CodeFilter DataRequirement_CodeFilter}.
   * <pre>
   * ImmutableDataRequirement_CodeFilter.builder()
   *    .valueSet(com.medplum.types.fhir.Canonical) // optional {@link DataRequirement_CodeFilter#valueSet() valueSet}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link DataRequirement_CodeFilter#extension() extension}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link DataRequirement_CodeFilter#modifierExtension() modifierExtension}
   *    .path(String) // optional {@link DataRequirement_CodeFilter#path() path}
   *    .code(List&amp;lt;com.medplum.types.fhir.Coding&amp;gt;) // optional {@link DataRequirement_CodeFilter#code() code}
   *    .id(String) // optional {@link DataRequirement_CodeFilter#id() id}
   *    .searchParam(String) // optional {@link DataRequirement_CodeFilter#searchParam() searchParam}
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
  @Generated(from = "DataRequirement_CodeFilter", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_VALUE_SET = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_PATH = 0x8L;
    private static final long OPT_BIT_CODE = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_SEARCH_PARAM = 0x40L;
    private long optBits;

    private @Nullable Canonical valueSet;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String path;
    private @Nullable List<Coding> code;
    private @Nullable String id;
    private @Nullable String searchParam;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DataRequirement_CodeFilter#valueSet() valueSet} to valueSet.
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
     * Initializes the optional value {@link DataRequirement_CodeFilter#valueSet() valueSet} to valueSet.
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
     * Initializes the optional value {@link DataRequirement_CodeFilter#extension() extension} to extension.
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
     * Initializes the optional value {@link DataRequirement_CodeFilter#extension() extension} to extension.
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
     * Initializes the optional value {@link DataRequirement_CodeFilter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DataRequirement_CodeFilter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DataRequirement_CodeFilter#path() path} to path.
     * @param path The value for path
     * @return {@code this} builder for chained invocation
     */
    public final Builder path(String path) {
      checkNotIsSet(pathIsSet(), "path");
      this.path = Objects.requireNonNull(path, "path");
      optBits |= OPT_BIT_PATH;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement_CodeFilter#path() path} to path.
     * @param path The value for path
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("path")
    public final Builder path(Optional<String> path) {
      checkNotIsSet(pathIsSet(), "path");
      this.path = path.orElse(null);
      optBits |= OPT_BIT_PATH;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement_CodeFilter#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(List<Coding> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement_CodeFilter#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends List<Coding>> code) {
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
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement_CodeFilter#id() id} to id.
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
     * Initializes the optional value {@link DataRequirement_CodeFilter#searchParam() searchParam} to searchParam.
     * @param searchParam The value for searchParam
     * @return {@code this} builder for chained invocation
     */
    public final Builder searchParam(String searchParam) {
      checkNotIsSet(searchParamIsSet(), "searchParam");
      this.searchParam = Objects.requireNonNull(searchParam, "searchParam");
      optBits |= OPT_BIT_SEARCH_PARAM;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement_CodeFilter#searchParam() searchParam} to searchParam.
     * @param searchParam The value for searchParam
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("searchParam")
    public final Builder searchParam(Optional<String> searchParam) {
      checkNotIsSet(searchParamIsSet(), "searchParam");
      this.searchParam = searchParam.orElse(null);
      optBits |= OPT_BIT_SEARCH_PARAM;
      return this;
    }

    /**
     * Builds a new {@link DataRequirement_CodeFilter DataRequirement_CodeFilter}.
     * @return An immutable instance of DataRequirement_CodeFilter
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public DataRequirement_CodeFilter build() {
      return new ImmutableDataRequirement_CodeFilter(valueSet, extension, modifierExtension, path, code, id, searchParam);
    }

    private boolean valueSetIsSet() {
      return (optBits & OPT_BIT_VALUE_SET) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean pathIsSet() {
      return (optBits & OPT_BIT_PATH) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean searchParamIsSet() {
      return (optBits & OPT_BIT_SEARCH_PARAM) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of DataRequirement_CodeFilter is strict, attribute is already set: ".concat(name));
    }
  }
}

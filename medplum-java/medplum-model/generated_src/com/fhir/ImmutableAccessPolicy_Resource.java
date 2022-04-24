package com.fhir;

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
 * Immutable implementation of {@link AccessPolicy_Resource}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAccessPolicy_Resource.builder()}.
 */
@Generated(from = "AccessPolicy_Resource", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAccessPolicy_Resource implements AccessPolicy_Resource {
  private final @Nullable Reference compartment;
  private final @Nullable Boolean readonly;
  private final @Nullable List<String> hiddenFields;
  private final @Nullable List<String> readonlyFields;
  private final @Nullable String resourceType;

  private ImmutableAccessPolicy_Resource(
      @Nullable Reference compartment,
      @Nullable Boolean readonly,
      @Nullable List<String> hiddenFields,
      @Nullable List<String> readonlyFields,
      @Nullable String resourceType) {
    this.compartment = compartment;
    this.readonly = readonly;
    this.hiddenFields = hiddenFields;
    this.readonlyFields = readonlyFields;
    this.resourceType = resourceType;
  }

  /**
   * @return The value of the {@code compartment} attribute
   */
  @JsonProperty("compartment")
  @Override
  public Optional<Reference> compartment() {
    return Optional.ofNullable(compartment);
  }

  /**
   * @return The value of the {@code readonly} attribute
   */
  @JsonProperty("readonly")
  @Override
  public Optional<Boolean> readonly() {
    return Optional.ofNullable(readonly);
  }

  /**
   * @return The value of the {@code hiddenFields} attribute
   */
  @JsonProperty("hiddenFields")
  @Override
  public Optional<List<String>> hiddenFields() {
    return Optional.ofNullable(hiddenFields);
  }

  /**
   * @return The value of the {@code readonlyFields} attribute
   */
  @JsonProperty("readonlyFields")
  @Override
  public Optional<List<String>> readonlyFields() {
    return Optional.ofNullable(readonlyFields);
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public Optional<String> resourceType() {
    return Optional.ofNullable(resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AccessPolicy_Resource#compartment() compartment} attribute.
   * @param value The value for compartment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccessPolicy_Resource withCompartment(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "compartment");
    if (this.compartment == newValue) return this;
    return new ImmutableAccessPolicy_Resource(newValue, this.readonly, this.hiddenFields, this.readonlyFields, this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AccessPolicy_Resource#compartment() compartment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for compartment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccessPolicy_Resource withCompartment(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.compartment == value) return this;
    return new ImmutableAccessPolicy_Resource(value, this.readonly, this.hiddenFields, this.readonlyFields, this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AccessPolicy_Resource#readonly() readonly} attribute.
   * @param value The value for readonly
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccessPolicy_Resource withReadonly(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.readonly, newValue)) return this;
    return new ImmutableAccessPolicy_Resource(this.compartment, newValue, this.hiddenFields, this.readonlyFields, this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AccessPolicy_Resource#readonly() readonly} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for readonly
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccessPolicy_Resource withReadonly(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.readonly, value)) return this;
    return new ImmutableAccessPolicy_Resource(this.compartment, value, this.hiddenFields, this.readonlyFields, this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AccessPolicy_Resource#hiddenFields() hiddenFields} attribute.
   * @param value The value for hiddenFields
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccessPolicy_Resource withHiddenFields(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "hiddenFields");
    if (this.hiddenFields == newValue) return this;
    return new ImmutableAccessPolicy_Resource(this.compartment, this.readonly, newValue, this.readonlyFields, this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AccessPolicy_Resource#hiddenFields() hiddenFields} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for hiddenFields
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccessPolicy_Resource withHiddenFields(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.hiddenFields == value) return this;
    return new ImmutableAccessPolicy_Resource(this.compartment, this.readonly, value, this.readonlyFields, this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AccessPolicy_Resource#readonlyFields() readonlyFields} attribute.
   * @param value The value for readonlyFields
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccessPolicy_Resource withReadonlyFields(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "readonlyFields");
    if (this.readonlyFields == newValue) return this;
    return new ImmutableAccessPolicy_Resource(this.compartment, this.readonly, this.hiddenFields, newValue, this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AccessPolicy_Resource#readonlyFields() readonlyFields} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for readonlyFields
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccessPolicy_Resource withReadonlyFields(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.readonlyFields == value) return this;
    return new ImmutableAccessPolicy_Resource(this.compartment, this.readonly, this.hiddenFields, value, this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AccessPolicy_Resource#resourceType() resourceType} attribute.
   * @param value The value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccessPolicy_Resource withResourceType(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "resourceType");
    if (Objects.equals(this.resourceType, newValue)) return this;
    return new ImmutableAccessPolicy_Resource(this.compartment, this.readonly, this.hiddenFields, this.readonlyFields, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AccessPolicy_Resource#resourceType() resourceType} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccessPolicy_Resource withResourceType(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.resourceType, value)) return this;
    return new ImmutableAccessPolicy_Resource(this.compartment, this.readonly, this.hiddenFields, this.readonlyFields, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAccessPolicy_Resource} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAccessPolicy_Resource
        && equalTo((ImmutableAccessPolicy_Resource) another);
  }

  private boolean equalTo(ImmutableAccessPolicy_Resource another) {
    return Objects.equals(compartment, another.compartment)
        && Objects.equals(readonly, another.readonly)
        && Objects.equals(hiddenFields, another.hiddenFields)
        && Objects.equals(readonlyFields, another.readonlyFields)
        && Objects.equals(resourceType, another.resourceType);
  }

  /**
   * Computes a hash code from attributes: {@code compartment}, {@code readonly}, {@code hiddenFields}, {@code readonlyFields}, {@code resourceType}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(compartment);
    h += (h << 5) + Objects.hashCode(readonly);
    h += (h << 5) + Objects.hashCode(hiddenFields);
    h += (h << 5) + Objects.hashCode(readonlyFields);
    h += (h << 5) + Objects.hashCode(resourceType);
    return h;
  }

  /**
   * Prints the immutable value {@code AccessPolicy_Resource} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("AccessPolicy_Resource{");
    if (compartment != null) {
      builder.append("compartment=").append(compartment);
    }
    if (readonly != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("readonly=").append(readonly);
    }
    if (hiddenFields != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("hiddenFields=").append(hiddenFields);
    }
    if (readonlyFields != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("readonlyFields=").append(readonlyFields);
    }
    if (resourceType != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("resourceType=").append(resourceType);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "AccessPolicy_Resource", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AccessPolicy_Resource {
    @Nullable Optional<Reference> compartment = Optional.empty();
    boolean compartmentIsSet;
    @Nullable Optional<Boolean> readonly = Optional.empty();
    boolean readonlyIsSet;
    @Nullable Optional<List<String>> hiddenFields = Optional.empty();
    boolean hiddenFieldsIsSet;
    @Nullable Optional<List<String>> readonlyFields = Optional.empty();
    boolean readonlyFieldsIsSet;
    @Nullable Optional<String> resourceType = Optional.empty();
    boolean resourceTypeIsSet;
    @JsonProperty("compartment")
    public void setCompartment(Optional<Reference> compartment) {
      this.compartment = compartment;
      this.compartmentIsSet = true;
    }
    @JsonProperty("readonly")
    public void setReadonly(Optional<Boolean> readonly) {
      this.readonly = readonly;
      this.readonlyIsSet = true;
    }
    @JsonProperty("hiddenFields")
    public void setHiddenFields(Optional<List<String>> hiddenFields) {
      this.hiddenFields = hiddenFields;
      this.hiddenFieldsIsSet = true;
    }
    @JsonProperty("readonlyFields")
    public void setReadonlyFields(Optional<List<String>> readonlyFields) {
      this.readonlyFields = readonlyFields;
      this.readonlyFieldsIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(Optional<String> resourceType) {
      this.resourceType = resourceType;
      this.resourceTypeIsSet = true;
    }
    @Override
    public Optional<Reference> compartment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> readonly() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> hiddenFields() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> readonlyFields() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> resourceType() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAccessPolicy_Resource fromJson(Json json) {
    ImmutableAccessPolicy_Resource.Builder builder = ImmutableAccessPolicy_Resource.builder();
    if (json.compartmentIsSet) {
      builder.compartment(json.compartment);
    }
    if (json.readonlyIsSet) {
      builder.readonly(json.readonly);
    }
    if (json.hiddenFieldsIsSet) {
      builder.hiddenFields(json.hiddenFields);
    }
    if (json.readonlyFieldsIsSet) {
      builder.readonlyFields(json.readonlyFields);
    }
    if (json.resourceTypeIsSet) {
      builder.resourceType(json.resourceType);
    }
    return (ImmutableAccessPolicy_Resource) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AccessPolicy_Resource} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AccessPolicy_Resource instance
   */
  public static AccessPolicy_Resource copyOf(AccessPolicy_Resource instance) {
    if (instance instanceof ImmutableAccessPolicy_Resource) {
      return (ImmutableAccessPolicy_Resource) instance;
    }
    return ImmutableAccessPolicy_Resource.builder()
        .compartment(instance.compartment())
        .readonly(instance.readonly())
        .hiddenFields(instance.hiddenFields())
        .readonlyFields(instance.readonlyFields())
        .resourceType(instance.resourceType())
        .build();
  }

  /**
   * Creates a builder for {@link AccessPolicy_Resource AccessPolicy_Resource}.
   * <pre>
   * ImmutableAccessPolicy_Resource.builder()
   *    .compartment(com.fhir.Reference) // optional {@link AccessPolicy_Resource#compartment() compartment}
   *    .readonly(Boolean) // optional {@link AccessPolicy_Resource#readonly() readonly}
   *    .hiddenFields(List&amp;lt;String&amp;gt;) // optional {@link AccessPolicy_Resource#hiddenFields() hiddenFields}
   *    .readonlyFields(List&amp;lt;String&amp;gt;) // optional {@link AccessPolicy_Resource#readonlyFields() readonlyFields}
   *    .resourceType(String) // optional {@link AccessPolicy_Resource#resourceType() resourceType}
   *    .build();
   * </pre>
   * @return A new AccessPolicy_Resource builder
   */
  public static ImmutableAccessPolicy_Resource.Builder builder() {
    return new ImmutableAccessPolicy_Resource.Builder();
  }

  /**
   * Builds instances of type {@link AccessPolicy_Resource AccessPolicy_Resource}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "AccessPolicy_Resource", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_COMPARTMENT = 0x1L;
    private static final long OPT_BIT_READONLY = 0x2L;
    private static final long OPT_BIT_HIDDEN_FIELDS = 0x4L;
    private static final long OPT_BIT_READONLY_FIELDS = 0x8L;
    private static final long OPT_BIT_RESOURCE_TYPE = 0x10L;
    private long optBits;

    private @Nullable Reference compartment;
    private @Nullable Boolean readonly;
    private @Nullable List<String> hiddenFields;
    private @Nullable List<String> readonlyFields;
    private @Nullable String resourceType;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link AccessPolicy_Resource#compartment() compartment} to compartment.
     * @param compartment The value for compartment
     * @return {@code this} builder for chained invocation
     */
    public final Builder compartment(Reference compartment) {
      checkNotIsSet(compartmentIsSet(), "compartment");
      this.compartment = Objects.requireNonNull(compartment, "compartment");
      optBits |= OPT_BIT_COMPARTMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link AccessPolicy_Resource#compartment() compartment} to compartment.
     * @param compartment The value for compartment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("compartment")
    public final Builder compartment(Optional<? extends Reference> compartment) {
      checkNotIsSet(compartmentIsSet(), "compartment");
      this.compartment = compartment.orElse(null);
      optBits |= OPT_BIT_COMPARTMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link AccessPolicy_Resource#readonly() readonly} to readonly.
     * @param readonly The value for readonly
     * @return {@code this} builder for chained invocation
     */
    public final Builder readonly(boolean readonly) {
      checkNotIsSet(readonlyIsSet(), "readonly");
      this.readonly = readonly;
      optBits |= OPT_BIT_READONLY;
      return this;
    }

    /**
     * Initializes the optional value {@link AccessPolicy_Resource#readonly() readonly} to readonly.
     * @param readonly The value for readonly
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("readonly")
    public final Builder readonly(Optional<Boolean> readonly) {
      checkNotIsSet(readonlyIsSet(), "readonly");
      this.readonly = readonly.orElse(null);
      optBits |= OPT_BIT_READONLY;
      return this;
    }

    /**
     * Initializes the optional value {@link AccessPolicy_Resource#hiddenFields() hiddenFields} to hiddenFields.
     * @param hiddenFields The value for hiddenFields
     * @return {@code this} builder for chained invocation
     */
    public final Builder hiddenFields(List<String> hiddenFields) {
      checkNotIsSet(hiddenFieldsIsSet(), "hiddenFields");
      this.hiddenFields = Objects.requireNonNull(hiddenFields, "hiddenFields");
      optBits |= OPT_BIT_HIDDEN_FIELDS;
      return this;
    }

    /**
     * Initializes the optional value {@link AccessPolicy_Resource#hiddenFields() hiddenFields} to hiddenFields.
     * @param hiddenFields The value for hiddenFields
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("hiddenFields")
    public final Builder hiddenFields(Optional<? extends List<String>> hiddenFields) {
      checkNotIsSet(hiddenFieldsIsSet(), "hiddenFields");
      this.hiddenFields = hiddenFields.orElse(null);
      optBits |= OPT_BIT_HIDDEN_FIELDS;
      return this;
    }

    /**
     * Initializes the optional value {@link AccessPolicy_Resource#readonlyFields() readonlyFields} to readonlyFields.
     * @param readonlyFields The value for readonlyFields
     * @return {@code this} builder for chained invocation
     */
    public final Builder readonlyFields(List<String> readonlyFields) {
      checkNotIsSet(readonlyFieldsIsSet(), "readonlyFields");
      this.readonlyFields = Objects.requireNonNull(readonlyFields, "readonlyFields");
      optBits |= OPT_BIT_READONLY_FIELDS;
      return this;
    }

    /**
     * Initializes the optional value {@link AccessPolicy_Resource#readonlyFields() readonlyFields} to readonlyFields.
     * @param readonlyFields The value for readonlyFields
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("readonlyFields")
    public final Builder readonlyFields(Optional<? extends List<String>> readonlyFields) {
      checkNotIsSet(readonlyFieldsIsSet(), "readonlyFields");
      this.readonlyFields = readonlyFields.orElse(null);
      optBits |= OPT_BIT_READONLY_FIELDS;
      return this;
    }

    /**
     * Initializes the optional value {@link AccessPolicy_Resource#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for chained invocation
     */
    public final Builder resourceType(String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = Objects.requireNonNull(resourceType, "resourceType");
      optBits |= OPT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link AccessPolicy_Resource#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resourceType")
    public final Builder resourceType(Optional<String> resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = resourceType.orElse(null);
      optBits |= OPT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Builds a new {@link AccessPolicy_Resource AccessPolicy_Resource}.
     * @return An immutable instance of AccessPolicy_Resource
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public AccessPolicy_Resource build() {
      return new ImmutableAccessPolicy_Resource(compartment, readonly, hiddenFields, readonlyFields, resourceType);
    }

    private boolean compartmentIsSet() {
      return (optBits & OPT_BIT_COMPARTMENT) != 0;
    }

    private boolean readonlyIsSet() {
      return (optBits & OPT_BIT_READONLY) != 0;
    }

    private boolean hiddenFieldsIsSet() {
      return (optBits & OPT_BIT_HIDDEN_FIELDS) != 0;
    }

    private boolean readonlyFieldsIsSet() {
      return (optBits & OPT_BIT_READONLY_FIELDS) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (optBits & OPT_BIT_RESOURCE_TYPE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of AccessPolicy_Resource is strict, attribute is already set: ".concat(name));
    }
  }
}

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
 * Immutable implementation of {@link AccessPolicy}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAccessPolicy.builder()}.
 */
@Generated(from = "AccessPolicy", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAccessPolicy implements AccessPolicy {
  private final @Nullable Code language;
  private final @Nullable Meta meta;
  private final @Nullable Id id;
  private final @Nullable String resourceType;
  private final @Nullable Uri implicitRules;
  private final @Nullable String name;
  private final @Nullable List<AccessPolicy_Resource> resource;
  private final @Nullable Reference compartment;

  private ImmutableAccessPolicy(
      @Nullable Code language,
      @Nullable Meta meta,
      @Nullable Id id,
      @Nullable String resourceType,
      @Nullable Uri implicitRules,
      @Nullable String name,
      @Nullable List<AccessPolicy_Resource> resource,
      @Nullable Reference compartment) {
    this.language = language;
    this.meta = meta;
    this.id = id;
    this.resourceType = resourceType;
    this.implicitRules = implicitRules;
    this.name = name;
    this.resource = resource;
    this.compartment = compartment;
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code resource} attribute
   */
  @JsonProperty("resource")
  @Override
  public Optional<List<AccessPolicy_Resource>> resource() {
    return Optional.ofNullable(resource);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AccessPolicy#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccessPolicy withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableAccessPolicy(
        newValue,
        this.meta,
        this.id,
        this.resourceType,
        this.implicitRules,
        this.name,
        this.resource,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AccessPolicy#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccessPolicy withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableAccessPolicy(
        value,
        this.meta,
        this.id,
        this.resourceType,
        this.implicitRules,
        this.name,
        this.resource,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AccessPolicy#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccessPolicy withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableAccessPolicy(
        this.language,
        newValue,
        this.id,
        this.resourceType,
        this.implicitRules,
        this.name,
        this.resource,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AccessPolicy#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccessPolicy withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableAccessPolicy(
        this.language,
        value,
        this.id,
        this.resourceType,
        this.implicitRules,
        this.name,
        this.resource,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AccessPolicy#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccessPolicy withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableAccessPolicy(
        this.language,
        this.meta,
        newValue,
        this.resourceType,
        this.implicitRules,
        this.name,
        this.resource,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AccessPolicy#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccessPolicy withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableAccessPolicy(
        this.language,
        this.meta,
        value,
        this.resourceType,
        this.implicitRules,
        this.name,
        this.resource,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AccessPolicy#resourceType() resourceType} attribute.
   * @param value The value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccessPolicy withResourceType(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "resourceType");
    if (Objects.equals(this.resourceType, newValue)) return this;
    return new ImmutableAccessPolicy(
        this.language,
        this.meta,
        this.id,
        newValue,
        this.implicitRules,
        this.name,
        this.resource,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AccessPolicy#resourceType() resourceType} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccessPolicy withResourceType(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.resourceType, value)) return this;
    return new ImmutableAccessPolicy(
        this.language,
        this.meta,
        this.id,
        value,
        this.implicitRules,
        this.name,
        this.resource,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AccessPolicy#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccessPolicy withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableAccessPolicy(
        this.language,
        this.meta,
        this.id,
        this.resourceType,
        newValue,
        this.name,
        this.resource,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AccessPolicy#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccessPolicy withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableAccessPolicy(
        this.language,
        this.meta,
        this.id,
        this.resourceType,
        value,
        this.name,
        this.resource,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AccessPolicy#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccessPolicy withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableAccessPolicy(
        this.language,
        this.meta,
        this.id,
        this.resourceType,
        this.implicitRules,
        newValue,
        this.resource,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AccessPolicy#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccessPolicy withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableAccessPolicy(
        this.language,
        this.meta,
        this.id,
        this.resourceType,
        this.implicitRules,
        value,
        this.resource,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AccessPolicy#resource() resource} attribute.
   * @param value The value for resource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccessPolicy withResource(List<AccessPolicy_Resource> value) {
    @Nullable List<AccessPolicy_Resource> newValue = Objects.requireNonNull(value, "resource");
    if (this.resource == newValue) return this;
    return new ImmutableAccessPolicy(
        this.language,
        this.meta,
        this.id,
        this.resourceType,
        this.implicitRules,
        this.name,
        newValue,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AccessPolicy#resource() resource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccessPolicy withResource(Optional<? extends List<AccessPolicy_Resource>> optional) {
    @Nullable List<AccessPolicy_Resource> value = optional.orElse(null);
    if (this.resource == value) return this;
    return new ImmutableAccessPolicy(
        this.language,
        this.meta,
        this.id,
        this.resourceType,
        this.implicitRules,
        this.name,
        value,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AccessPolicy#compartment() compartment} attribute.
   * @param value The value for compartment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccessPolicy withCompartment(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "compartment");
    if (this.compartment == newValue) return this;
    return new ImmutableAccessPolicy(
        this.language,
        this.meta,
        this.id,
        this.resourceType,
        this.implicitRules,
        this.name,
        this.resource,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AccessPolicy#compartment() compartment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for compartment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccessPolicy withCompartment(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.compartment == value) return this;
    return new ImmutableAccessPolicy(
        this.language,
        this.meta,
        this.id,
        this.resourceType,
        this.implicitRules,
        this.name,
        this.resource,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAccessPolicy} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAccessPolicy
        && equalTo((ImmutableAccessPolicy) another);
  }

  private boolean equalTo(ImmutableAccessPolicy another) {
    return Objects.equals(language, another.language)
        && Objects.equals(meta, another.meta)
        && Objects.equals(id, another.id)
        && Objects.equals(resourceType, another.resourceType)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(name, another.name)
        && Objects.equals(resource, another.resource)
        && Objects.equals(compartment, another.compartment);
  }

  /**
   * Computes a hash code from attributes: {@code language}, {@code meta}, {@code id}, {@code resourceType}, {@code implicitRules}, {@code name}, {@code resource}, {@code compartment}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(resourceType);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(resource);
    h += (h << 5) + Objects.hashCode(compartment);
    return h;
  }

  /**
   * Prints the immutable value {@code AccessPolicy} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("AccessPolicy{");
    if (language != null) {
      builder.append("language=").append(language);
    }
    if (meta != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (id != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (resourceType != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("resourceType=").append(resourceType);
    }
    if (implicitRules != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (name != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (resource != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("resource=").append(resource);
    }
    if (compartment != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("compartment=").append(compartment);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "AccessPolicy", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AccessPolicy {
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> resourceType = Optional.empty();
    boolean resourceTypeIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<List<AccessPolicy_Resource>> resource = Optional.empty();
    boolean resourceIsSet;
    @Nullable Optional<Reference> compartment = Optional.empty();
    boolean compartmentIsSet;
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(Optional<String> resourceType) {
      this.resourceType = resourceType;
      this.resourceTypeIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("resource")
    public void setResource(Optional<List<AccessPolicy_Resource>> resource) {
      this.resource = resource;
      this.resourceIsSet = true;
    }
    @JsonProperty("compartment")
    public void setCompartment(Optional<Reference> compartment) {
      this.compartment = compartment;
      this.compartmentIsSet = true;
    }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<AccessPolicy_Resource>> resource() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> compartment() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAccessPolicy fromJson(Json json) {
    ImmutableAccessPolicy.Builder builder = ImmutableAccessPolicy.builder();
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.resourceTypeIsSet) {
      builder.resourceType(json.resourceType);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.resourceIsSet) {
      builder.resource(json.resource);
    }
    if (json.compartmentIsSet) {
      builder.compartment(json.compartment);
    }
    return (ImmutableAccessPolicy) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AccessPolicy} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AccessPolicy instance
   */
  public static AccessPolicy copyOf(AccessPolicy instance) {
    if (instance instanceof ImmutableAccessPolicy) {
      return (ImmutableAccessPolicy) instance;
    }
    return ImmutableAccessPolicy.builder()
        .language(instance.language())
        .meta(instance.meta())
        .id(instance.id())
        .resourceType(instance.resourceType())
        .implicitRules(instance.implicitRules())
        .name(instance.name())
        .resource(instance.resource())
        .compartment(instance.compartment())
        .build();
  }

  /**
   * Creates a builder for {@link AccessPolicy AccessPolicy}.
   * <pre>
   * ImmutableAccessPolicy.builder()
   *    .language(com.fhir.types.fhir.Code) // optional {@link AccessPolicy#language() language}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link AccessPolicy#meta() meta}
   *    .id(com.fhir.types.fhir.Id) // optional {@link AccessPolicy#id() id}
   *    .resourceType(String) // optional {@link AccessPolicy#resourceType() resourceType}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link AccessPolicy#implicitRules() implicitRules}
   *    .name(String) // optional {@link AccessPolicy#name() name}
   *    .resource(List&amp;lt;com.fhir.types.fhir.AccessPolicy_Resource&amp;gt;) // optional {@link AccessPolicy#resource() resource}
   *    .compartment(com.fhir.types.fhir.Reference) // optional {@link AccessPolicy#compartment() compartment}
   *    .build();
   * </pre>
   * @return A new AccessPolicy builder
   */
  public static ImmutableAccessPolicy.Builder builder() {
    return new ImmutableAccessPolicy.Builder();
  }

  /**
   * Builds instances of type {@link AccessPolicy AccessPolicy}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "AccessPolicy", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_LANGUAGE = 0x1L;
    private static final long OPT_BIT_META = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_RESOURCE_TYPE = 0x8L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x10L;
    private static final long OPT_BIT_NAME = 0x20L;
    private static final long OPT_BIT_RESOURCE = 0x40L;
    private static final long OPT_BIT_COMPARTMENT = 0x80L;
    private long optBits;

    private @Nullable Code language;
    private @Nullable Meta meta;
    private @Nullable Id id;
    private @Nullable String resourceType;
    private @Nullable Uri implicitRules;
    private @Nullable String name;
    private @Nullable List<AccessPolicy_Resource> resource;
    private @Nullable Reference compartment;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link AccessPolicy#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(Code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link AccessPolicy#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("language")
    public final Builder language(Optional<? extends Code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link AccessPolicy#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link AccessPolicy#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("meta")
    public final Builder meta(Optional<? extends Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link AccessPolicy#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(Id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link AccessPolicy#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<? extends Id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link AccessPolicy#resourceType() resourceType} to resourceType.
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
     * Initializes the optional value {@link AccessPolicy#resourceType() resourceType} to resourceType.
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
     * Initializes the optional value {@link AccessPolicy#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(Uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link AccessPolicy#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("implicitRules")
    public final Builder implicitRules(Optional<? extends Uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link AccessPolicy#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link AccessPolicy#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link AccessPolicy#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for chained invocation
     */
    public final Builder resource(List<AccessPolicy_Resource> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = Objects.requireNonNull(resource, "resource");
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link AccessPolicy#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resource")
    public final Builder resource(Optional<? extends List<AccessPolicy_Resource>> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = resource.orElse(null);
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link AccessPolicy#compartment() compartment} to compartment.
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
     * Initializes the optional value {@link AccessPolicy#compartment() compartment} to compartment.
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
     * Builds a new {@link AccessPolicy AccessPolicy}.
     * @return An immutable instance of AccessPolicy
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public AccessPolicy build() {
      return new ImmutableAccessPolicy(language, meta, id, resourceType, implicitRules, name, resource, compartment);
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (optBits & OPT_BIT_RESOURCE_TYPE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean resourceIsSet() {
      return (optBits & OPT_BIT_RESOURCE) != 0;
    }

    private boolean compartmentIsSet() {
      return (optBits & OPT_BIT_COMPARTMENT) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of AccessPolicy is strict, attribute is already set: ".concat(name));
    }
  }
}

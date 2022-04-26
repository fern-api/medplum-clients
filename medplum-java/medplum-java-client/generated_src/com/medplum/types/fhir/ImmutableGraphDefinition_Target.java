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
 * Immutable implementation of {@link GraphDefinition_Target}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableGraphDefinition_Target.builder()}.
 */
@Generated(from = "GraphDefinition_Target", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableGraphDefinition_Target implements GraphDefinition_Target {
  private final @Nullable List<GraphDefinition_Link> link;
  private final @Nullable Canonical profile;
  private final @Nullable String params;
  private final @Nullable String id;
  private final @Nullable Code type;
  private final @Nullable List<GraphDefinition_Compartment> compartment;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableGraphDefinition_Target(
      @Nullable List<GraphDefinition_Link> link,
      @Nullable Canonical profile,
      @Nullable String params,
      @Nullable String id,
      @Nullable Code type,
      @Nullable List<GraphDefinition_Compartment> compartment,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension) {
    this.link = link;
    this.profile = profile;
    this.params = params;
    this.id = id;
    this.type = type;
    this.compartment = compartment;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code link} attribute
   */
  @JsonProperty("link")
  @Override
  public Optional<List<GraphDefinition_Link>> link() {
    return Optional.ofNullable(link);
  }

  /**
   * @return The value of the {@code profile} attribute
   */
  @JsonProperty("profile")
  @Override
  public Optional<Canonical> profile() {
    return Optional.ofNullable(profile);
  }

  /**
   * @return The value of the {@code params} attribute
   */
  @JsonProperty("params")
  @Override
  public Optional<String> params() {
    return Optional.ofNullable(params);
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<Code> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code compartment} attribute
   */
  @JsonProperty("compartment")
  @Override
  public Optional<List<GraphDefinition_Compartment>> compartment() {
    return Optional.ofNullable(compartment);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Target#link() link} attribute.
   * @param value The value for link
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Target withLink(List<GraphDefinition_Link> value) {
    @Nullable List<GraphDefinition_Link> newValue = Objects.requireNonNull(value, "link");
    if (this.link == newValue) return this;
    return new ImmutableGraphDefinition_Target(
        newValue,
        this.profile,
        this.params,
        this.id,
        this.type,
        this.compartment,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Target#link() link} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for link
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition_Target withLink(Optional<? extends List<GraphDefinition_Link>> optional) {
    @Nullable List<GraphDefinition_Link> value = optional.orElse(null);
    if (this.link == value) return this;
    return new ImmutableGraphDefinition_Target(
        value,
        this.profile,
        this.params,
        this.id,
        this.type,
        this.compartment,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Target#profile() profile} attribute.
   * @param value The value for profile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Target withProfile(Canonical value) {
    @Nullable Canonical newValue = Objects.requireNonNull(value, "profile");
    if (this.profile == newValue) return this;
    return new ImmutableGraphDefinition_Target(
        this.link,
        newValue,
        this.params,
        this.id,
        this.type,
        this.compartment,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Target#profile() profile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for profile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition_Target withProfile(Optional<? extends Canonical> optional) {
    @Nullable Canonical value = optional.orElse(null);
    if (this.profile == value) return this;
    return new ImmutableGraphDefinition_Target(
        this.link,
        value,
        this.params,
        this.id,
        this.type,
        this.compartment,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Target#params() params} attribute.
   * @param value The value for params
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Target withParams(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "params");
    if (Objects.equals(this.params, newValue)) return this;
    return new ImmutableGraphDefinition_Target(
        this.link,
        this.profile,
        newValue,
        this.id,
        this.type,
        this.compartment,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Target#params() params} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for params
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Target withParams(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.params, value)) return this;
    return new ImmutableGraphDefinition_Target(
        this.link,
        this.profile,
        value,
        this.id,
        this.type,
        this.compartment,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Target#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Target withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableGraphDefinition_Target(
        this.link,
        this.profile,
        this.params,
        newValue,
        this.type,
        this.compartment,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Target#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Target withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableGraphDefinition_Target(
        this.link,
        this.profile,
        this.params,
        value,
        this.type,
        this.compartment,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Target#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Target withType(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableGraphDefinition_Target(
        this.link,
        this.profile,
        this.params,
        this.id,
        newValue,
        this.compartment,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Target#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition_Target withType(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableGraphDefinition_Target(
        this.link,
        this.profile,
        this.params,
        this.id,
        value,
        this.compartment,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Target#compartment() compartment} attribute.
   * @param value The value for compartment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Target withCompartment(List<GraphDefinition_Compartment> value) {
    @Nullable List<GraphDefinition_Compartment> newValue = Objects.requireNonNull(value, "compartment");
    if (this.compartment == newValue) return this;
    return new ImmutableGraphDefinition_Target(
        this.link,
        this.profile,
        this.params,
        this.id,
        this.type,
        newValue,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Target#compartment() compartment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for compartment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition_Target withCompartment(Optional<? extends List<GraphDefinition_Compartment>> optional) {
    @Nullable List<GraphDefinition_Compartment> value = optional.orElse(null);
    if (this.compartment == value) return this;
    return new ImmutableGraphDefinition_Target(
        this.link,
        this.profile,
        this.params,
        this.id,
        this.type,
        value,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Target#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Target withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableGraphDefinition_Target(
        this.link,
        this.profile,
        this.params,
        this.id,
        this.type,
        this.compartment,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Target#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition_Target withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableGraphDefinition_Target(
        this.link,
        this.profile,
        this.params,
        this.id,
        this.type,
        this.compartment,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Target#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Target withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableGraphDefinition_Target(
        this.link,
        this.profile,
        this.params,
        this.id,
        this.type,
        this.compartment,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Target#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition_Target withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableGraphDefinition_Target(
        this.link,
        this.profile,
        this.params,
        this.id,
        this.type,
        this.compartment,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableGraphDefinition_Target} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableGraphDefinition_Target
        && equalTo((ImmutableGraphDefinition_Target) another);
  }

  private boolean equalTo(ImmutableGraphDefinition_Target another) {
    return Objects.equals(link, another.link)
        && Objects.equals(profile, another.profile)
        && Objects.equals(params, another.params)
        && Objects.equals(id, another.id)
        && Objects.equals(type, another.type)
        && Objects.equals(compartment, another.compartment)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code link}, {@code profile}, {@code params}, {@code id}, {@code type}, {@code compartment}, {@code extension}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(link);
    h += (h << 5) + Objects.hashCode(profile);
    h += (h << 5) + Objects.hashCode(params);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(compartment);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code GraphDefinition_Target} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("GraphDefinition_Target{");
    if (link != null) {
      builder.append("link=").append(link);
    }
    if (profile != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("profile=").append(profile);
    }
    if (params != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("params=").append(params);
    }
    if (id != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (type != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (compartment != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("compartment=").append(compartment);
    }
    if (extension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "GraphDefinition_Target", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements GraphDefinition_Target {
    @Nullable Optional<List<GraphDefinition_Link>> link = Optional.empty();
    boolean linkIsSet;
    @Nullable Optional<Canonical> profile = Optional.empty();
    boolean profileIsSet;
    @Nullable Optional<String> params = Optional.empty();
    boolean paramsIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Code> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<GraphDefinition_Compartment>> compartment = Optional.empty();
    boolean compartmentIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("link")
    public void setLink(Optional<List<GraphDefinition_Link>> link) {
      this.link = link;
      this.linkIsSet = true;
    }
    @JsonProperty("profile")
    public void setProfile(Optional<Canonical> profile) {
      this.profile = profile;
      this.profileIsSet = true;
    }
    @JsonProperty("params")
    public void setParams(Optional<String> params) {
      this.params = params;
      this.paramsIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<Code> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("compartment")
    public void setCompartment(Optional<List<GraphDefinition_Compartment>> compartment) {
      this.compartment = compartment;
      this.compartmentIsSet = true;
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
    @Override
    public Optional<List<GraphDefinition_Link>> link() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Canonical> profile() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> params() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<GraphDefinition_Compartment>> compartment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableGraphDefinition_Target fromJson(Json json) {
    ImmutableGraphDefinition_Target.Builder builder = ImmutableGraphDefinition_Target.builder();
    if (json.linkIsSet) {
      builder.link(json.link);
    }
    if (json.profileIsSet) {
      builder.profile(json.profile);
    }
    if (json.paramsIsSet) {
      builder.params(json.params);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.compartmentIsSet) {
      builder.compartment(json.compartment);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
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
        .link(instance.link())
        .profile(instance.profile())
        .params(instance.params())
        .id(instance.id())
        .type(instance.type())
        .compartment(instance.compartment())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link GraphDefinition_Target GraphDefinition_Target}.
   * <pre>
   * ImmutableGraphDefinition_Target.builder()
   *    .link(List&amp;lt;com.medplum.types.fhir.GraphDefinition_Link&amp;gt;) // optional {@link GraphDefinition_Target#link() link}
   *    .profile(com.medplum.types.fhir.Canonical) // optional {@link GraphDefinition_Target#profile() profile}
   *    .params(String) // optional {@link GraphDefinition_Target#params() params}
   *    .id(String) // optional {@link GraphDefinition_Target#id() id}
   *    .type(com.medplum.types.fhir.Code) // optional {@link GraphDefinition_Target#type() type}
   *    .compartment(List&amp;lt;com.medplum.types.fhir.GraphDefinition_Compartment&amp;gt;) // optional {@link GraphDefinition_Target#compartment() compartment}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link GraphDefinition_Target#extension() extension}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link GraphDefinition_Target#modifierExtension() modifierExtension}
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
  @Generated(from = "GraphDefinition_Target", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_LINK = 0x1L;
    private static final long OPT_BIT_PROFILE = 0x2L;
    private static final long OPT_BIT_PARAMS = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_TYPE = 0x10L;
    private static final long OPT_BIT_COMPARTMENT = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private long optBits;

    private @Nullable List<GraphDefinition_Link> link;
    private @Nullable Canonical profile;
    private @Nullable String params;
    private @Nullable String id;
    private @Nullable Code type;
    private @Nullable List<GraphDefinition_Compartment> compartment;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Target#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for chained invocation
     */
    public final Builder link(List<GraphDefinition_Link> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = Objects.requireNonNull(link, "link");
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Target#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("link")
    public final Builder link(Optional<? extends List<GraphDefinition_Link>> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = link.orElse(null);
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Target#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for chained invocation
     */
    public final Builder profile(Canonical profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = Objects.requireNonNull(profile, "profile");
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Target#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("profile")
    public final Builder profile(Optional<? extends Canonical> profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = profile.orElse(null);
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Target#params() params} to params.
     * @param params The value for params
     * @return {@code this} builder for chained invocation
     */
    public final Builder params(String params) {
      checkNotIsSet(paramsIsSet(), "params");
      this.params = Objects.requireNonNull(params, "params");
      optBits |= OPT_BIT_PARAMS;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Target#params() params} to params.
     * @param params The value for params
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("params")
    public final Builder params(Optional<String> params) {
      checkNotIsSet(paramsIsSet(), "params");
      this.params = params.orElse(null);
      optBits |= OPT_BIT_PARAMS;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Target#id() id} to id.
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
     * Initializes the optional value {@link GraphDefinition_Target#id() id} to id.
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
     * Initializes the optional value {@link GraphDefinition_Target#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(Code type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Target#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends Code> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Target#compartment() compartment} to compartment.
     * @param compartment The value for compartment
     * @return {@code this} builder for chained invocation
     */
    public final Builder compartment(List<GraphDefinition_Compartment> compartment) {
      checkNotIsSet(compartmentIsSet(), "compartment");
      this.compartment = Objects.requireNonNull(compartment, "compartment");
      optBits |= OPT_BIT_COMPARTMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Target#compartment() compartment} to compartment.
     * @param compartment The value for compartment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("compartment")
    public final Builder compartment(Optional<? extends List<GraphDefinition_Compartment>> compartment) {
      checkNotIsSet(compartmentIsSet(), "compartment");
      this.compartment = compartment.orElse(null);
      optBits |= OPT_BIT_COMPARTMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Target#extension() extension} to extension.
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
     * Initializes the optional value {@link GraphDefinition_Target#extension() extension} to extension.
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
     * Initializes the optional value {@link GraphDefinition_Target#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link GraphDefinition_Target#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link GraphDefinition_Target GraphDefinition_Target}.
     * @return An immutable instance of GraphDefinition_Target
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public GraphDefinition_Target build() {
      return new ImmutableGraphDefinition_Target(link, profile, params, id, type, compartment, extension, modifierExtension);
    }

    private boolean linkIsSet() {
      return (optBits & OPT_BIT_LINK) != 0;
    }

    private boolean profileIsSet() {
      return (optBits & OPT_BIT_PROFILE) != 0;
    }

    private boolean paramsIsSet() {
      return (optBits & OPT_BIT_PARAMS) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean compartmentIsSet() {
      return (optBits & OPT_BIT_COMPARTMENT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of GraphDefinition_Target is strict, attribute is already set: ".concat(name));
    }
  }
}

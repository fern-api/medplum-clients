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
 * Immutable implementation of {@link ElementDefinition_Type}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableElementDefinition_Type.builder()}.
 */
@Generated(from = "ElementDefinition_Type", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableElementDefinition_Type implements ElementDefinition_Type {
  private final @Nullable List<Canonical> profile;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Elementdefinition_TypeAggregationItem> aggregation;
  private final @Nullable Elementdefinition_TypeVersioning versioning;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Canonical> targetProfile;
  private final @Nullable Uri code;
  private final @Nullable String id;

  private ImmutableElementDefinition_Type(
      @Nullable List<Canonical> profile,
      @Nullable List<Extension> extension,
      @Nullable List<Elementdefinition_TypeAggregationItem> aggregation,
      @Nullable Elementdefinition_TypeVersioning versioning,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Canonical> targetProfile,
      @Nullable Uri code,
      @Nullable String id) {
    this.profile = profile;
    this.extension = extension;
    this.aggregation = aggregation;
    this.versioning = versioning;
    this.modifierExtension = modifierExtension;
    this.targetProfile = targetProfile;
    this.code = code;
    this.id = id;
  }

  /**
   * @return The value of the {@code profile} attribute
   */
  @JsonProperty("profile")
  @Override
  public Optional<List<Canonical>> profile() {
    return Optional.ofNullable(profile);
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
   * @return The value of the {@code aggregation} attribute
   */
  @JsonProperty("aggregation")
  @Override
  public Optional<List<Elementdefinition_TypeAggregationItem>> aggregation() {
    return Optional.ofNullable(aggregation);
  }

  /**
   * @return The value of the {@code versioning} attribute
   */
  @JsonProperty("versioning")
  @Override
  public Optional<Elementdefinition_TypeVersioning> versioning() {
    return Optional.ofNullable(versioning);
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
   * @return The value of the {@code targetProfile} attribute
   */
  @JsonProperty("targetProfile")
  @Override
  public Optional<List<Canonical>> targetProfile() {
    return Optional.ofNullable(targetProfile);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<Uri> code() {
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Type#profile() profile} attribute.
   * @param value The value for profile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Type withProfile(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "profile");
    if (this.profile == newValue) return this;
    return new ImmutableElementDefinition_Type(
        newValue,
        this.extension,
        this.aggregation,
        this.versioning,
        this.modifierExtension,
        this.targetProfile,
        this.code,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Type#profile() profile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for profile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Type withProfile(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.profile == value) return this;
    return new ImmutableElementDefinition_Type(
        value,
        this.extension,
        this.aggregation,
        this.versioning,
        this.modifierExtension,
        this.targetProfile,
        this.code,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Type#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Type withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableElementDefinition_Type(
        this.profile,
        newValue,
        this.aggregation,
        this.versioning,
        this.modifierExtension,
        this.targetProfile,
        this.code,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Type#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Type withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableElementDefinition_Type(
        this.profile,
        value,
        this.aggregation,
        this.versioning,
        this.modifierExtension,
        this.targetProfile,
        this.code,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Type#aggregation() aggregation} attribute.
   * @param value The value for aggregation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Type withAggregation(List<Elementdefinition_TypeAggregationItem> value) {
    @Nullable List<Elementdefinition_TypeAggregationItem> newValue = Objects.requireNonNull(value, "aggregation");
    if (this.aggregation == newValue) return this;
    return new ImmutableElementDefinition_Type(
        this.profile,
        this.extension,
        newValue,
        this.versioning,
        this.modifierExtension,
        this.targetProfile,
        this.code,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Type#aggregation() aggregation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for aggregation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Type withAggregation(Optional<? extends List<Elementdefinition_TypeAggregationItem>> optional) {
    @Nullable List<Elementdefinition_TypeAggregationItem> value = optional.orElse(null);
    if (this.aggregation == value) return this;
    return new ImmutableElementDefinition_Type(
        this.profile,
        this.extension,
        value,
        this.versioning,
        this.modifierExtension,
        this.targetProfile,
        this.code,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Type#versioning() versioning} attribute.
   * @param value The value for versioning
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Type withVersioning(Elementdefinition_TypeVersioning value) {
    @Nullable Elementdefinition_TypeVersioning newValue = Objects.requireNonNull(value, "versioning");
    if (this.versioning == newValue) return this;
    return new ImmutableElementDefinition_Type(
        this.profile,
        this.extension,
        this.aggregation,
        newValue,
        this.modifierExtension,
        this.targetProfile,
        this.code,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Type#versioning() versioning} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for versioning
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Type withVersioning(Optional<? extends Elementdefinition_TypeVersioning> optional) {
    @Nullable Elementdefinition_TypeVersioning value = optional.orElse(null);
    if (this.versioning == value) return this;
    return new ImmutableElementDefinition_Type(
        this.profile,
        this.extension,
        this.aggregation,
        value,
        this.modifierExtension,
        this.targetProfile,
        this.code,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Type#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Type withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableElementDefinition_Type(
        this.profile,
        this.extension,
        this.aggregation,
        this.versioning,
        newValue,
        this.targetProfile,
        this.code,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Type#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Type withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableElementDefinition_Type(
        this.profile,
        this.extension,
        this.aggregation,
        this.versioning,
        value,
        this.targetProfile,
        this.code,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Type#targetProfile() targetProfile} attribute.
   * @param value The value for targetProfile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Type withTargetProfile(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "targetProfile");
    if (this.targetProfile == newValue) return this;
    return new ImmutableElementDefinition_Type(
        this.profile,
        this.extension,
        this.aggregation,
        this.versioning,
        this.modifierExtension,
        newValue,
        this.code,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Type#targetProfile() targetProfile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for targetProfile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Type withTargetProfile(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.targetProfile == value) return this;
    return new ImmutableElementDefinition_Type(
        this.profile,
        this.extension,
        this.aggregation,
        this.versioning,
        this.modifierExtension,
        value,
        this.code,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Type#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Type withCode(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableElementDefinition_Type(
        this.profile,
        this.extension,
        this.aggregation,
        this.versioning,
        this.modifierExtension,
        this.targetProfile,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Type#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Type withCode(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableElementDefinition_Type(
        this.profile,
        this.extension,
        this.aggregation,
        this.versioning,
        this.modifierExtension,
        this.targetProfile,
        value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Type#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Type withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableElementDefinition_Type(
        this.profile,
        this.extension,
        this.aggregation,
        this.versioning,
        this.modifierExtension,
        this.targetProfile,
        this.code,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Type#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Type withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableElementDefinition_Type(
        this.profile,
        this.extension,
        this.aggregation,
        this.versioning,
        this.modifierExtension,
        this.targetProfile,
        this.code,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableElementDefinition_Type} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableElementDefinition_Type
        && equalTo((ImmutableElementDefinition_Type) another);
  }

  private boolean equalTo(ImmutableElementDefinition_Type another) {
    return Objects.equals(profile, another.profile)
        && Objects.equals(extension, another.extension)
        && Objects.equals(aggregation, another.aggregation)
        && Objects.equals(versioning, another.versioning)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(targetProfile, another.targetProfile)
        && Objects.equals(code, another.code)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code profile}, {@code extension}, {@code aggregation}, {@code versioning}, {@code modifierExtension}, {@code targetProfile}, {@code code}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(profile);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(aggregation);
    h += (h << 5) + Objects.hashCode(versioning);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(targetProfile);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code ElementDefinition_Type} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ElementDefinition_Type{");
    if (profile != null) {
      builder.append("profile=").append(profile);
    }
    if (extension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (aggregation != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("aggregation=").append(aggregation);
    }
    if (versioning != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("versioning=").append(versioning);
    }
    if (modifierExtension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (targetProfile != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("targetProfile=").append(targetProfile);
    }
    if (code != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (id != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ElementDefinition_Type", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ElementDefinition_Type {
    @Nullable Optional<List<Canonical>> profile = Optional.empty();
    boolean profileIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Elementdefinition_TypeAggregationItem>> aggregation = Optional.empty();
    boolean aggregationIsSet;
    @Nullable Optional<Elementdefinition_TypeVersioning> versioning = Optional.empty();
    boolean versioningIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Canonical>> targetProfile = Optional.empty();
    boolean targetProfileIsSet;
    @Nullable Optional<Uri> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("profile")
    public void setProfile(Optional<List<Canonical>> profile) {
      this.profile = profile;
      this.profileIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("aggregation")
    public void setAggregation(Optional<List<Elementdefinition_TypeAggregationItem>> aggregation) {
      this.aggregation = aggregation;
      this.aggregationIsSet = true;
    }
    @JsonProperty("versioning")
    public void setVersioning(Optional<Elementdefinition_TypeVersioning> versioning) {
      this.versioning = versioning;
      this.versioningIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("targetProfile")
    public void setTargetProfile(Optional<List<Canonical>> targetProfile) {
      this.targetProfile = targetProfile;
      this.targetProfileIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<Uri> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<List<Canonical>> profile() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Elementdefinition_TypeAggregationItem>> aggregation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Elementdefinition_TypeVersioning> versioning() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Canonical>> targetProfile() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableElementDefinition_Type fromJson(Json json) {
    ImmutableElementDefinition_Type.Builder builder = ImmutableElementDefinition_Type.builder();
    if (json.profileIsSet) {
      builder.profile(json.profile);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.aggregationIsSet) {
      builder.aggregation(json.aggregation);
    }
    if (json.versioningIsSet) {
      builder.versioning(json.versioning);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.targetProfileIsSet) {
      builder.targetProfile(json.targetProfile);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableElementDefinition_Type) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ElementDefinition_Type} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ElementDefinition_Type instance
   */
  public static ElementDefinition_Type copyOf(ElementDefinition_Type instance) {
    if (instance instanceof ImmutableElementDefinition_Type) {
      return (ImmutableElementDefinition_Type) instance;
    }
    return ImmutableElementDefinition_Type.builder()
        .profile(instance.profile())
        .extension(instance.extension())
        .aggregation(instance.aggregation())
        .versioning(instance.versioning())
        .modifierExtension(instance.modifierExtension())
        .targetProfile(instance.targetProfile())
        .code(instance.code())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link ElementDefinition_Type ElementDefinition_Type}.
   * <pre>
   * ImmutableElementDefinition_Type.builder()
   *    .profile(List&amp;lt;com.fhir.types.fhir.Canonical&amp;gt;) // optional {@link ElementDefinition_Type#profile() profile}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ElementDefinition_Type#extension() extension}
   *    .aggregation(List&amp;lt;Elementdefinition_TypeAggregationItem&amp;gt;) // optional {@link ElementDefinition_Type#aggregation() aggregation}
   *    .versioning(Elementdefinition_TypeVersioning) // optional {@link ElementDefinition_Type#versioning() versioning}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ElementDefinition_Type#modifierExtension() modifierExtension}
   *    .targetProfile(List&amp;lt;com.fhir.types.fhir.Canonical&amp;gt;) // optional {@link ElementDefinition_Type#targetProfile() targetProfile}
   *    .code(com.fhir.types.fhir.Uri) // optional {@link ElementDefinition_Type#code() code}
   *    .id(String) // optional {@link ElementDefinition_Type#id() id}
   *    .build();
   * </pre>
   * @return A new ElementDefinition_Type builder
   */
  public static ImmutableElementDefinition_Type.Builder builder() {
    return new ImmutableElementDefinition_Type.Builder();
  }

  /**
   * Builds instances of type {@link ElementDefinition_Type ElementDefinition_Type}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ElementDefinition_Type", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_PROFILE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_AGGREGATION = 0x4L;
    private static final long OPT_BIT_VERSIONING = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_TARGET_PROFILE = 0x20L;
    private static final long OPT_BIT_CODE = 0x40L;
    private static final long OPT_BIT_ID = 0x80L;
    private long optBits;

    private @Nullable List<Canonical> profile;
    private @Nullable List<Extension> extension;
    private @Nullable List<Elementdefinition_TypeAggregationItem> aggregation;
    private @Nullable Elementdefinition_TypeVersioning versioning;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Canonical> targetProfile;
    private @Nullable Uri code;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Type#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for chained invocation
     */
    public final Builder profile(List<Canonical> profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = Objects.requireNonNull(profile, "profile");
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Type#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("profile")
    public final Builder profile(Optional<? extends List<Canonical>> profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = profile.orElse(null);
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Type#extension() extension} to extension.
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
     * Initializes the optional value {@link ElementDefinition_Type#extension() extension} to extension.
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
     * Initializes the optional value {@link ElementDefinition_Type#aggregation() aggregation} to aggregation.
     * @param aggregation The value for aggregation
     * @return {@code this} builder for chained invocation
     */
    public final Builder aggregation(List<Elementdefinition_TypeAggregationItem> aggregation) {
      checkNotIsSet(aggregationIsSet(), "aggregation");
      this.aggregation = Objects.requireNonNull(aggregation, "aggregation");
      optBits |= OPT_BIT_AGGREGATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Type#aggregation() aggregation} to aggregation.
     * @param aggregation The value for aggregation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("aggregation")
    public final Builder aggregation(Optional<? extends List<Elementdefinition_TypeAggregationItem>> aggregation) {
      checkNotIsSet(aggregationIsSet(), "aggregation");
      this.aggregation = aggregation.orElse(null);
      optBits |= OPT_BIT_AGGREGATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Type#versioning() versioning} to versioning.
     * @param versioning The value for versioning
     * @return {@code this} builder for chained invocation
     */
    public final Builder versioning(Elementdefinition_TypeVersioning versioning) {
      checkNotIsSet(versioningIsSet(), "versioning");
      this.versioning = Objects.requireNonNull(versioning, "versioning");
      optBits |= OPT_BIT_VERSIONING;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Type#versioning() versioning} to versioning.
     * @param versioning The value for versioning
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("versioning")
    public final Builder versioning(Optional<? extends Elementdefinition_TypeVersioning> versioning) {
      checkNotIsSet(versioningIsSet(), "versioning");
      this.versioning = versioning.orElse(null);
      optBits |= OPT_BIT_VERSIONING;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Type#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ElementDefinition_Type#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ElementDefinition_Type#targetProfile() targetProfile} to targetProfile.
     * @param targetProfile The value for targetProfile
     * @return {@code this} builder for chained invocation
     */
    public final Builder targetProfile(List<Canonical> targetProfile) {
      checkNotIsSet(targetProfileIsSet(), "targetProfile");
      this.targetProfile = Objects.requireNonNull(targetProfile, "targetProfile");
      optBits |= OPT_BIT_TARGET_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Type#targetProfile() targetProfile} to targetProfile.
     * @param targetProfile The value for targetProfile
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("targetProfile")
    public final Builder targetProfile(Optional<? extends List<Canonical>> targetProfile) {
      checkNotIsSet(targetProfileIsSet(), "targetProfile");
      this.targetProfile = targetProfile.orElse(null);
      optBits |= OPT_BIT_TARGET_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Type#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(Uri code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Type#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends Uri> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Type#id() id} to id.
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
     * Initializes the optional value {@link ElementDefinition_Type#id() id} to id.
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
     * Builds a new {@link ElementDefinition_Type ElementDefinition_Type}.
     * @return An immutable instance of ElementDefinition_Type
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ElementDefinition_Type build() {
      return new ImmutableElementDefinition_Type(profile, extension, aggregation, versioning, modifierExtension, targetProfile, code, id);
    }

    private boolean profileIsSet() {
      return (optBits & OPT_BIT_PROFILE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean aggregationIsSet() {
      return (optBits & OPT_BIT_AGGREGATION) != 0;
    }

    private boolean versioningIsSet() {
      return (optBits & OPT_BIT_VERSIONING) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean targetProfileIsSet() {
      return (optBits & OPT_BIT_TARGET_PROFILE) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ElementDefinition_Type is strict, attribute is already set: ".concat(name));
    }
  }
}

package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link ImplementationGuide_DependsOn}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImplementationGuide_DependsOn.builder()}.
 */
@Generated(from = "ImplementationGuide_DependsOn", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImplementationGuide_DependsOn
    implements ImplementationGuide_DependsOn {
  private final @Nullable String version;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final Canonical uri;
  private final @Nullable Id packageId;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableImplementationGuide_DependsOn(
      @Nullable String version,
      @Nullable List<Extension> extension,
      @Nullable String id,
      Canonical uri,
      @Nullable Id packageId,
      @Nullable List<Extension> modifierExtension) {
    this.version = version;
    this.extension = extension;
    this.id = id;
    this.uri = uri;
    this.packageId = packageId;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  public Optional<String> version() {
    return Optional.ofNullable(version);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code uri} attribute
   */
  @JsonProperty("uri")
  @Override
  public Canonical uri() {
    return uri;
  }

  /**
   * @return The value of the {@code packageId} attribute
   */
  @JsonProperty("packageId")
  @Override
  public Optional<Id> packageId() {
    return Optional.ofNullable(packageId);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_DependsOn#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_DependsOn withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutableImplementationGuide_DependsOn(newValue, this.extension, this.id, this.uri, this.packageId, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_DependsOn#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_DependsOn withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutableImplementationGuide_DependsOn(value, this.extension, this.id, this.uri, this.packageId, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_DependsOn#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_DependsOn withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImplementationGuide_DependsOn(this.version, newValue, this.id, this.uri, this.packageId, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_DependsOn#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_DependsOn withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImplementationGuide_DependsOn(this.version, value, this.id, this.uri, this.packageId, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_DependsOn#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_DependsOn withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableImplementationGuide_DependsOn(this.version, this.extension, newValue, this.uri, this.packageId, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_DependsOn#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_DependsOn withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableImplementationGuide_DependsOn(this.version, this.extension, value, this.uri, this.packageId, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImplementationGuide_DependsOn#uri() uri} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for uri
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImplementationGuide_DependsOn withUri(Canonical value) {
    if (this.uri == value) return this;
    Canonical newValue = Objects.requireNonNull(value, "uri");
    return new ImmutableImplementationGuide_DependsOn(this.version, this.extension, this.id, newValue, this.packageId, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_DependsOn#packageId() packageId} attribute.
   * @param value The value for packageId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_DependsOn withPackageId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "packageId");
    if (this.packageId == newValue) return this;
    return new ImmutableImplementationGuide_DependsOn(this.version, this.extension, this.id, this.uri, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_DependsOn#packageId() packageId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for packageId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_DependsOn withPackageId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.packageId == value) return this;
    return new ImmutableImplementationGuide_DependsOn(this.version, this.extension, this.id, this.uri, value, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_DependsOn#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_DependsOn withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImplementationGuide_DependsOn(this.version, this.extension, this.id, this.uri, this.packageId, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_DependsOn#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_DependsOn withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImplementationGuide_DependsOn(this.version, this.extension, this.id, this.uri, this.packageId, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImplementationGuide_DependsOn} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImplementationGuide_DependsOn
        && equalTo((ImmutableImplementationGuide_DependsOn) another);
  }

  private boolean equalTo(ImmutableImplementationGuide_DependsOn another) {
    return Objects.equals(version, another.version)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && uri.equals(another.uri)
        && Objects.equals(packageId, another.packageId)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code version}, {@code extension}, {@code id}, {@code uri}, {@code packageId}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + uri.hashCode();
    h += (h << 5) + Objects.hashCode(packageId);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code ImplementationGuide_DependsOn} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ImplementationGuide_DependsOn{");
    if (version != null) {
      builder.append("version=").append(version);
    }
    if (extension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (builder.length() > 30) builder.append(", ");
    builder.append("uri=").append(uri);
    if (packageId != null) {
      builder.append(", ");
      builder.append("packageId=").append(packageId);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ImplementationGuide_DependsOn", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ImplementationGuide_DependsOn {
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Canonical uri;
    @Nullable Optional<Id> packageId = Optional.empty();
    boolean packageIdIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("uri")
    public void setUri(Canonical uri) {
      this.uri = uri;
    }
    @JsonProperty("packageId")
    public void setPackageId(Optional<Id> packageId) {
      this.packageId = packageId;
      this.packageIdIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Canonical uri() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> packageId() { throw new UnsupportedOperationException(); }
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
  static ImmutableImplementationGuide_DependsOn fromJson(Json json) {
    ImmutableImplementationGuide_DependsOn.Builder builder = ((ImmutableImplementationGuide_DependsOn.Builder) ImmutableImplementationGuide_DependsOn.builder());
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.uri != null) {
      builder.uri(json.uri);
    }
    if (json.packageIdIsSet) {
      builder.packageId(json.packageId);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableImplementationGuide_DependsOn) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ImplementationGuide_DependsOn} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ImplementationGuide_DependsOn instance
   */
  public static ImplementationGuide_DependsOn copyOf(ImplementationGuide_DependsOn instance) {
    if (instance instanceof ImmutableImplementationGuide_DependsOn) {
      return (ImmutableImplementationGuide_DependsOn) instance;
    }
    return ((ImmutableImplementationGuide_DependsOn.Builder) ImmutableImplementationGuide_DependsOn.builder())
        .version(instance.version())
        .extension(instance.extension())
        .id(instance.id())
        .uri(instance.uri())
        .packageId(instance.packageId())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link ImplementationGuide_DependsOn ImplementationGuide_DependsOn}.
   * <pre>
   * ImmutableImplementationGuide_DependsOn.builder()
   *    .version(String) // optional {@link ImplementationGuide_DependsOn#version() version}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ImplementationGuide_DependsOn#extension() extension}
   *    .id(String) // optional {@link ImplementationGuide_DependsOn#id() id}
   *    .uri(com.fhir.types.fhir.Canonical) // required {@link ImplementationGuide_DependsOn#uri() uri}
   *    .packageId(com.fhir.types.fhir.Id) // optional {@link ImplementationGuide_DependsOn#packageId() packageId}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ImplementationGuide_DependsOn#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new ImplementationGuide_DependsOn builder
   */
  public static UriBuildStage builder() {
    return new ImmutableImplementationGuide_DependsOn.Builder();
  }

  /**
   * Builds instances of type {@link ImplementationGuide_DependsOn ImplementationGuide_DependsOn}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ImplementationGuide_DependsOn", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements UriBuildStage, BuildFinal {
    private static final long INIT_BIT_URI = 0x1L;
    private static final long OPT_BIT_VERSION = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_PACKAGE_ID = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String version;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable Canonical uri;
    private @Nullable Id packageId;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(String version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = Objects.requireNonNull(version, "version");
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("version")
    public final Builder version(Optional<String> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = version.orElse(null);
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#extension() extension} to extension.
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
     * Initializes the optional value {@link ImplementationGuide_DependsOn#extension() extension} to extension.
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
     * Initializes the optional value {@link ImplementationGuide_DependsOn#id() id} to id.
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
     * Initializes the optional value {@link ImplementationGuide_DependsOn#id() id} to id.
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
     * Initializes the value for the {@link ImplementationGuide_DependsOn#uri() uri} attribute.
     * @param uri The value for uri 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("uri")
    public final Builder uri(Canonical uri) {
      checkNotIsSet(uriIsSet(), "uri");
      this.uri = Objects.requireNonNull(uri, "uri");
      initBits &= ~INIT_BIT_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#packageId() packageId} to packageId.
     * @param packageId The value for packageId
     * @return {@code this} builder for chained invocation
     */
    public final Builder packageId(Id packageId) {
      checkNotIsSet(packageIdIsSet(), "packageId");
      this.packageId = Objects.requireNonNull(packageId, "packageId");
      optBits |= OPT_BIT_PACKAGE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#packageId() packageId} to packageId.
     * @param packageId The value for packageId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("packageId")
    public final Builder packageId(Optional<? extends Id> packageId) {
      checkNotIsSet(packageIdIsSet(), "packageId");
      this.packageId = packageId.orElse(null);
      optBits |= OPT_BIT_PACKAGE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImplementationGuide_DependsOn#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link ImplementationGuide_DependsOn ImplementationGuide_DependsOn}.
     * @return An immutable instance of ImplementationGuide_DependsOn
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImplementationGuide_DependsOn build() {
      checkRequiredAttributes();
      return new ImmutableImplementationGuide_DependsOn(version, extension, id, uri, packageId, modifierExtension);
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean packageIdIsSet() {
      return (optBits & OPT_BIT_PACKAGE_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean uriIsSet() {
      return (initBits & INIT_BIT_URI) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ImplementationGuide_DependsOn is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!uriIsSet()) attributes.add("uri");
      return "Cannot build ImplementationGuide_DependsOn, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ImplementationGuide_DependsOn", generator = "Immutables")
  public interface UriBuildStage {
    /**
     * Initializes the value for the {@link ImplementationGuide_DependsOn#uri() uri} attribute.
     * @param uri The value for uri 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal uri(Canonical uri);
  }

  @Generated(from = "ImplementationGuide_DependsOn", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(String version);

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(Optional<String> version);

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#packageId() packageId} to packageId.
     * @param packageId The value for packageId
     * @return {@code this} builder for chained invocation
     */
    BuildFinal packageId(Id packageId);

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#packageId() packageId} to packageId.
     * @param packageId The value for packageId
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal packageId(Optional<? extends Id> packageId);

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link ImplementationGuide_DependsOn ImplementationGuide_DependsOn}.
     * @return An immutable instance of ImplementationGuide_DependsOn
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ImplementationGuide_DependsOn build();
  }
}

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
 * Immutable implementation of {@link TestScript_Fixture}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTestScript_Fixture.builder()}.
 */
@Generated(from = "TestScript_Fixture", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTestScript_Fixture implements TestScript_Fixture {
  private final @Nullable Boolean autodelete;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Reference resource;
  private final @Nullable List<Extension> extension;
  private final @Nullable Boolean autocreate;

  private ImmutableTestScript_Fixture(
      @Nullable Boolean autodelete,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable Reference resource,
      @Nullable List<Extension> extension,
      @Nullable Boolean autocreate) {
    this.autodelete = autodelete;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.resource = resource;
    this.extension = extension;
    this.autocreate = autocreate;
  }

  /**
   * @return The value of the {@code autodelete} attribute
   */
  @JsonProperty("autodelete")
  @Override
  public Optional<Boolean> autodelete() {
    return Optional.ofNullable(autodelete);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code resource} attribute
   */
  @JsonProperty("resource")
  @Override
  public Optional<Reference> resource() {
    return Optional.ofNullable(resource);
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
   * @return The value of the {@code autocreate} attribute
   */
  @JsonProperty("autocreate")
  @Override
  public Optional<Boolean> autocreate() {
    return Optional.ofNullable(autocreate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Fixture#autodelete() autodelete} attribute.
   * @param value The value for autodelete
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Fixture withAutodelete(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.autodelete, newValue)) return this;
    return new ImmutableTestScript_Fixture(newValue, this.id, this.modifierExtension, this.resource, this.extension, this.autocreate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Fixture#autodelete() autodelete} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for autodelete
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Fixture withAutodelete(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.autodelete, value)) return this;
    return new ImmutableTestScript_Fixture(value, this.id, this.modifierExtension, this.resource, this.extension, this.autocreate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Fixture#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Fixture withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableTestScript_Fixture(
        this.autodelete,
        newValue,
        this.modifierExtension,
        this.resource,
        this.extension,
        this.autocreate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Fixture#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Fixture withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableTestScript_Fixture(this.autodelete, value, this.modifierExtension, this.resource, this.extension, this.autocreate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Fixture#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Fixture withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTestScript_Fixture(this.autodelete, this.id, newValue, this.resource, this.extension, this.autocreate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Fixture#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Fixture withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTestScript_Fixture(this.autodelete, this.id, value, this.resource, this.extension, this.autocreate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Fixture#resource() resource} attribute.
   * @param value The value for resource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Fixture withResource(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "resource");
    if (this.resource == newValue) return this;
    return new ImmutableTestScript_Fixture(this.autodelete, this.id, this.modifierExtension, newValue, this.extension, this.autocreate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Fixture#resource() resource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Fixture withResource(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.resource == value) return this;
    return new ImmutableTestScript_Fixture(this.autodelete, this.id, this.modifierExtension, value, this.extension, this.autocreate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Fixture#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Fixture withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTestScript_Fixture(this.autodelete, this.id, this.modifierExtension, this.resource, newValue, this.autocreate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Fixture#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Fixture withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTestScript_Fixture(this.autodelete, this.id, this.modifierExtension, this.resource, value, this.autocreate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Fixture#autocreate() autocreate} attribute.
   * @param value The value for autocreate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Fixture withAutocreate(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.autocreate, newValue)) return this;
    return new ImmutableTestScript_Fixture(this.autodelete, this.id, this.modifierExtension, this.resource, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Fixture#autocreate() autocreate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for autocreate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Fixture withAutocreate(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.autocreate, value)) return this;
    return new ImmutableTestScript_Fixture(this.autodelete, this.id, this.modifierExtension, this.resource, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTestScript_Fixture} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTestScript_Fixture
        && equalTo((ImmutableTestScript_Fixture) another);
  }

  private boolean equalTo(ImmutableTestScript_Fixture another) {
    return Objects.equals(autodelete, another.autodelete)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(resource, another.resource)
        && Objects.equals(extension, another.extension)
        && Objects.equals(autocreate, another.autocreate);
  }

  /**
   * Computes a hash code from attributes: {@code autodelete}, {@code id}, {@code modifierExtension}, {@code resource}, {@code extension}, {@code autocreate}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(autodelete);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(resource);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(autocreate);
    return h;
  }

  /**
   * Prints the immutable value {@code TestScript_Fixture} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("TestScript_Fixture{");
    if (autodelete != null) {
      builder.append("autodelete=").append(autodelete);
    }
    if (id != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (resource != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("resource=").append(resource);
    }
    if (extension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (autocreate != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("autocreate=").append(autocreate);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "TestScript_Fixture", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TestScript_Fixture {
    @Nullable Optional<Boolean> autodelete = Optional.empty();
    boolean autodeleteIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Reference> resource = Optional.empty();
    boolean resourceIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Boolean> autocreate = Optional.empty();
    boolean autocreateIsSet;
    @JsonProperty("autodelete")
    public void setAutodelete(Optional<Boolean> autodelete) {
      this.autodelete = autodelete;
      this.autodeleteIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("resource")
    public void setResource(Optional<Reference> resource) {
      this.resource = resource;
      this.resourceIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("autocreate")
    public void setAutocreate(Optional<Boolean> autocreate) {
      this.autocreate = autocreate;
      this.autocreateIsSet = true;
    }
    @Override
    public Optional<Boolean> autodelete() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> resource() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> autocreate() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTestScript_Fixture fromJson(Json json) {
    ImmutableTestScript_Fixture.Builder builder = ImmutableTestScript_Fixture.builder();
    if (json.autodeleteIsSet) {
      builder.autodelete(json.autodelete);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.resourceIsSet) {
      builder.resource(json.resource);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.autocreateIsSet) {
      builder.autocreate(json.autocreate);
    }
    return (ImmutableTestScript_Fixture) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TestScript_Fixture} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TestScript_Fixture instance
   */
  public static TestScript_Fixture copyOf(TestScript_Fixture instance) {
    if (instance instanceof ImmutableTestScript_Fixture) {
      return (ImmutableTestScript_Fixture) instance;
    }
    return ImmutableTestScript_Fixture.builder()
        .autodelete(instance.autodelete())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .resource(instance.resource())
        .extension(instance.extension())
        .autocreate(instance.autocreate())
        .build();
  }

  /**
   * Creates a builder for {@link TestScript_Fixture TestScript_Fixture}.
   * <pre>
   * ImmutableTestScript_Fixture.builder()
   *    .autodelete(Boolean) // optional {@link TestScript_Fixture#autodelete() autodelete}
   *    .id(String) // optional {@link TestScript_Fixture#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TestScript_Fixture#modifierExtension() modifierExtension}
   *    .resource(com.fhir.Reference) // optional {@link TestScript_Fixture#resource() resource}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TestScript_Fixture#extension() extension}
   *    .autocreate(Boolean) // optional {@link TestScript_Fixture#autocreate() autocreate}
   *    .build();
   * </pre>
   * @return A new TestScript_Fixture builder
   */
  public static ImmutableTestScript_Fixture.Builder builder() {
    return new ImmutableTestScript_Fixture.Builder();
  }

  /**
   * Builds instances of type {@link TestScript_Fixture TestScript_Fixture}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "TestScript_Fixture", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_AUTODELETE = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_RESOURCE = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_AUTOCREATE = 0x20L;
    private long optBits;

    private @Nullable Boolean autodelete;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference resource;
    private @Nullable List<Extension> extension;
    private @Nullable Boolean autocreate;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TestScript_Fixture#autodelete() autodelete} to autodelete.
     * @param autodelete The value for autodelete
     * @return {@code this} builder for chained invocation
     */
    public final Builder autodelete(boolean autodelete) {
      checkNotIsSet(autodeleteIsSet(), "autodelete");
      this.autodelete = autodelete;
      optBits |= OPT_BIT_AUTODELETE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Fixture#autodelete() autodelete} to autodelete.
     * @param autodelete The value for autodelete
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("autodelete")
    public final Builder autodelete(Optional<Boolean> autodelete) {
      checkNotIsSet(autodeleteIsSet(), "autodelete");
      this.autodelete = autodelete.orElse(null);
      optBits |= OPT_BIT_AUTODELETE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Fixture#id() id} to id.
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
     * Initializes the optional value {@link TestScript_Fixture#id() id} to id.
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
     * Initializes the optional value {@link TestScript_Fixture#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestScript_Fixture#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestScript_Fixture#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for chained invocation
     */
    public final Builder resource(Reference resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = Objects.requireNonNull(resource, "resource");
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Fixture#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resource")
    public final Builder resource(Optional<? extends Reference> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = resource.orElse(null);
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Fixture#extension() extension} to extension.
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
     * Initializes the optional value {@link TestScript_Fixture#extension() extension} to extension.
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
     * Initializes the optional value {@link TestScript_Fixture#autocreate() autocreate} to autocreate.
     * @param autocreate The value for autocreate
     * @return {@code this} builder for chained invocation
     */
    public final Builder autocreate(boolean autocreate) {
      checkNotIsSet(autocreateIsSet(), "autocreate");
      this.autocreate = autocreate;
      optBits |= OPT_BIT_AUTOCREATE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Fixture#autocreate() autocreate} to autocreate.
     * @param autocreate The value for autocreate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("autocreate")
    public final Builder autocreate(Optional<Boolean> autocreate) {
      checkNotIsSet(autocreateIsSet(), "autocreate");
      this.autocreate = autocreate.orElse(null);
      optBits |= OPT_BIT_AUTOCREATE;
      return this;
    }

    /**
     * Builds a new {@link TestScript_Fixture TestScript_Fixture}.
     * @return An immutable instance of TestScript_Fixture
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public TestScript_Fixture build() {
      return new ImmutableTestScript_Fixture(autodelete, id, modifierExtension, resource, extension, autocreate);
    }

    private boolean autodeleteIsSet() {
      return (optBits & OPT_BIT_AUTODELETE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean resourceIsSet() {
      return (optBits & OPT_BIT_RESOURCE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean autocreateIsSet() {
      return (optBits & OPT_BIT_AUTOCREATE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of TestScript_Fixture is strict, attribute is already set: ".concat(name));
    }
  }
}
